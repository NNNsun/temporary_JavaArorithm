package Stack_Queue;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue data = new IntQueue(6);

		while (true) {
			System.out.println("���� data ��: " + data.size() + " /" + data.capacity());
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ  (4)����  (0)����: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x ;
			switch (menu) {
			case 1:
				System.out.print("������: ");
				x = stdIn.nextInt();
				try {
					data.enque(x);
				} catch (IntQueue.OverflowIntQueueExcepion e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;

			case 2:
				try {
					x=data.dnque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");

				} catch (IntQueue.EmptyIntQueueExcepion e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
				
			case 3:
				try {
					x=data.peek();
					System.out.println("��ũ�� �����ʹ� "+ x+ "�Դϴ�.");

				} catch (IntQueue.EmptyIntQueueExcepion e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
			case 4:
				data.dump();
				break;
			}
		}

	}
}
