package com.aro.main;

import java.util.*;

import com.aro.answer.*;

public class ExamCheckApp {

	public static void main(String[] args) {
		List<String> answers = new LinkedList<>();
		Answers ca = new Answers(answers);
		AnswerLoader al = new AnswerLoader(
				"TestsExample\\CorrectAnswerSingleChoice.txt", ca
				);
		al.loadAnswers();
		
		for(String a : answers)
			System.out.println(a);

	}

}
