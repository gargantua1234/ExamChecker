package com.aro.answer;

import java.util.List;

public class AnswerGenerator {
	
	public Answers generateAnswers(String fileName, List<String> contener){
		return new AnswerFileLoader(fileName, new Answers(contener)).loadAnswers();
	}
}
