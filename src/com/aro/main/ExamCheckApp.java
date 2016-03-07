package com.aro.main;

import java.util.*;

import com.aro.answer.*;
import com.aro.compare.*;

public class ExamCheckApp {

	public static void main(String[] args) {
		AnswerGenerator generator = new AnswerGenerator();
		
//		SingleChoiceComparator singleChoice = new SingleChoiceComparator();
//		SingleChoiceWithMinus withMinusPoints = new SingleChoiceWithMinus();
//		
//		Answers correct = generator.generateAnswers("TestsExample\\CorrectAnswerSingleChoice.txt", new LinkedList<String>());
//		Answers studentAnswer = generator.generateAnswers("TestsExample\\TestAnswerExample.txt", new LinkedList<String>());
		
//		int points = singleChoice.compareAnswers(correct, studentAnswer);
//		System.out.println("Uzyskales "+ points+" punktow");
//		
//		points = withMinusPoints.compareAnswers(correct, studentAnswer);
//		System.out.println("Uzyskales "+ points+" punktow");
		
		
		MultipleChoiceComparator multiChoice = new MultipleChoiceComparator();
		MultipleWithMinus withMinus = new MultipleWithMinus();
		Answers correctMulti = generator.generateAnswers("TestsExample\\CorrectMultiple.txt", new LinkedList<String>());
		Answers studentMulti = generator.generateAnswers("TestsExample\\MultiExample.txt", new LinkedList<String>());
		
		int pointsM = multiChoice.compareAnswers(correctMulti, studentMulti);
		System.out.println("Uzyskales "+ pointsM+" punktow");
		
		pointsM = withMinus.compareAnswers(correctMulti, studentMulti);
		System.out.println("Uzyskales "+ pointsM+" punktow");
	}

}
