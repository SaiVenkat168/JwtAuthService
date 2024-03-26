package com.gameservice.session.service;


import com.gameservice.session.entity.Users;
import com.gameservice.session.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Fetch user details from the database
        // Implement userRepository.findByUsername(username) based on your UserRepository
        // Return UserDetails object
        // Example:
        Users user = userRepository.findByUsername(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new Users(user.getId(), user.getUsername(),user.getPassword(),user.getEmail(), user.getRole());
    }
}
