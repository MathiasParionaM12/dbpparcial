package com.example.parcialdbp.user.infraestructure;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserRepository extends UserDetailsService {
    private final UserRepository userRepository;

}
