package com.carparking.project.repository;

import com.carparking.project.entities.Role;
import com.carparking.project.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
}
