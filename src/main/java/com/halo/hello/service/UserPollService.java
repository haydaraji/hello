package com.halo.hello.service;

import com.halo.hello.model.UsersPolls;

public interface UserPollService {
    void updateUserPoll(UsersPolls user);
    UsersPolls findUserById(long id);
    UsersPolls findUserByLastJwt(String lastJwt);
    UsersPolls findUserByemail(String email);
}
