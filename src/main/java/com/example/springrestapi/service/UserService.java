package com.example.springrestapi.service;

import com.example.springrestapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1, "Rahman", 24, "rahman@gmail.com");
        User user2 = new User(2, "Jhon", 23, "jhon@gmail.com");
        User user3 = new User(3, "Glen", 25, "glen@gmail.com");
        User user4 = new User(4, "Brody", 20, "brody@gmail.com");
        User user5 = new User(5, "Kevin", 21, "kevin@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();
        for (User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
