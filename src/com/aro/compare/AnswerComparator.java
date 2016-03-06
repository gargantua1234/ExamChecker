package com.aro.compare;

import com.aro.answer.Answers;

public interface AnswerComparator {
	public static final String EMPTY= "";
	
	enum Point{
		MINUS_PT(-1), ZERO(0), POINT(1);
				
		public final int value;
		
		private Point(int value) {
			this.value = value;
		}
	}
	
	public int compareAnswers(Answers correct, Answers given);
}
