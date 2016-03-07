package com.aro.file;

import java.io.IOException;
import java.nio.file.*;

public class DirectoryTraverser {

	
	public void traverse(String start, FileVisitor visitor)throws IOException{
		Path path = Paths.get(start);
		Files.walkFileTree(path, visitor);
	}
}
