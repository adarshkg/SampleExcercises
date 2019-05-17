package com.cg.traineeprojectspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.cg.traineeprojectspring.dto.Trainee;
import com.cg.traineeprojectspring.service.TraineeService;
import com.cg.traineeprojectspring.service.TraineeServiceImpl;

@Controller
public class TraineeController {

	@Autowired
	TraineeService traineeService;
	
	
	@GetMapping("login")
	public String loginPage() {
		return "myLogin";		
	}
	
	@PostMapping("checklogin")
	public String doLogin(@RequestParam("uname") String name,@RequestParam("upass") String pass ) {
		if(name.equals("admin")&&pass.equals("123")) {
		return "menu";		
	}else {
		return "error";
	}
	
	}
	@GetMapping("addpage")
	public ModelAndView getAddTrainee( @ModelAttribute("tran") Trainee trainee) {
		List <String> listOfDomain = new ArrayList<>();
		listOfDomain.add("C");
		listOfDomain.add("Python");
		listOfDomain.add("Java");
		return new ModelAndView("register","dom",listOfDomain);
		
	}
	
	@PostMapping("register")
	public ModelAndView addTrainee(@ModelAttribute("tran") Trainee trainee) {
		Trainee traineeTwo = traineeService.addTrainee(trainee);
		System.out.println(traineeTwo);
		return new ModelAndView("menu","key",traineeTwo); 
		
		
	}
	
	
	@GetMapping("delete")
	public ModelAndView deleteTrainee(@ModelAttribute("tran") Trainee trainee) {
		Trainee trainee3 = traineeService.searchTraineById(trainee.getId()) ;
		return new ModelAndView("delete","tran",trainee3);
		
	}
	
	@GetMapping("updatepage")
	public ModelAndView getUpdateTrainee( @ModelAttribute("tran") Trainee trainee) {
		List <String> listOfDomain = new ArrayList<>();
		listOfDomain.add("C");
		listOfDomain.add("Python");
		listOfDomain.add("Java");
		return new ModelAndView("update","dom",listOfDomain);
		
	}
	@GetMapping("update")
	public ModelAndView updateTrainee(@ModelAttribute("tran") Trainee trainee) {
		Trainee traineeTwo = traineeService.addTrainee(trainee);
		return new ModelAndView("update","key",traineeTwo);
		
	}
	
	@GetMapping("retrieve")
	public ModelAndView retrieveTrainee(@ModelAttribute("tran") Trainee trainee) {
		Trainee train = traineeService.searchTraineById(trainee.getId());
		return new ModelAndView("retrieve","tran",train);
		
	}

	@GetMapping("retrieveAll")
	public ModelAndView retrieveAllTrainees() {
		List<Trainee> trainees = traineeService.showAll();
		return new ModelAndView("retrieveAll","tran",trainees);
		
	}
}