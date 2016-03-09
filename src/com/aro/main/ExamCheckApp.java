package com.aro.main;

import java.io.IOException;

import com.aro.compare.*;
import com.aro.printer.ConsolePrinter;

public class ExamCheckApp {
	
	public static final String ANSWER_FILE = "CorrectAnswer\\Correct";
	public static final String STUDENTS_ANSWER_DIR = "StudentsAnswers";
	public static final String RESULT_FILE = "Result\\results";
	
	
	public static void main(String[] args)  {
		try{
			Input input = new Input(ANSWER_FILE, STUDENTS_ANSWER_DIR);
			Validator validator =  new Validator(input.readAnswers(), new MultipleChoiceComparator());
			new ConsolePrinter().printResult(validator.validateAnswers());

			//		new FilePrinter(RESULT_FILE).printResult(results);
		}
		catch(IOException exception){
			System.err.println(exception);
		}
	}
}
