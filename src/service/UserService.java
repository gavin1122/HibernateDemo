package service;

import java.util.List;

import com.pack.*;

public interface UserService {
	
	public int register(User user);
	public void delete(int id);
	public User updateUser(User u);
	public User ListUserById(int id);
	public List<User> listAllUsers();

}
