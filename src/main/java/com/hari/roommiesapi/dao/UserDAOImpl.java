package com.hari.roommiesapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hari.roommiesapi.entity.User;
import com.hari.roommiesapi.rest.UserErrorResponse;

@Repository
public class UserDAOImpl implements UserDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public UserDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	@Transactional
	public List<User> getAllUsers() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> theQuery = currentSession.createQuery("from users", User.class);
		List<User> users = theQuery.getResultList();
		return users;
	}

	@Override
	@Transactional
	public User addUser(User user) {
		Session currentSession = entityManager.unwrap(Session.class);
		try {
		currentSession.saveOrUpdate(user);
		}
		catch (Exception e) {
			throw e;
		}
		User newUser = getUser(user.getUserId());
		return newUser;
	}

	@Override
	@Transactional
	public User getUser(String userId) {
		
		User user = null;
		Session currentSession = entityManager.unwrap(Session.class);
		try {
		Query<User> theQuery = currentSession.createQuery("from users where user_id= '"+userId+"'", User.class);
		user = theQuery.getSingleResult();
		}
		catch (Exception e) {
			throw e;
		}
		return user;
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		try {
		currentSession.saveOrUpdate(user);
		}
		catch (Exception e) {
			throw e;
		}
		return null;
	}

	@Override
	@Transactional
	public void deleteUser(User user) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		try {
		currentSession.delete(user);
		}
		catch (Exception e) {
			throw e;
		}
}
	
}
