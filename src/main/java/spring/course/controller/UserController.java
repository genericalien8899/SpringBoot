package spring.course.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.course.model.UserModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private Map<String , UserModel> userMap = new HashMap<>();

    // Initiated as a constructor so gets executed automatically
    public UserController() {
        userMap.put("Kishore",new UserModel("Kishorekumar","Parthipan",8899));
        userMap.put("Pedro",new UserModel("Pedro","Pascal",6969));
    }

    // GetMapping is used to value from application and send to page.
    @GetMapping("/getUser/{userName}")
    public UserModel getUser(@PathVariable String userName) {
        return userMap.get(userName);
    }

    // Code added on own not from project. Issues faced : Return type was initially written as List which was giving compilation error, changed it to ArrayList fixed the error)
    // Always make sure of the caps and small lets in GetMapping location or will result in  404 not found error
    @GetMapping("/getAllUsers")
    public ArrayList<UserModel> getAllUsers() {
        System.out.println("Inside getAllUsers()");
        return new ArrayList<UserModel>(userMap.values());
    }

    // PostMapping is used to get input from page and use it in application
    @PostMapping("/addUser")
    public ResponseEntity<HttpStatus> createUser (@RequestBody UserModel user) {
        userMap.put(user.getFirstname(),user);
        return ResponseEntity.accepted().build();
    }

}