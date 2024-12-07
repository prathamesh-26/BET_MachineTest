package com.demospring.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospring.Model.Course;
import com.demospring.Repository.Course_Repository;
import com.demospring.ServiceI.Course_Service;

@Service
public class ServiceImpl implements Course_Service{

	@Autowired
	Course_Repository cr;
	
	@Override
	public Iterable<Course> display() {
		return cr.findAll();
	}

	@Override
	public void add(Course c) {
		cr.save(c);
		
	}

	@Override
	public void delete(Course c) {
		cr.delete(c);
		
	}

	@Override
	public Course find(int id) {
		return cr.findById(id);
	}

}
