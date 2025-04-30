package com.divyan.porcoms_backend.Services;

import com.divyan.porcoms_backend.Models.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LoginService {


    private List<User> users= Arrays.asList(
            new User(1,"Divyan","0000","divyan@gmail.com"),
            new User(2,"test","0000","test@mail.com"),
            new User(3,"super admin","0000","superadmin@mail.com"),
            new User(4,"jhon doe","0000","johndoe@mail.com")
    );


    public User login(String mail,String password){

        User loggedUser=null;
        loggedUser=users.stream()
                .filter(user -> user.getEmail().equals(mail) && user.getPassword().equals(password)).findFirst().orElse(null);
        return loggedUser;
    }


}
