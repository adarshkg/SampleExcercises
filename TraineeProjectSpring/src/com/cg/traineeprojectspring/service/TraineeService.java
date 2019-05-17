package com.cg.traineeprojectspring.service;



import java.util.List;

import com.cg.traineeprojectspring.dto.Trainee;

public interface TraineeService {

	public Trainee addTrainee(Trainee trainee);
	public List<Trainee> showAll();
	public Trainee searchTraineById(Integer id);
	public Trainee deleteTrainee(Integer id);
}
