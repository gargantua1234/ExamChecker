package com.aro.main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.aro.answer.AnswerFileLoader;
import com.aro.answer.AnswersContainer;
import com.aro.file.FilePreparator;

public class Input {
	private Path correctAnswersFile;
	private Path givenAnswersDir;
	private AnswersContainer container = new AnswersContainer();
	private AnswerFileLoader answers = new AnswerFileLoader();
	
	public Input(String correctAnswersFile, String givenAnswersDir){
		this.correctAnswersFile = Paths.get(correctAnswersFile);
		this.givenAnswersDir = Paths.get(givenAnswersDir);
	}
	
	public AnswersContainer readAnswers()throws IOException{
		FilePreparator studentsFiles = new FilePreparator(givenAnswersDir.toString());
		
		loadStudentsAnswers(studentsFiles.prepareFiles());
		container.setCorrectAnswers(answers.loadAnswers(correctAnswersFile));
		
		return container;
	}
	
	public void loadStudentsAnswers(List<String> exams) throws IOException{
		for(String exam : exams){
			String ex = exam.split("\\\\")[1];
			container.addUserExam(ex, answers.loadAnswers(Paths.get(exam)));
		}
		
	}

}
