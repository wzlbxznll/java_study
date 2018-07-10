package com.shiyanlou;

public class NewObject {

	public static void main(String[] args) {
			People WangZhongling =new People(163,22,0);
			
			WangZhongling.age=23;
			WangZhongling.setHeight(160.0);
			WangZhongling.printBaseMes();
			WangZhongling.laugh();
			System.out.println("WangZhongling的身高是"+WangZhongling.getHeight());
	}

}
