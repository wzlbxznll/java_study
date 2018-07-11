package com.shiyanlou;

public class Dog extends Animal {
			
			public Dog() {
				super.bark();
				super.legNum=3;
				System.out.println(this.legNum);
				System.out.println("子类的构造方法被调用!");
			}
			
			public void bark() {
				System.out.println("汪！汪！汪！");
			}
			
			public void dogType() {
				System.out.println("这是条狗。");
			}
			
}
