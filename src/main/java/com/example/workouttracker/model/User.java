package com.example.workouttracker.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    @ManyToMany
    private Set <Role> roles;

    @OneToMany
    List <Workout> workouts;

    public User (String username, String email, String password, Set <Role> roles, List <Workout> workouts) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.workouts = workouts;
    }
}