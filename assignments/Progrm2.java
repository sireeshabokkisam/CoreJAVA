package com.abcd.javaio;


public class Programm2{
	static void m1(int a)
	{
		System.out.println("Before if");
		if(a==10)
		{
			System.out.println("system if");
			return;
		}
		System.out.println("after if");
		System.out.println("Hi");
	}
	static int m2(int a)
	{
		System.out.println("Before if");
		if(a==10) {
			System.out.println("in if");
			return a+10;
		}
		System.out.println("after if");
		System.out.println("Hi");
		return 50;
	}
				public static void main(String[] args)
				{
					m1(10);
					m1(20);
					m2(10);
					m2(20);
				}
	}
