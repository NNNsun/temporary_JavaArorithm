package search;

import java.util.Scanner;
//�����˻�
public class BinSearch {
	static int binSearch(int[]a,int n, int key) {//n:�迭����
		int pl=0; //��
		int pr=n-1; //��
		
		while (pl<=pr) {
			int pc=(pl+pr)/2;
			if(a[pc]==key) return pc;
			else if (a[pc]<key) pl=pc+1;
			else pr=pc=1;
		}
		
		return -1; //������
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�迭����: ");
		int num=stdIn.nextInt();
		int[]x=new int [num];
		System.out.println("������������ �Է��ϼ���.");
		System.out.print("x[0]: ");
		x[0]=stdIn.nextInt();
		
		for (int i=1; i<num; i++) { //num:�ν��Ͻ� �迭����
			while(x[i]<x[i-1]) { //�������� �˻� 
				System.out.print("x["+i+"]: ");
				x[i]=stdIn.nextInt();
			} //�������� �˻�
		}
		System.out.print("�˻��� ��: ");
		int ky=stdIn.nextInt();
		int idx=binSearch(x, num, ky);
		if(idx==-1) System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
}
