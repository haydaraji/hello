package com.halo.hello.repository;

import com.halo.hello.model.Role;
import com.halo.hello.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByid(long id);
    Optional<Role> findByName(RoleName roleName);
}
