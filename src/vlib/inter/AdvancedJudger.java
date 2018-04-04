package vlib.inter;

import java.io.File;

public interface AdvancedJudger {
	
	public void judgeCProj(File file, Integer userId, Integer courseId);
	public void judgeJavaProj(File file, Integer userId, Integer courseId);
	public void judgeCSProj(File file, Integer userId, Integer courseId);
	public void judgeDBProj(File file, Integer userId, Integer courseId);

}
