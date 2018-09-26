package com.avocado.beautyworld.repository;

import com.avocado.beautyworld.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
  User findByName(String name);
}
