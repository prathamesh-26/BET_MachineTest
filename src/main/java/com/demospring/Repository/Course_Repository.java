package com.demospring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demospring.Model.Course;

@Repository
public interface Course_Repository extends CrudRepository<Course, Integer>{

	public Course findById(int id);
}
