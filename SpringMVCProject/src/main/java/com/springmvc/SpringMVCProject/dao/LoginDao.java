package com.springmvc.SpringMVCProject.dao;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.SpringMVCProject.entity.Person;
import com.springmvc.SpringMVCProject.entity.User;

@Repository
public class LoginDao {

	@Autowired
	SessionFactory factory;
	
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		String hqlQuery = "from User where username=:myusername and password=:mypass";
		session.beginTransaction();
		Query<User> query = session.createQuery(hqlQuery, User.class);
		query.setParameter("myusername", user.getUsername());
		query.setParameter("mypass", user.getPassword());
		User user2 = query.uniqueResult();
		
		session.getTransaction().commit();
		session.close();
		
		return user2;
	}

	public List<Person> getAllPersonData() {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction transaction = null;
		List<Person> list = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			String hqlQuery = "from Person";
			Query<Person> query = session.createQuery(hqlQuery, Person.class);
			list = query.list();
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

}
