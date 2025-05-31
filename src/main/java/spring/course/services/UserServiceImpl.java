package spring.course.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.course.model.UserModel;

import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("primary")
public class UserServiceImpl implements UserService {

    private Map<String , UserModel> userMap = new HashMap<>();

    // Initiating a new package services which contains the UserServices. Ultimate goal is to use dependency injection.

    // Initiated as a constructor so gets executed automatically
    public UserServiceImpl() {
        userMap.put("Mrunal",new UserModel("Mrunal","Thakur",8899));
        userMap.put("Ananya",new UserModel("Ananya","Pandey",6969));
    }

    public UserModel getUser(String userName){
        return userMap.get(userName);
    }

    public void addUser(UserModel user){
        userMap.put(user.getFirstname(),user);
    }

    public void deleteUser(String userName){
        userMap.remove(userName);
    }

}
