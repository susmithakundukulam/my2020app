package com.my2020app.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my2020app.dao.InstructorDAO;
import com.my2020app.model.Instructor;

@Repository
@Transactional
public class JdbcInstructorDaoImpl implements InstructorDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Instructor> getAlInstructors() {
		Session session =  sessionFactory.getCurrentSession();
		List<Instructor> instList = new ArrayList<Instructor>();

		try{
			instList = session.createQuery("SELECT a FROM Instructor a", Instructor.class).getResultList(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return instList;
	}

	@Override
	public Instructor saveInstructor(Instructor instructor) {
		try{
			sessionFactory.getCurrentSession().save(instructor);
		}catch(Exception e){
			e.printStackTrace();
		}
		return instructor;
	}

}
