package com.shiyanlou;

public class CellPhone extends TelePhone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("打电话");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("发短信");

	}

	public static void main(String[] args) {
		CellPhone mi6 = new CellPhone();
		mi6.call();
		mi6.message();

	}

}
