package com.airbnb.apiloginregisterfirst.repository;

import com.airbnb.apiloginregisterfirst.model.ERole;
import com.airbnb.apiloginregisterfirst.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
