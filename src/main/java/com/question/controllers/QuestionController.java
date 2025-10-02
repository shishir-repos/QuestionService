package com.question.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.impl.QuestionServiceImpl;

@RestController
@RequestMapping("/question")
public class QuestionController {

	private QuestionServiceImpl questionServiceImpl;

	public QuestionController(QuestionServiceImpl questionServiceImpl) {
		this.questionServiceImpl = questionServiceImpl;
	}

	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionServiceImpl.create(question);
	}

	@GetMapping
	public List<Question> getAll() {
		return questionServiceImpl.getAll();
	}

	@PostMapping("/{id}")
	public Question getById(@PathVariable long id) {
		return questionServiceImpl.getById(id);
	}

	@PostMapping("/quiz/{quizId}")
	public List<Question> getByQuizId(@PathVariable long quizId) {
		return questionServiceImpl.getQuestionOfQuiz(quizId);
	}

}
