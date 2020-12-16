package com.my2020app.dao;

import java.util.List;

import com.my2020app.model.StudentHib;

public interface DummyApiDAO {
	
	public String saveStudent(StudentHib student);

	public List<StudentHib> studentList(int offset, int recordsPerPage);

	public int studentListCount();

}
