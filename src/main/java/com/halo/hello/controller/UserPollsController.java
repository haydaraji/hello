package com.halo.hello.controller;

import com.halo.hello.model.Role;
import com.halo.hello.model.UsersPolls;
import com.halo.hello.repository.UserPollsRepository;
import com.halo.hello.response.ListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserPollsController {
    @Autowired
    UserPollsRepository userPollsRepository;

    @GetMapping("/user-polls")
//    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> findAll() {
        List<UsersPolls> usersPollsList = userPollsRepository.findAll();
        return new ResponseEntity(new ListResponse(true, usersPollsList),
                HttpStatus.OK);
    }

    @PostMapping("/user-polls")
    public ResponseEntity<?> saveUserPolls(@Valid @RequestBody UsersPolls usersPolls){
        userPollsRepository.save(usersPolls);
        List<UsersPolls> usersPollsList = userPollsRepository.findAll();
        return new ResponseEntity(new ListResponse(true, usersPollsList),
                HttpStatus.OK);
    }
}
