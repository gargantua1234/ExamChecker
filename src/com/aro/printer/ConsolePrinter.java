package com.aro.printer;

import java.util.Map;

public class ConsolePrinter implements Printer {
	
	@Override
	public void printResult(Map<String, Integer> result){
		for(Map.Entry<String, Integer> entry: result.entrySet())
			System.out.printf("%s: %3d points%n",entry.getKey(), entry.getValue());
	}
}
