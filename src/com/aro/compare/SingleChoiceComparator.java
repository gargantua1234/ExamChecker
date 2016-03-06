package com.aro.compare;

import java.util.Iterator;

import com.aro.answer.Answers;

public class SingleChoiceComparator implements AnswerComparator {

	@Override
	public int compareAnswers(Answers answerPattern, Answers givenAnswer) {
		int points = 0;
		Iterator<String> patternIterator = answerPattern.getAnswers().iterator();
		Iterator<String> givenIterator = givenAnswer.getAnswers().iterator();
		
		while(patternIterator.hasNext() && givenIterator.hasNext())
			points += compare(patternIterator.next(), givenIterator.next());
		
		return points;
	}
	
	public int compare(String pattern, String given){
		if(pattern.equals(given))
			return Point.POINT.value;
		else 
			return Point.ZERO.value;
		
	}
	
	

}
