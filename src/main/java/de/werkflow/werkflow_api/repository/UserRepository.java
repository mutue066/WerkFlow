package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
