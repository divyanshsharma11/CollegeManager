package com.collegemanager.repository;
import com.collegemanager.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeRepository extends JpaRepository<College,Long> {
    void deleteCollegeById(Long id);

    Optional<College> findCollegeById(Long id);
}
