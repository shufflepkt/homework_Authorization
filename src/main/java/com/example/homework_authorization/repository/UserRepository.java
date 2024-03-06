package com.example.homework_authorization.repository;

import com.example.homework_authorization.authorities.Authorities;
import com.example.homework_authorization.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
//    private final ConcurrentHashMap<User, List<Authorities>> userAuthorities = new ConcurrentHashMap<>();
    public List<Authorities> getUserAuthorities(String user, String password) {
        return null;
    }
}
