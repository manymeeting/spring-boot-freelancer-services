package com.freelancer.spring.flbackend.dao;

import com.freelancer.spring.flbackend.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends PagingAndSortingRepository<User, Integer> {

    @Query("select user from User user where user.userId = :userId")
    User findUserById(@Param("userId") Integer userId);

    @Query("select user from User user where user.userEmail = :userEmail")
    User findUserByEmail(@Param("userEmail") String userEmail);

}
