package com.aro.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class AnswerLoader {
	private Answers answers;
	private Path filePath;
	
	public AnswerLoader(String fileName, Answers answers){
		this.answers = answers;
		this.filePath = Paths.get(fileName);
	}
	
	public void loadAnswers(){
		String line;
		try(BufferedReader sourceFile = Files.newBufferedReader(filePath)){
			while((line= sourceFile.readLine())!= null){
				addAnswer(line);
			}
		}
		catch(IOException exception){
			System.err.println("Problem with opening file: "+exception);
		}
	}
	private void addAnswer(String line){
		String answer = AnswerExtraction.getAnswerFrom(line);
		answers.setAnswer(answer);
	}
}
