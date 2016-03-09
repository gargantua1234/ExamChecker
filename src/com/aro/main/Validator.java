package com.aro.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aro.answer.AnswersContainer;
import com.aro.compare.AnswerComparator;

public class Validator {
	private AnswersContainer answerSet;
	private AnswerComparator comparator;
	
	public Validator(AnswersContainer answerSet, AnswerComparator comparator){
		this.answerSet = answerSet;
		this.comparator = comparator;
	}
	
	public Map<String, Integer> validateAnswers(){
		Map<String, Integer> results = new HashMap<>();
		Map<String, List<String>> exams = answerSet.getStudentsAnswers();
		int points;
		
		for(Map.Entry<String, List<String>> entry: exams.entrySet()){
			points = comparator.compareAnswers(answerSet.getCorrectAnswers(), entry.getValue());
			results.put(entry.getKey(), points);
		}
		
		return results;
	}
}
