package com.devopsbuddy.backend.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devopsbuddy.backend.persistence.domain.backend.Role;

/**
 * 
 * @author Narendra
 *
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
