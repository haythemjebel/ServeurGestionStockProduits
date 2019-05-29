package com.haythem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haythem.entities.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
