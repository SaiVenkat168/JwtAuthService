package com.gameservice.session.service;

import com.gameservice.session.bao.UserRequest;
import com.gameservice.session.bao.Role;
import com.gameservice.session.entity.Users;
import com.gameservice.session.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository repository;
    public String register(UserRequest request)
    {
        Users user=new Users();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.USER);
        user.setUsername(request.getUsername());
        repository.save(user);
        return "user registered";
    }

}