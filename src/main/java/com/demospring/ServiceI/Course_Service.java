package com.demospring.ServiceI;

import com.demospring.Model.Course;


public interface Course_Service {

	Iterable<Course> display();
	void add(Course c);
	void delete(Course c);
	Course find(int id);
	
}
