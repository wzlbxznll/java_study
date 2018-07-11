package com.shiyanlou;

public class taxi implements car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i'm running!");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("my light has been broken!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car t = new taxi();
		t.run();
		t.light();
	}

}
