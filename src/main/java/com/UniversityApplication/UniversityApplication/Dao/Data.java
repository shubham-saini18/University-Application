package com.UniversityApplication.UniversityApplication.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UniversityApplication.UniversityApplication.Entities.University;

public interface Data extends JpaRepository<University , Integer>
{

}
