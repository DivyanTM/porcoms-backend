package com.divyan.porcoms_backend.Controller;


import com.divyan.porcoms_backend.Models.LoginRequest;
import com.divyan.porcoms_backend.Models.User;
import com.divyan.porcoms_backend.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody LoginRequest loginRequest) {

        if(loginRequest.getEmail()==null || loginRequest.getPassword() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username or password is incorrect");
        }

        User user=loginService.login(loginRequest.getEmail(), loginRequest.getPassword());
        if(user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Username or password is incorrect");
        }
        return ResponseEntity.status(200).body(user);

    }

}
