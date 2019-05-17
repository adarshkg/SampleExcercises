package com.cg.traineeprojectspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.traineeprojectspring.dao.TraineRepository;
import com.cg.traineeprojectspring.dto.Trainee;

@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineRepository repo;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		return repo.save(trainee);
		
	}

	@Override
	public List<Trainee> showAll() {
		return repo.findAll();
	}

	@Override
	public Trainee searchTraineById(Integer id) {
		return repo.findTraineeById(id);
	}

	@Override
	public Trainee deleteTrainee(Integer id) {
		return repo.delete(id);
	}

}
