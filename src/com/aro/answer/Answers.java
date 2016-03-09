package com.aro.answer;

import java.util.*;

public class Answers {
	protected List<String> answers;
	
	public Answers(){
		this.answers = new LinkedList<String>();
	}
	
	public void setAnswer(String value){
		answers.add(value);
	}
	
	public List<String> getAnswers(){
		return answers;
	}
	
	
}
