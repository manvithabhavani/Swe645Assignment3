package com.swe645.assignment3.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.swe645.assignment3.entity.Survey;
import com.swe645.assignment3.exception.ResourceNotFoundException;
import com.swe645.assignment3.repository.SurveyRepository;
import com.swe645.assignment3.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {
	
	
	private SurveyRepository surveyRepository;

	public SurveyServiceImpl(SurveyRepository surveyRepository) {
		super();
		this.surveyRepository = surveyRepository;
	}

	@Override
	public Survey saveSurvey(Survey survey) {
		return surveyRepository.save(survey);

	}

	@Override
	public List<Survey> getAllSurveys() {
		return surveyRepository.findAll();

	}

	@Override
	public Survey getSurveyById(long id) {
		Optional<Survey> survey = surveyRepository.findById(id);
		if(survey.isPresent()) {
			return survey.get();
		}else {
			throw new ResourceNotFoundException("Student", "Id", id);
		}
	}

	@Override
	public Survey updateSurvey(Survey survey, long id) {
		Survey currentSurvey = surveyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student","ID",id));
		
		currentSurvey.setFirstName(survey.getFirstName());
		currentSurvey.setLastName(survey.getLastName());
		currentSurvey.setCity(survey.getCity());
		currentSurvey.setComments(survey.getComments());
		currentSurvey.setDateOfSurvey(survey.getDateOfSurvey());
		currentSurvey.setEmail(survey.getEmail());
		currentSurvey.setInterestFactor(survey.getInterestFactor());
		currentSurvey.setLikeness(survey.getLikeness());
		currentSurvey.setLikeOnCampus(survey.getLikeOnCampus());
		currentSurvey.setLuckyDraw(survey.getLuckyDraw());
		currentSurvey.setStreetAddress(survey.getStreetAddress());
		currentSurvey.setState(survey.getState());
		currentSurvey.setZip(survey.getZip());
		currentSurvey.setPhoneNumber(survey.getPhoneNumber());
		
		
		surveyRepository.save(currentSurvey);
		return currentSurvey;
	}

	@Override
	public void deleteSurvey(long id) {
		surveyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student","ID",id));
		surveyRepository.deleteById(id);		
	}

}
