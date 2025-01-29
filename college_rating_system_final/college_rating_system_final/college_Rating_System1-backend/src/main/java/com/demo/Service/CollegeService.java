package com.demo.Service;


import com.demo.college.entity.College;
import com.demo.Repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    public College updateCollege(Long id, College updatedCollege) {
        Optional<College> optionalCollege = collegeRepository.findById(id);
        if (optionalCollege.isPresent()) {
            College college = optionalCollege.get();
            college.setName(updatedCollege.getName());
            college.setLocation(updatedCollege.getLocation());
            college.setRank(updatedCollege.getRank());
            return collegeRepository.save(college);
        }
        return null;
    }

    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }
}
