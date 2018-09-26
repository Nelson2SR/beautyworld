package com.avocado.beautyworld;

public interface UserService {

  User findOne(String name);

  User createUser(String name);
}
