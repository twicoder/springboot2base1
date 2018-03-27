package com.chinwe.springbootdemo1.repositories;

import com.chinwe.springbootdemo1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
