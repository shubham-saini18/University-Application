package com.UniversityApplication.UniversityApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UniversityApplication.UniversityApplication.Dao.Data;
import com.UniversityApplication.UniversityApplication.Entities.University;
@Service
public class UniversityImpl implements UniversityService {
	@Autowired
	private Data data;
	
	@Override
	public List<University> getUniversity() {
		
		return data.findAll();
	}
	
	@Override
	public University getUniversityData(int universityId) {
		return data.getOne(universityId);
	}
	@Override
	public University addUniversity(University university) {
		data.save(university);
		return university;
	}
	@Override
	public University updateUniversity(University university) {
		data.save(university);
		return university;	
	}
	@Override
	public void deleteUniversityData(int universityId) {
		int entity = universityId;
		data.deleteById(entity);
		
	}

}
