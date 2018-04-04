package vlib.impl;

import java.io.File;

import vlib.inter.AdvancedJudger;

public class CSProjJudger implements AdvancedJudger {

	@Override
	public void judgeCProj(File file, Integer userId, Integer courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void judgeJavaProj(File file, Integer userId, Integer courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void judgeCSProj(File file, Integer userId, Integer courseId) {
		
		System.out.println("judged a c# proj, user ID is:" + userId);
		
	}

	@Override
	public void judgeDBProj(File file, Integer userId, Integer courseId) {
		// TODO Auto-generated method stub
		
	}

}
