package com.demo.Repository;

import com.demo.college.entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignUpRepository extends JpaRepository<SignUp, Long> {
    boolean existsByEmail(String email);
}
