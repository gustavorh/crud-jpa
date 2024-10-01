package dev.gustavorh.crudjpa.repositories;

import dev.gustavorh.crudjpa.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsername(String username);
}
