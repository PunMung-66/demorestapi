package com.example.demorestapi.Controller;

import com.example.demorestapi.Entity.User;
import com.example.demorestapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

//    @GetMapping("/users")
//    public List<User> getUsers() {
//        List<User> data = new ArrayList<User>();
//        data.add(new User("Pun","Mung"));
//        data.add(new User("Ben","Mung"));
//        return data;
//    }
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        user.setId(0);
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return userService.findById(id);
    }

    @DeleteMapping("/users")
    public String deleteUser(@Param("id") int id) {
        return userService.deleteById(id);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }
}
