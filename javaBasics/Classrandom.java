package javaBasics;

public class Classrandom {
	public static void main(String[] args) {
		
		int value = (int)(Math.random()*90+10);  
		 //[0.0,1.0)-->[0.0,90.0)-->[10,100)
		System.out.println(value);
	}


}
