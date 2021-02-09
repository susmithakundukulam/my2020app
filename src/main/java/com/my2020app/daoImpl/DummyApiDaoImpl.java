package com.my2020app.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
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
			System.out.println("saveStudent - 3");
			sessionFactory.getCurrentSession().save(student);
			System.out.println(student.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success!!!";
	}

	@Override
	public List<StudentHib> studentList(int offset, int recordsPerPage) {
		List<StudentHib> students = null;
		try{			
			//Example example = Example.create(user).excludeProperty("userPassword") ;
		   
			Criteria criteria=sessionFactory.getCurrentSession().createCriteria(StudentHib.class);
			
			//criteria.add(example);
			criteria.setFirstResult(offset);  
			criteria.setMaxResults(recordsPerPage);  		    
			students=criteria.list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public int studentListCount() {
		int rowCount = 0;
		try{
			//StudentHib user = new StudentHib();
			
			//Example example = Example.create(user).excludeProperty("userPassword") ;
		   
			Criteria criteria=sessionFactory.getCurrentSession().createCriteria(StudentHib.class);
			System.out.println(criteria.list());
			//criteria.add(example);		    
			rowCount=criteria.list().size();
		} catch(Exception e){
			e.printStackTrace();
		}
		return rowCount;
	}
}
