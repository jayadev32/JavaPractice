package org.overriding;

public class ICICIbbank extends AxisBank {
	
	@Override
	public void savings() {
		System.out.println("ICICIbank:");
		super.savings();
	}
}
