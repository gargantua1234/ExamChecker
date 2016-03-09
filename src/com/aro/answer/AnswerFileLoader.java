package com.aro.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class AnswerFileLoader{
	
	public List<String> loadAnswers(Path filePath)throws IOException{
		String line;
		List<String> answers = new LinkedList<>();
		BufferedReader sourceFile = Files.newBufferedReader(filePath);
		while((line= sourceFile.readLine())!= null){
			addAnswer(line, answers);
		}
		return answers;
	}
	private void addAnswer(String line, List<String> answers){
		String answer = AnswerExtraction.getAnswerFrom(line);
		answers.add(answer);
	}
}
