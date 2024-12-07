package com.demospring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demospring.Model.Course;
import com.demospring.ServiceI.Course_Service;



@Controller
public class Course_controller {

	@Autowired
	Course_Service cs;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	
	@RequestMapping("/save")
	public String index1(@ModelAttribute Course c) {
		cs.add(c);
		return "index";
	}
		
	@RequestMapping("/view")
	public String view(Model m) {
		Iterable<Course> cr = cs.display(); 
		m.addAttribute("cr",cr);
		return "view";
	}
	
	@RequestMapping("/delete")
	public String delete(Model m,Course c) {
		cs.delete(c);
		Iterable<Course> cr =  cs.display();
		m.addAttribute("cr", cr);
		return "view";
	}
	
	@RequestMapping("/edit")
	public String editpage(@RequestParam("id") int id,Model m) {
		
		Course c = cs.find(id);
		System.out.println(c);
		m.addAttribute("cr", c);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updatesuccess(@ModelAttribute Course c,Model m) {
		cs.add(c);
		Iterable<Course> cr =  cs.display();
		m.addAttribute("cr", cr);
			return "view";
	}
}
