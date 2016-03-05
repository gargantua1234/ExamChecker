package com.aro.answer;

public class AnswerExtraction {
	
	public static String getAnswerFrom(String line){
		String answer = line.toLowerCase().trim();
		answer = answer.replaceAll("[^a-z]", "");
		return answer;
	}
}
