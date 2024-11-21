package com.example.demorestapi.Service;

import com.example.demorestapi.Entity.User;
import com.example.demorestapi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplements implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplements(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
//        if (userRepository.findById(id).isPresent())
//            return userRepository.findById(id).get();
//        else return null;
        Optional<User> user = userRepository.findById(id);
        User data = null;
        if (user.isPresent()) {
            data = user.get(); // need to .get bacause it is Optional
            return data;
        } else {
            throw new RuntimeException("User with id " + id + " not found");
        }
    }

    @Override
    public String deleteById(int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        } else {
            throw new RuntimeException("User with id " + id + " not found");
        }
        return "deleted user with id " + id;
    }

}
