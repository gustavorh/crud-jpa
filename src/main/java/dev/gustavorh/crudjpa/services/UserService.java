package dev.gustavorh.crudjpa.services;

import dev.gustavorh.crudjpa.entities.User;

import java.util.List;

// TODO: Crear DTOs
public interface UserService {
    List<User> findAll();
    User save(User user);
}
