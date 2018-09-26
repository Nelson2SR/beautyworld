package com.avocado.beautyworld;

import com.avocado.beautyworld.repository.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public User findOne(String name){
    User user = userDao.findByName(name);
    if (user == null) {
      throw new UserNotFoundException(name);
    }
    return user;
  }

  @Override
  public User createUser(String name) {
    return new User();
  }
}
