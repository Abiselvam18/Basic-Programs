package com.basics5;
interface myint{
	int i=9;    //public static final int i=9;
	void m1();   //abstract public void m1();
}
class MyClass implements myint{

	@Override
	public void m1() {
		System.out.println("m1 method of interface");
		
	}
}
public class Interface {
	public static void main(String[] args) {
		MyClass ob=new MyClass();
          ob.m1();
}
}