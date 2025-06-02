package spring.course.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.course.model.UserModel;
import spring.course.services.UserServiceImpl;

import java.util.Optional;

@RestController
public class UserController {

    private UserServiceImpl service;

    public UserController(@Qualifier("primary") UserServiceImpl userService) {
        this.service = userService;
    }

    // GetMapping is used to value from application and send to page.
    @GetMapping("/getUser/{userName}")
    public ResponseEntity<UserModel> getUser(@PathVariable String userName){
        return ResponseEntity.of(Optional.ofNullable(service.getUser(userName)));  // .of throws null error when null. Changing it to .ofNullable
    }

    // Always make sure of the caps and small lets in GetMapping location or will result in  404 not found error
    // PostMapping is used to get input from page and use it in application : Staus 200 is accepted
    @PostMapping("/addUser")
    public ResponseEntity<HttpStatus> createUser (@RequestBody UserModel user){
        service.addUser(user);
        return ResponseEntity.accepted().build();
    }

    // DeleteMapping is a seperate annotaion just like PostMapping. Status 204 is No content
    @DeleteMapping("/deleteUser/{username}")
    public ResponseEntity<HttpStatus> deleteUser (@PathVariable String username){
        service.deleteUser(username);
        return ResponseEntity.noContent().build();
    }

}


// Controller is responsible for giving last html webpage or response.
// Service is used to apply business logic or fetch data from database.
// cd C:\Users\kisho\IdeaProjects\spring-boot-course
// 02-Jun-2025 sick, unable to complete. To continue.