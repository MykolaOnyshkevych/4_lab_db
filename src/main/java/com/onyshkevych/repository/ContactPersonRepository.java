package com.onyshkevych.repository;

import com.onyshkevych.domain.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactPersonRepository extends JpaRepository<ContactPerson, Integer> {

}