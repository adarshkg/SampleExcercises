package com.cg.traineeprojectspring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.traineeprojectspring.dto.Trainee;

@Repository
public class TraineeRepositoryImpl implements TraineRepository {
	List<Trainee> trainees = new ArrayList<>();
	@Override
	public Trainee save(Trainee trainee) {
		 trainees.add(trainee);
		 return trainee;
	}

	@Override
	public List<Trainee> findAll() {
		return trainees;
	}

	@Override
	public Trainee findTraineeById(Integer id) {
		for (Trainee trainee : trainees) {
			if(trainee.getId()==id) {
				return trainee;
			}
		}
		return null;
	}

	@Override
	public Trainee delete(Integer id) {
		Trainee trainee = findTraineeById(id);
		trainees.remove(trainee);
		return null;
	}

}
