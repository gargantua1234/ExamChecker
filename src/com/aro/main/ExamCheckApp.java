package com.aro.main;

import java.io.IOException;
import java.util.*;

import com.aro.answer.*;
import com.aro.compare.*;
import com.aro.file.FilePreparator;

public class ExamCheckApp {
	
	public static AnswerGenerator generator = new AnswerGenerator();
	public static AnswerComparator comparator;
	public static Answers correctAnswers;
	public static List<String> studentExams;
	public static Map<String, Integer> results = new HashMap<>();
	
	public static final String ANSWER_FILE = "CorrectAnswer\\Correct";
	public static final String STUDENTS_ANSWER_DIR = "StudentsAnswers";
	
	
	public static void main(String[] args) throws IOException {
		
		comparator = new MultipleChoiceComparator();
		correctAnswers = generator.generateAnswers(ANSWER_FILE, new LinkedList<String>());

		FilePreparator fp = new FilePreparator(STUDENTS_ANSWER_DIR);
		studentExams = fp.prepareFiles();
		
		validateEachExam();
		printResult();

	}
	
	public static  void validateEachExam(){
		for(String l : studentExams){
			Answers studentMulti = generator.generateAnswers(l, new LinkedList<String>());
			int pointsM = comparator.compareAnswers(correctAnswers, studentMulti);
			String[] name = l.split("\\\\");
			results.put(name[1], pointsM);
		}
	}
	
	public static void printResult(){
		for(Map.Entry<String, Integer> entry : results.entrySet()){
			System.out.println(entry.getKey() +": "+ entry.getValue()+" points" );
		}
		
	}

}
