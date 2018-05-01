package my;

import java.util.Scanner;

public class calcurater {
//속성필드
	//int number1 = 0;
	//int number2 = 0;
	//메소드 (함수기능)
	public int plus(int x, int y, int z) 
	{
		int total = x + y + z;
		return total;
	
	}
	
	public static void main(String[] ars) {
		int num1,num2,num3;
		System.out.println("두개 숫자입력");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		//메인 메소드에서 객체생성
		calcurater cal = new calcurater();
		int result = cal.plus(num1,num2,num3);
		System.out.println("result:" + result);
		
		
		
	}
}
