package com.aro.main;

import java.util.*;

import com.aro.answer.*;
import com.aro.compare.*;

public class ExamCheckApp {

	public static void main(String[] args) {
		AnswerGenerator generator = new AnswerGenerator();
		
		SingleChoiceComparator singleChoice = new SingleChoiceComparator();
		SingleChoiceWithMinus withMinusPoints = new SingleChoiceWithMinus();
		
		Answers correct = generator.generateAnswers("TestsExample\\CorrectAnswerSingleChoice.txt", new LinkedList<String>());
		Answers studentAnswer = generator.generateAnswers("TestsExample\\TestAnswerExample.txt", new LinkedList<String>());
		
		int points = singleChoice.compareAnswers(correct, studentAnswer);
		System.out.println("Uzyskales "+ points+" punktow");
		
		points = withMinusPoints.compareAnswers(correct, studentAnswer);
		System.out.println("Uzyskales "+ points+" punktow");
		
	}

}
