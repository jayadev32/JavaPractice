package org.duplicates;



import java.util.LinkedHashSet;
import java.util.Set;


public class Duplicates {
	public static void main(String[] args) {
		int[] ar = new int[5];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 10;
		ar[4] = 30;
		
		int length = ar.length;
		System.out.println(length);

		Set<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < ar.length; i++) {
			s.add(ar[i]);

		}
		for (Integer arr : s) {
			System.out.println(arr);

		}
	}

}
