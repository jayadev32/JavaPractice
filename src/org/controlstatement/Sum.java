package org.controlstatement;

public class Sum {
	public static void main(String[] args) {

		// sum of 1-10
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}

		System.out.println(sum);

		//sum of odd from 1-100
		int sumOdd=0;
		for (int i = 1; i <=100; i++) {
			if (i%2!=0) {
				sumOdd+=i;
			}
			System.out.println(sumOdd);
		}
		
		
		
		
	}

}
