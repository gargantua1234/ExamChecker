package com.aro.compare;

import java.util.Iterator;
import java.util.List;


public class SingleChoiceComparator implements AnswerComparator {

	@Override
	public int compareAnswers(List<String> answerPattern, List<String> givenAnswer) {
		int points = 0;
		Iterator<String> patternIterator = answerPattern.iterator();
		Iterator<String> givenIterator = givenAnswer.iterator();
		
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
