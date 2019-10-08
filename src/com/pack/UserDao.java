package com.pack;

import java.util.List;

public interface UserDao {
public int register(User user);
public void delete(int id);
public User updateUser(User u);
public User ListUserById(int id);
public List<User> listAllUsers();

}
