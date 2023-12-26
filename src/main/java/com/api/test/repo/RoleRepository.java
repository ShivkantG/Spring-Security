package com.api.test.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.test.model.ERole;
import com.api.test.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Optional<Role> findByName(ERole name);
}
