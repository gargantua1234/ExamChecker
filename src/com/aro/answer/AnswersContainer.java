package com.aro.answer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnswersContainer {
	private List<String> correctAnswers;
	private Map<String, List<String>> studentsAnswers = new HashMap<>();
	
	public void setCorrectAnswers(List<String> answer){
		this.correctAnswers = answer;
	}
	
	public List<String> getCorrectAnswers(){
		return correctAnswers;
	}
	
	public void addUserExam(String studentExam, List<String> answer){
		studentsAnswers.put(studentExam, answer);
	}
	
	public Map<String, List<String>> getStudentsAnswers(){
		return studentsAnswers;
	}
}
