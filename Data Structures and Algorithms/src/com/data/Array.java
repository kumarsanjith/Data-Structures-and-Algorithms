package com.data;

public class Array {
	public static void main(String args[]) {
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		int index = -1;
		for(int i =0; i<intArray.length; i++) {
			if(intArray[i] == 5) {
				index = i;
				break;
			}
		}
		System.out.println("Index:" +index);
	}
}
