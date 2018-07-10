package com.shiyanlou;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class People {

	private double height;
	private int age;
	private int sex;
	private String name="WangZhongling";
			
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
		if(this.sex==0)
			System.out.println("我是男性！");
		else
			System.out.println("我是女性！");
	}
	double getHeight() {
		return height;	
	}
	void setHeight(double height) {
		this.height=height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public class Student{
		String ID="2018206";
		
		 void stuInfo() {
			 System.out.println("访问外部类中的name:"+name);
			 System.out.println("访问内部类中的ID:"+ID);
		 }
	}
	
	public static void main(String[] args) {
		People a=new People();
		Student b=a.new Student();
		b.stuInfo();
	}
}
