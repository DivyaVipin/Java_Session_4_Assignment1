package com.assignment.package1;

public class ProtectedClass {
	
	public void publicDisplay() {
		System.out.println("Inside Method with PUBIC Access Modifier");
	}
	private void privateDisplay() {
		System.out.println("Inside Method with private Access Modifier");
	}
	protected void protectedDisplay() {
		System.out.println("Inside Method with protected Access Modifier");
	}
	public void getProtectedDisplay()
	{
		protectedDisplay();
		System.out.println("By calling protected method call inside public method");
	}
}
