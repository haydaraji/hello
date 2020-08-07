package com.halo.hello.repository;

import com.halo.hello.model.UsersPolls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserPollsRepository extends JpaRepository<UsersPolls, Integer> {
    UsersPolls findByid(int id);
    UsersPolls findUserById(Long id);
    UsersPolls findUserByLastJwt(String lastJwt);
    UsersPolls findUserByemail(String email);

    Optional<UsersPolls> findByUsernameOrEmail(String username, String email);

    List<UsersPolls> findByIdIn(List<Long> userIds);

    Optional<UsersPolls> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    UsersPolls findByLastJwt(String lastJwt);
}
