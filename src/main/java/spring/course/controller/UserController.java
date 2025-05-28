package spring.course.controller;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.course.model.UserModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {



    // GetMapping is used to value from application and send to page.
    @GetMapping("/getUser/{userName}")
    public ResponseEntity<UserModel> getUser(@PathVariable String userName){
        if(userMap.containsKey(userName)){
            return ResponseEntity.of(Optional.of(userMap.get(userName)));
        }
        else{
            return ResponseEntity.notFound().build();
        }

    }

    // Code added on own not from project. Issues faced : Return type was initially written as List which was giving compilation error, changed it to ArrayList fixed the error)
    // Always make sure of the caps and small lets in GetMapping location or will result in  404 not found error
    @GetMapping("/getAllUsers")
    public ArrayList<UserModel> getAllUsers(){
        System.out.println("Inside getAllUsers()");
        return new ArrayList<UserModel>(userMap.values());
    }

    // PostMapping is used to get input from page and use it in application : Staus 200 is accepted
    @PostMapping("/addUser")
    public ResponseEntity<HttpStatus> createUser (@RequestBody UserModel user){
        userMap.put(user.getFirstname(),user);
        return ResponseEntity.accepted().build();
    }

    // DeleteMapping is a seperate annotaion just like PostMapping. Status 204 is No content
    @DeleteMapping("/deleteUser/{username}")
    public ResponseEntity<HttpStatus> deleteUser (@PathVariable String username){
        userMap.remove(username);
        return ResponseEntity.noContent().build();
    }

}