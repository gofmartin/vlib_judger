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
			//�ж�c���Գ���ľ���ʵ��
			advancedJudger.judgeCProj(file, userId, courseId);
			
		}
		else if(projType.equalsIgnoreCase("java")) {
			//�ж�java����ľ���ʵ��
			advancedJudger.judgeJavaProj(file, userId, courseId);
			
		}
		else if(projType.equalsIgnoreCase("cs")) {
			//�ж�C#����ľ���ʵ��
			advancedJudger.judgeCSProj(file, userId, courseId);
			
		}

	}

}
