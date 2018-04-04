package vlib.inter;

import java.io.File;

public interface Judger {
	
	public void judge(String projType, File file, Integer userId, Integer courseId);
	
}
