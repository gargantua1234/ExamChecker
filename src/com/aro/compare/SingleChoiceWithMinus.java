package com.aro.compare;

public class SingleChoiceWithMinus extends SingleChoiceComparator {
	
	@Override
	public int compare(String pattern, String given){
		if(pattern.equals(given))
			return Point.POINT.value;
		else if (given.equals(EMPTY))
			return Point.ZERO.value;
		else 
			return Point.MINUS_PT.value;
		
	}
}
