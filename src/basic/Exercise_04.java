package basic;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("a�� ��: ");
		int a= sc.nextInt();
		int b=0;
		do {
			System.out.print("b�� ��: ");
			b= sc.nextInt();
			System.out.println("a���� ū ���� �Է��ϼ���!!");
		}while (a<=b);
		
		System.out.println("b - a�� "+(b-a)+"�Դϴ�.");
	}

}
