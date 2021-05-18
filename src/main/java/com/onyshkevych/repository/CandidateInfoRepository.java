package com.onyshkevych.repository;

import com.onyshkevych.domain.CandidateInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CandidateInfoRepository extends JpaRepository<CandidateInfo, Integer> {

}