package com.question.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	private QuestionRepository questionRepository;

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAll() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getById(long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException());
	}

}
