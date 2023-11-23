package com.swe645.assignment3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swe645.assignment3.entity.Survey;

public interface SurveyRepository extends JpaRepository<Survey,Long> {

}
