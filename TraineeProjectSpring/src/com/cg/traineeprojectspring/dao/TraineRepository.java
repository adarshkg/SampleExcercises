package com.cg.traineeprojectspring.dao;

import java.util.List;

import com.cg.traineeprojectspring.dto.Trainee;

public interface TraineRepository {

	public Trainee save(Trainee trainee);
	public List<Trainee> findAll();	
	public Trainee delete(Integer id);
	public Trainee findTraineeById(Integer id);
}
