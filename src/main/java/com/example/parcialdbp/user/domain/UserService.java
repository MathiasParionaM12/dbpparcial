package com.example.parcialdbp.user.domain;

import com.example.parcialdbp.user.infraestructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService implements UserRepository {
    private final UserRepository userRepository;

    @Override
    public UserDetailsLoadUserByUsername (String email)
        throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow()-> New UsernameNotFound
    }

}

