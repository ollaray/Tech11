package com.tech11.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech11.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
