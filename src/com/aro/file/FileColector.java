package com.aro.file;

import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class FileColector implements VisitAction {
	private List<String> examsFiles = new LinkedList<>();
	
	@Override
	public void visitFile(Path file) {
		String fileName = file.toString();
		examsFiles.add(fileName);
	}
	
	public List<String> getExamsFiles(){
		return examsFiles;
	}

}
