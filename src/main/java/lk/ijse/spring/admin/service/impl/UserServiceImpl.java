package lk.ijse.spring.admin.service.impl;

import lk.ijse.spring.admin.dto.UserDTO;
import lk.ijse.spring.admin.entity.User;
import lk.ijse.spring.admin.repository.UserRepository;
import lk.ijse.spring.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean canAuthenticate(String user_Name, String user_Password) {

        boolean exists=userRepository.existsById(user_Name);

        if(!exists){
            return false;
        }

        User user = userRepository.findById(user_Name).get();

        return user.getUser_Password().equals(user_Password);
    }

    @Override
    public boolean saveUser(UserDTO userDTO) {
        User user=new User(userDTO.getUser_Name(),
                userDTO.getUser_Password(),
                userDTO.getUser_NIC(),
                userDTO.getUser_Tele());

        userRepository.save(user);

        return true;
    }
}
