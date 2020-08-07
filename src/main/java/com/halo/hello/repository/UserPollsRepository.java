package com.halo.hello.repository;

import com.halo.hello.model.UsersPolls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPollsRepository extends JpaRepository<UsersPolls, Integer> {
    UsersPolls findByid(int id);
}
