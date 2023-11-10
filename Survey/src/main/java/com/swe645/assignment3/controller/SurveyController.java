package com.swe645.assignment3.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swe645.assignment3.entity.Survey;
import com.swe645.assignment3.service.SurveyService;


@RestController
@RequestMapping("/api/surveys")
public class SurveyController {
	
	private SurveyService surveyService;

	public SurveyController(SurveyService surveyService) {
		this.surveyService = surveyService;
	}
	
	@PostMapping
	public 	ResponseEntity<Survey> saveSurvey(@RequestBody Survey survey) {
		return new ResponseEntity<Survey>(surveyService.saveSurvey(survey),HttpStatus.CREATED);
		
	}

	
	@GetMapping
	public List<Survey> getAllSurveys(){
		return surveyService.getAllSurveys();
		
	}
	
	@GetMapping("{id}")
	public 	ResponseEntity<Survey> getSurveyById(@PathVariable("id") long id){
		return new ResponseEntity<Survey>(surveyService.getSurveyById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public 	ResponseEntity<Survey> updateSurvey(@PathVariable("id") long id,@RequestBody Survey survey){
		return new ResponseEntity<Survey>(surveyService.updateSurvey(survey, id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public 	ResponseEntity<String> deleteSurvey(@PathVariable("id") long id){
		
		surveyService.deleteSurvey(id);
		
		return new ResponseEntity<String>("Employee deteled.",HttpStatus.OK);
		
	}
}
