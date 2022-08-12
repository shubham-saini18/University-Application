package com.UniversityApplication.UniversityApplication.Entities;


import javax.persistence.Entity;

import javax.persistence.Id;


@Entity

public class University 
{
	@Id
	
	private int universityId;
	
	private String universityName;
	
	private int totalColleges;

	public University() 
	{
		super();

	}

	public University(int universityId, String universityName, int totalColleges) 
	{
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.totalColleges = totalColleges;
	}

	public int getUniversityId() 
	{
		return universityId;
	}

	public void setUniversityId(int universityId) 
	{
		this.universityId = universityId;
	}

	public String getUniversityName() 
	{
		return universityName;
	}

	public void setUniversityName(String universityName) 
	{
		this.universityName = universityName;
	}

	public int getTotalColleges() 
	{
		return totalColleges;
	}

	public void setTotalColleges(int totalColleges) 
	{
		this.totalColleges = totalColleges;
	}

	@Override
	public String toString() 
	{
		return "University [universityId=" + universityId + ", universityName=" + universityName + ", totalColleges="
				+ totalColleges + "]";
	}

}
