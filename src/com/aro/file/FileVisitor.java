package com.aro.file;

import static java.nio.file.FileVisitResult.CONTINUE;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitor extends SimpleFileVisitor<Path> {
	private VisitAction action;
	
	public FileVisitor(VisitAction action) {
		this.action = action;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attributes ){
		action.visitFile(file);
		return CONTINUE;
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path directory, BasicFileAttributes attributes){
		return CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exception){
		System.err.println(exception);
		return CONTINUE;
	}
}