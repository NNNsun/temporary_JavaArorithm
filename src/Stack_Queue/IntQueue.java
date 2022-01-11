package Stack_Queue;

public class IntQueue {
	private int max; // ť�� �뷮
	private int front; // ù��° element cursor
	private int rear; // ������ element cursor
	private int num; // ���� data ��
	private int[] que; // ť ��ü

	// ���� �� ����: ť�� �������
	public class EmptyIntQueueExcepion extends RuntimeException {
		public EmptyIntQueueExcepion() {
		}
	}

	// ���� �� ���� :ť�� ���� ������
	public class OverflowIntQueueExcepion extends RuntimeException {
		public OverflowIntQueueExcepion() {
		}
	}

	// ������
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// ť�� data�� ��ť
	public int enque(int x) throws OverflowIntQueueExcepion {
		if (num >= max)
			throw new OverflowIntQueueExcepion();
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// ť�� data�� ��ť
	public int dnque() throws EmptyIntQueueExcepion {
		if (num <= 0)
			throw new EmptyIntQueueExcepion();
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// ť���� data�� ��ũ(front data�� �鿩�� ��)
	public int peek() throws EmptyIntQueueExcepion {
		if (num <= 0)
			throw new EmptyIntQueueExcepion();
		return que[front];
	}

	// ť���� x�� �˻��Ͽ� �ε���(ã�����ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	//�˻��� �����Ͱ� ���°�ִ��� �˷���
	public int search(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x)
				return i+1;
		}
		return 0;
	}
	
	// ť ���
	public void clear() {
		num = front = rear = 0;
	}

	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ť�� ����ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ť�� ���� á����?
	public boolean isFull() {
		return num >= max;
	}

	// ť ���� ��� �����͸� ����Ʈ ->���� ������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ����ֽ��ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}
