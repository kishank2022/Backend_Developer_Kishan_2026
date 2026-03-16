package com.learn.java.backend._6.daily.task.DailyTaskBackendDeveloper.core.java;

public class PrintNNaturalNumber {

	// Question 1 - Print n natural no. without using any loop in java
	public static void test1(int start_n, int last_n) {
		if(start_n <= last_n) {			
			System.out.print(start_n+" ");
			test1(start_n+1, last_n);
		}
	}	
	
	public static void main(String[] args) {
//		test1(1, 10);
		StringBuilder sb = new StringBuilder();
		int current = 1; int end = 10;
		build_using_stringBuilder(sb, current, end);
		System.out.println(sb.toString());
	}
	
	
	
	// Question 2 - Print N Natural no.s using static block
	// static block are the blocks that executes before the main method starts executing
	static {
		test2(1, 7);
		System.out.println();
	}
	public static void test2(int start, int end) {
		if(start <= end) {			
			System.out.print(start+" ");
			test2(start + 1, end);
		}
	}
	
	
	// Question3 - Print N natural no.s using String Builder in java
	public static void build_using_stringBuilder(StringBuilder sb , int current, int end) {
		if(current>end) {
			return;
		}
		sb.append(current);
		if(current<end) {
			sb.append(" ");
		}
		build_using_stringBuilder(sb, current + 1, end);
	}
	
	
	
}
