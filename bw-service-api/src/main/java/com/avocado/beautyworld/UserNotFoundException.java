package com.avocado.beautyworld;

public class UserNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 5342856196421176517L;

  public UserNotFoundException(String userId) {
    super("User is not found with id: " + userId);
  }
}
