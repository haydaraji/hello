package com.halo.hello.repository;

import com.halo.hello.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByid(long id);
}
