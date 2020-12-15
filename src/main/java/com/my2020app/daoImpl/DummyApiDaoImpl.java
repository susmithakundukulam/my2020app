package com.my2020app.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my2020app.dao.DummyApiDAO;
import com.my2020app.model.StudentHib;

@Repository
@Transactional
public class DummyApiDaoImpl implements DummyApiDAO {

	@Autowired 
	SessionFactory sessionFactory;

	@Override
	public String saveStudent(StudentHib student) {
		try {
			sessionFactory.getCurrentSession().save(student);
			System.out.println(student.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "ttttt";
	}
}
