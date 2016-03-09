package com.aro.compare;

import java.util.List;

public interface AnswerComparator {
	public static final String EMPTY= "";
	
	enum Point{
		MINUS_PT(-1), ZERO(0), POINT(1), DOUBLE_P(2);
				
		public final int value;
		
		private Point(int value) {
			this.value = value;
		}
	}
	
	public int compareAnswers(List<String> correct, List<String> student);
}
