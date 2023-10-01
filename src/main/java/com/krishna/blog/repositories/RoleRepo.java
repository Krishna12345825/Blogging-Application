package com.krishna.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
