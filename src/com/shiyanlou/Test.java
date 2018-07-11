package com.shiyanlou;

public class Test {

	public static void main(String[] args) {
//			Dog a =new Dog();
//			a.legNum=4;
//			a.bark();
			Animal a=new Animal();
			Dog d=new Dog();
			Animal b= new Dog();
//			a.bark();
//			d.bark();
//			b.bark();
//			Dog a =new Dog();
			a.bark();
			b.bark();
/*			b.dogType();    //编译不通过。
			向上转型，在运行时，会遗忘子类对象中与父类对象中不同的方法，
			也会覆盖与父类中相同的方法。*/
			d.bark();
			d.dogType();
	}

}
