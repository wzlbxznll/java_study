package com.shiyanlou;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class People {

	double height;
	int age;
	int sex;
	
	public People() {
		
	}
	
	public People(double h, int a, int s) {
		height=h;
		age=a;
		sex=s;
	}
	
	void cry() {
		System.out.println("我在哭！");
	}
	void laugh() {
		System.out.println("我在笑！");
	}
	void printBaseMes() {
		System.out.println("我的身高是"+height+"cm");
		System.out.println("我的年龄是"+age+"岁");
		if(this.age==0)
			System.out.println("我是男性！");
		else
			System.out.println("我是女性！");
		
	}
}
