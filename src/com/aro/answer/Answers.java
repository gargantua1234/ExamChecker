package com.aro.answer;

import java.util.List;

public class Answers {
	protected List<String> answers;
	
	public Answers(List<String> answers){
		this.answers = answers;
	}
	
	public void setAnswer(String value){
		answers.add(value);
	}
	
	public List<String> getAnswers(){
		return answers;
	}
	
	
}
