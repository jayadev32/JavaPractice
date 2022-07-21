package org.controlstatement;

public class CountOfOddAndEven {
	
	//count of odd num from 1-500
	public static void main(String[] args) {
		
		int count =0;
		for (int i = 1; i <=500; i++) {
			if (i%2!=0) {
				count++;
			} 
			
			
		}
		System.out.println(count);
		
		//print count of even numbers from 1-500
		int countEven=0;
		for (int i = 0; i <=500; i++) {
			if (i%2==0) {
				countEven++;
			}
			
		}
		
		System.out.println(countEven);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
