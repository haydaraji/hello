package com.halo.hello.controller;

import com.halo.hello.model.Role;
import com.halo.hello.model.UsersPolls;
import com.halo.hello.repository.RoleRepository;
import com.halo.hello.response.ListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public class RoleController {
    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/role")
    public ResponseEntity<?> findAll() {
        List<Role> roleList = roleRepository.findAll();
        return new ResponseEntity(new ListResponse(true, roleList),
                HttpStatus.OK);
    }

    @PostMapping("/role")
    public ResponseEntity<?> saveRole(@Valid @RequestBody Role role){
        roleRepository.save(role);
        List<Role> roleList = roleRepository.findAll();
        return new ResponseEntity(new ListResponse(true, roleList),
                HttpStatus.OK);
    }
}
