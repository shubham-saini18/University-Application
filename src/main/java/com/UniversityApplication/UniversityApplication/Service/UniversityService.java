package com.UniversityApplication.UniversityApplication.Service;

import java.util.List;

import com.UniversityApplication.UniversityApplication.Entities.University;

public interface UniversityService {

	public List<University> getUniversity();
	public University getUniversityData(int universityId);
	public University addUniversity(University university);
	public University updateUniversity(University university);
	public void deleteUniversityData(int universityId);

}
