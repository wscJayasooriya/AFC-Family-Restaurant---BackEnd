package lk.ijse.spring.admin.service;

import lk.ijse.spring.admin.dto.UserDTO;

public interface UserService {

    boolean canAuthenticate(String user_Name, String user_Password);

    boolean saveUser(UserDTO userDTO);

}
