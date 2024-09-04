package test.interview.execution;

import java.util.*;
import java.util.Map.Entry;

public class testExample {
	
	public static void main(String args[]) {
		
		try {
			
			System.out.println("Hello world");

			testExample a = new testExample();
			a.switchEx(11);
			
			switchEx(10);
			HashMap<String, Integer> hs = new HashMap<String, Integer>();
			hs.put("Interview", 1);
			hs.put("Disney", 2);
			
			Thread.sleep(5000);
			
			for(Entry<String, Integer> mHs : hs.entrySet()) {
				System.out.println();
			}
			
		} catch(Exception e) {
			System.out.println("Exception : " + e);
		}
 		

		

	}
	
	public static void switchEx(int testSwtich) {
		int num = testSwtich;
		switch(num) {
		
		case 10: System.out.println("Value passed is 10");
		break;
		
		default: System.out.println("Matched nothing");
		
		}
	}

}
