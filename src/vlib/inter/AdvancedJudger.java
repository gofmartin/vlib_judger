package vlib.inter;

import java.io.File;

public interface AdvancedJudger {
	
	public void judgeCProj(File file, Integer userId);
	public void judgeJavaProj(File file, Integer userId);
	public void judgeCSProj(File file, Integer userId);

}
