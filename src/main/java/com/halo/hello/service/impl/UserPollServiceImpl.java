package com.halo.hello.service.impl;

import com.halo.hello.model.UsersPolls;
import com.halo.hello.repository.UserPollsRepository;
import com.halo.hello.service.UserPollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPollServiceImpl implements UserPollService {

    @Autowired
    UserPollsRepository userPollRepository;

    @Override
    public void updateUserPoll(UsersPolls user) {
        userPollRepository.save(user);
    }

    @Override
    public UsersPolls findUserById(long id) { return userPollRepository.findUserById(id); }

    @Override
    public UsersPolls findUserByLastJwt(String lastJwt) {
        return userPollRepository.findUserByLastJwt(lastJwt);
    }

    @Override
    public UsersPolls findUserByemail(String email) {
        return userPollRepository.findUserByemail(email);
    }
}
