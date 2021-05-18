package com.onyshkevych.repository;


import com.onyshkevych.domain.InterviewResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewResultsRepository extends JpaRepository<InterviewResults, Integer> {

}