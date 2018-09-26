package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.UserDTO;
import lk.ijse.spring.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value="api/v1/login", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody UserDTO user){
        return userService.canAuthenticate(user.getUser_Name(), user.getUser_Password());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveUser(@RequestBody UserDTO user) {
        return userService.saveUser(user);
    }

}
