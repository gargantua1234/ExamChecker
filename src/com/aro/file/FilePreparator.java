package com.aro.file;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FilePreparator {
	private String examsDirectory;
	
	public FilePreparator(String examsDirectory){
		this.examsDirectory = examsDirectory;
	}
	
	public List<String> prepareFiles()throws IOException{
		FileColector files = new FileColector(new LinkedList<String>());
		FileVisitor visitor = new FileVisitor(files);
		
		DirectoryTraverser traverser = new DirectoryTraverser();
		traverser.traverse(examsDirectory, visitor);
		
		return files.getExamsFiles();
	}
}
