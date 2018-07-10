package com.shiyanlou;

public class Table {
		double height;     //高度
		double t_length;   //长度
		double t_wide;      //宽度
		String   texture;   //材质
		String   color;  //颜色
		Table(){
		
		}
		public static void main(String [] args) {
			Table desk =new Table();
			desk.color="red";
			desk.height=120;
			desk.t_length=150;
			desk.t_wide=50;
		}
}