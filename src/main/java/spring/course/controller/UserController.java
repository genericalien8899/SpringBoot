package spring.course.controller;

import org.springframework.web.bind.annotation.*;
import spring.course.model.UserModel;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private Map<String , UserModel> userMap = new HashMap<>();

    public UserController() {
        userMap.put("Kishore",new UserModel("Kishorekumar","Parthipan",8899));
        userMap.put("Pedro",new UserModel("Pedro","Pascal",6969));
    }

    @GetMapping("/getUser/{userName}")
    public UserModel getUser(@PathVariable String userName) {
        return userMap.get(userName);
    }

    @PostMapping("/addUser")
    public void createUser (@RequestBody UserModel user) {
        userMap.put(user.getFirstname(),user);
    }

}