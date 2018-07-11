package com.shiyanlou;

public class Animal {
		public int legNum= 4;
		
		public Animal() {
			System.out.println("动物有"+legNum+"腿");
			System.out.println("父类的构造方法被调用!");
		}
		
		public void bark() {
			System.out.println("动物叫!");
		}
}
