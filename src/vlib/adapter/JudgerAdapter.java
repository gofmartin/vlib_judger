package vlib.adapter;

import java.io.File;

import vlib.impl.CProjJudger;
import vlib.impl.CSProjJudger;
import vlib.impl.JavaProjJudger;
import vlib.inter.AdvancedJudger;
import vlib.inter.Judger;

public class JudgerAdapter implements Judger {
	
	AdvancedJudger advancedJudger;
	
	public JudgerAdapter(String projType) {
		
		if(projType.equalsIgnoreCase("c")) {
			advancedJudger = new CProjJudger();
		}
		else if(projType.equalsIgnoreCase("java")) {
			advancedJudger = new JavaProjJudger();
		}
		else if(projType.equalsIgnoreCase("cs")) {
			advancedJudger = new CSProjJudger();
		}
		
	}

	@Override
	public void judge(String projType, File file, Integer userId, Integer courseId) {
		
		if(projType.equalsIgnoreCase("c")) {
			//判定c语言程序的具体实现
			advancedJudger.judgeCProj(file, userId, courseId);
			
		}
		else if(projType.equalsIgnoreCase("java")) {
			//判定java程序的具体实现
			advancedJudger.judgeJavaProj(file, userId, courseId);
			
		}
		else if(projType.equalsIgnoreCase("cs")) {
			//判定C#程序的具体实现
			advancedJudger.judgeCSProj(file, userId, courseId);
			
		}

	}

}
