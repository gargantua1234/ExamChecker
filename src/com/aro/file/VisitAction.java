package com.aro.file;

import java.nio.file.Path;

public interface VisitAction {
	
	public void visitFile(Path file);
}
