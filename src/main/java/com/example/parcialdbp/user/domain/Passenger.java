package com.example.parcialdbp.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Getter
@Table(name="User")
@Setter
@NoArgsConstructor

public class Passenger implements UserDetails {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String email;
    private String password;
    private String Role;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public Collection<?extends GrantedAuthority> getAuthorities() {
        return list.of(new SimpleGrantedAuthority(passenger.nam()));
    }

}
