package spring.course.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import spring.course.data.UserRepository;
import spring.course.model.UserModel;
import spring.course.data.UserEntity;
import spring.course.mappers.EntityMapper;
import spring.course.services.TimeService;
import java.util.HashMap;
import java.util.*;

import javax.swing.text.html.parser.Entity;

@Service
@Qualifier("primary")
public class UserServiceImpl implements UserService {

    private final TimeService timeService;
    // Initiating a new package services which contains the UserServices. Ultimate goal is to use dependency injection.
    // Initiated as a constructor so gets executed automatically
    private final UserRepository userRepository; 

    private final EntityMapper<UserEntity,UserModel> entityMapper;

    public UserServiceImpl(TimeService timeService, UserRepository userRepository, EntityMapper<UserEntity,UserModel> entityMapper) {
        this.timeService = timeService;
        this.userRepository = userRepository;
        this.entityMapper = entityMapper;
    }

     @Override
    public UserModel getUser(String userName) {
        UserEntity entity = userRepository.findByFirstName(userName);
        return entityMapper.map(entity);
    }

    // public UserModel getUser(String userName){
    //     return entityMapper.map(userRepository.findByFirstName(userName)); 
    // }

    public void addUser(UserModel user){
        user.setCreationTime(timeService.getCurrentTime("Amsterdam"));
        userRepository.save(entityMapper.reverseMap(user));
    }

    @Override
    @Transactional
    public void deleteUser(String userName){
        userRepository.deleteByFirstname(userName);
    }

}
