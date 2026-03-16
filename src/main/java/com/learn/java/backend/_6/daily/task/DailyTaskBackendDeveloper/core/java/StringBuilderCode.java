package com.learn.java.backend._6.daily.task.DailyTaskBackendDeveloper.core.java;

public class StringBuilderCode {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("012345");
		sb.append("6789");
		System.out.println(sb.toString()); // 0123456789
		sb.insert(2, "munna_bhai");
		System.out.println(sb.toString()); // 01munna_bhai23456789
		sb.delete(3, 5);                   // 0123456789  
		System.out.println(sb.toString()); // 01mna_bhai23456789 // 3 chod ke 4 and 5 ko delete kiya hai
		sb.reverse();
		System.out.println(sb.toString()); // 98765432iahb_anm10
		sb.replace(1, 3, "OK");
		System.out.println(sb.toString()); // 9OK65432iahb_anm10
		/* replace( start, end, newString) // 
		 StringIndexOutOfBoundsException - if start is negative, greater than length(), or greater than end.
		 The substring begins at the specified start and extends to the character at index end - 1 or 
		 to the end of the sequence if no such character exists. First the characters in the substring
		 are removed and then the specified String is inserted at start.
		
		*/
	}
}
