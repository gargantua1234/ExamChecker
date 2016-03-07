package com.aro.compare;

public class MultipleChoiceComparator extends SingleChoiceComparator{
	
	@Override
	public int compare(String pattern, String given){
		if(given.equals(EMPTY))
			return Point.ZERO.value;
		else if(pattern.equals(given))
			return Point.DOUBLE_P.value;
		else if (pattern.contains(given))
			return Point.POINT.value;
		else
			return Point.ZERO.value;
	}

}
