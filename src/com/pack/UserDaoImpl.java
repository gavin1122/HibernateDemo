package com.pack;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDaoImpl implements UserDao{

	@Override
	public int register(User user) {
		Session session=SessionManager.getSession();
		Transaction trans= session.beginTransaction();
		int id=(int)session.save(user);
		trans.commit();
		session.close();
		return id;
		
		
	}

	@Override
	public void delete(int id) {
		Session session=SessionManager.getSession();
		Transaction trans= session.beginTransaction();
		User  usertobedeleted=session.load(User.class, id);
		session.delete(usertobedeleted);
		trans.commit();
		session.close();
		
		
	}

	@Override
	public User updateUser(User u) {
		Session session=SessionManager.getSession();
		Transaction trans= session.beginTransaction();
		session.update(u);
		trans.commit();
		session.close();
		return u;
	}

	@Override
	public User ListUserById(int id) {
		Session session=SessionManager.getSession();
		Transaction trans= session.beginTransaction();
		User  user= session.load(User.class, id);
		trans.commit();
		session.close();
		return user;
	}

	@Override
	public List<User> listAllUsers() {
		Session session=SessionManager.getSession();
		Transaction trans= session.beginTransaction();
		Query query=session.createQuery("from user");
		
		List<User> userlist=query.list();
		
		
		trans.commit();
		session.close();
		return userlist;
	}




}
