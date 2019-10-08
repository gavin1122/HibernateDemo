package service;

import java.util.List;


import com.pack.*;

public class UserServiceImpl implements UserService {
	
	private UserDao dao=new UserDaoImpl();

	@Override
	public int register(User user) {
	
		return dao.register(user);
	}

	@Override
	public void delete(int id) {
		
		dao.delete(id);
		
	}

	@Override
	public User updateUser(User u) {
		
		return dao.updateUser(u);
	}

	@Override
	public User ListUserById(int id) {
		
		return dao.ListUserById(id);
	}

	@Override
	public List<User> listAllUsers() {
	
		return dao.listAllUsers();
	}

	
	

}
