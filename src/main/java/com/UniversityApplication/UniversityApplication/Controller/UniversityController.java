package com.UniversityApplication.UniversityApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.UniversityApplication.UniversityApplication.Entities.University;
import com.UniversityApplication.UniversityApplication.Service.UniversityService;

@RestController
public class UniversityController
{
	@GetMapping("/home")
	public String home() 
	{

		return " Welcome to My University-Application ";
	}
	@Autowired
	private UniversityService universityService;
	
	@GetMapping("/university")
	public List<University> getUniversitylist()
	{
		return this.universityService.getUniversity();
	}
	@GetMapping("/university/{universityId}")
	public ResponseEntity<HttpStatus> getUniversityData(@PathVariable int universityId)
	{
		try 
		{
			   this.universityService.getUniversityData(universityId);
			   return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	 @PostMapping("/university")
    public University addNewUniversity(@RequestBody University university) 
	 {
			return this.universityService.addUniversity(university);
     }
	 @PutMapping("/university")
	  	public University updateUniversity(@RequestBody University university) {
	  		return this.universityService.updateUniversity(university);
	  	}
	 @DeleteMapping("/university/{universityId}")
	   public ResponseEntity<HttpStatus> deleteUniversityData(@PathVariable int universityId)
	 {
		   try {
			   this.universityService.deleteUniversityData(universityId);
			   return new ResponseEntity<>(HttpStatus.OK);
		       }
		   catch(Exception e) {
			   return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		   }
	   }
}