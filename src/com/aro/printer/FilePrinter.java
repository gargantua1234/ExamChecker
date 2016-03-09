package com.aro.printer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FilePrinter implements Printer {
	private Path destinationFile;
	private Charset charset = Charset.forName("UTF-8");
	
	public FilePrinter(String filePath) {
		this.destinationFile = Paths.get(filePath);
	}

	@Override
	public void printResult(Map<String, Integer> result) {
		try (BufferedWriter destination = Files.newBufferedWriter(destinationFile, charset)){
			writeResult(destination, result);
		}
		catch(IOException exception){
		}
	}
	
	public void writeResult(BufferedWriter bw, Map<String,Integer> res)throws IOException{
		for(Map.Entry<String, Integer> entry: res.entrySet())
			bw.write(entry.getKey()+": " +entry.getValue()+" points\n");
	}

}
