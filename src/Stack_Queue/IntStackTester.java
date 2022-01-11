package Stack_Queue;
import java.util.Scanner;
public class IntStackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack data = new IntStack(8); //capacity�� �Է�

		while (true) {
			System.out.println("���� ������ ��: " + data.size() + " /" + data.capacity());
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ  (4)����  (0)����: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // Ǫ��
				System.out.print("������: ");
				x = stdIn.nextInt();
				try {
					data.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					data.pop();
				} catch (IntStack.EmptyIntStackExcption e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
			case 3:
				try {
					x = data.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackExcption e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
			case 4:
				data.dump();
				break;
			}
		}
	}

}
