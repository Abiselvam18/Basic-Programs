package com.basics4;

//Different Blocks
//main, constructor, static, method, normal block

public class DifferentBlocksInJava {

	static {
		System.out.println("static executes before main");
	}
	//normal block
	{
		System.out.println("normal block");
		System.out.println("normal block will executes on object creation before constructor");
	}
	DifferentBlocksInJava(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		System.out.println("MainBlock");
		DifferentBlocksInJava ob=new DifferentBlocksInJava();
	}

}

