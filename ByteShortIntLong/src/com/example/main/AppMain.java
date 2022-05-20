package com.example.main;

public class AppMain {

	public static void main(String[] args) {
		
		//declaring an int variable
		
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		
		int MyMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer min value: "+ myMinIntValue);
		System.out.println("Integer max value: "+ MyMaxIntValue);
		
		System.out.println("Busted MAX value = "+(MyMaxIntValue+1));
		System.out.println("Busted MIN value = "+(myMinIntValue -1));
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		System.out.println("Byte Minimum Value = "+myMinByteValue);
		System.out.println("Byte MaximumValue = "+myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println("Short Minimum Value = "+myMinShortValue);
		System.out.println("Short MaximumValue = "+myMaxShortValue);
		
		long myLongValue = 100L;
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println("Long Minimum Value = "+myMinLongValue);
		System.out.println("Long MaximumValue = "+myMaxLongValue);
		
		long bigLongLiteralValue = 2_147_483_647_234L;
		
		int myTotal = (myMinIntValue / 2);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		
		short myNewShortValue = (short) (myMinShortValue / 2);
		
		byte myByteVariable = 109;
		
		short myShortVariable = 30000;
		
		int myIntVariable = 100000000;
		
		long myLongVariable = 50000L + 10L* (myByteVariable+ myShortVariable+ myIntVariable);
		
		System.out.println("My long variable value is: "+myLongVariable);
		
		

	}

}
