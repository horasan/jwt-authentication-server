package com.horasan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horasan.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
