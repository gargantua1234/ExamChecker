package com.aro.answer;

import java.util.List;

public class Answers {
	protected List<String> answers;
	
	public Answers(List<String> answers){
		this.answers = answers;
	}
//	
//	public String getAnswerNumber(int number){
//		return answers.get(number);
//	}
//	
	public void setAnswer(String value){
		answers.add(value);
	}
	
	
}
