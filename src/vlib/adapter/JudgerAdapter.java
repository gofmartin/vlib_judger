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
			advancedJudger.judgeCProj(file, userId);
		}
		else if(projType.equalsIgnoreCase("java")) {
			advancedJudger.judgeJavaProj(file, userId);
		}
		else if(projType.equalsIgnoreCase("cs")) {
			advancedJudger.judgeCSProj(file, userId);
		}

	}

}
