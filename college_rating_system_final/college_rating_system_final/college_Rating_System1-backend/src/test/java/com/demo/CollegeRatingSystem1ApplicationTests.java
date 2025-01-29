package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.Repository.CollegeRepository;

import com.demo.college.entity.College;




@SpringBootTest
class CollegeRatingSystem1ApplicationTests {
	
	
	@Autowired
	private CollegeRepository college;
	
	@Autowired
	//private FeedbackRepository  feedback;
	
	

	@Test
	void contextLoads() {
	}
	
}
	
	
//	@Test
//	public void college1() {
//	       College colleges = new College();
//	       
//	        //colleges.setId(1L);
//	        colleges.setName("College A");
//	        colleges.setLocation("City X");
//	        colleges.setFacultyQuality(4.5);
//	        colleges.setCampusInfrastructure(4.0);
//	        colleges.setPlacementSuccess(4.2);
//	        colleges.setCurriculumRelevance(4.7);
//	        colleges.setOverallRating(4.4);
//	        college.save(colleges);
//	        
//		
//	}
	
//	@Test
//	public void Feedback1() {
//	
//	// Create and initialize the Feedback entity
//		Feedback Feedback1 = new Feedback();
//    
//    // Set feedback data, including associating it with the College using collegeId
//    //Feedback.setCollegeId(colleges.getId()); // Link feedback to College by ID
//    Feedback1.setRating(4.5);  // Set a rating (example)
//    Feedback1.setComments("Excellent college with great faculty and campus."); // Set comments (example)
//    
//    // Save Feedback entity
//    feedback.save(Feedback1);
//	

//	@Test
//	public void Feedback1() {
//	    // Step 1: Create and save a College entity
//	    College colleges = new College();
//	    colleges.setName("College KSIT");
//	    colleges.setLocation("BENGALURU");
//	    colleges.setFacultyQuality(4.5);
//	    colleges.setCampusInfrastructure(4.0);
//	    colleges.setPlacementSuccess(4.2);
//	    colleges.setCurriculumRelevance(4.7);
//	    colleges.setOverallRating(4.4);
//	    College savedCollege = college.save(colleges);
//
//	
//	    Feedback feedback1 = new Feedback();
//	    feedback1.setRating(4.5);  
//	    feedback1.setComments("Excellent college with great faculty and campus.");
//	    feedback1.setCollege(savedCollege);
//	
//	
//	    feedback.save(feedback1);
//	
//	
//	
//	
//}
//}
//	
//
//
