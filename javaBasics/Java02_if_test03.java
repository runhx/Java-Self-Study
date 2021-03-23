package javaBasics;

public class Java02_if_test03 {
	
	public static void main(String[] args) {
		
		//随机数的产生:10~99
		//Math.radom
		//公式:[a,b] : (int)(Math.random()*(b-a+1)+a)
		int value = (int)(Math.random()*90+10);//[0.0,1.0)-->[0.0,90.0)-->[10,100)
		System.out.println(value);
		
		
	}

}

