package my;

import java.util.Scanner;

public class calcurater {
//�Ӽ��ʵ�
	//int number1 = 0;
	//int number2 = 0;
	//�޼ҵ� (�Լ����)
	public int plus(int x, int y, int z) 
	{
		int total = x + y + z;
		return total;
	
	}
	
	public static void main(String[] ars) {
		int num1,num2,num3;
		System.out.println("�ΰ� �����Է�");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		//���� �޼ҵ忡�� ��ü����
		calcurater cal = new calcurater();
		int result = cal.plus(num1,num2,num3);
		System.out.println("result:" + result);
		
		
		
	}
}
