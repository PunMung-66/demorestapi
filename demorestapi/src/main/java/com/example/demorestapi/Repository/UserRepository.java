package com.example.demorestapi.Repository;

import com.example.demorestapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    //  This is use for connect repo with entity
    //  The UserRepository interface connects to the User entity in a Spring Data JPA application.
    //  It serves as the bridge between your application and the database for managing User records.
}
