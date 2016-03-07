package com.aro.file;

import java.nio.file.Path;
import java.util.List;

public class FileColector implements VisitAction {
	private List<String> examsFiles;
	
	 public FileColector(List<String> contener) {
		this.examsFiles = contener;
	}
	
	@Override
	public void visitFile(Path file) {
		String fileName = file.toString();
		examsFiles.add(fileName);
	}
	
	public List<String> getExamsFiles(){
		return examsFiles;
	}

}
