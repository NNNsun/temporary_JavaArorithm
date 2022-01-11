package Stack_Queue;

//Integer �� ����
class IntStack {
	private int max;   //���� �뷮
	private int ptr;   //���� ������, �׳� int ����
	private int[] stk; //���� ��ü
	
	//���� �� ����: ������ ��� ����
	public class EmptyIntStackExcption extends RuntimeException{
		public EmptyIntStackExcption() {}
	}
	//���� �� ����: ������ ���� ��
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	//������
	public IntStack(int capacity) {//capcity: �뷮
		ptr=0;
		max=capacity;
		try {
			stk=new int[max];			//���� ��ü�� �迭�� ����, stack element�� �� = stk[0]~stk[max-1]
		}catch (OutOfMemoryError e) {	//�����Ҽ� ����
			max=0;
		}
	}
	//���ÿ� x�� push
	public int push(int x)throws OverflowIntStackException {
		if (ptr>=max) { //������ �������� ���
			throw new OverflowIntStackException();
		}
		return stk[ptr++]=x;
		
	}
	//���ÿ��� �����͸� pop(���� �ִ� data�ϳ��� ����)
	public int  pop()throws EmptyIntStackExcption {
		if(ptr<=0)
			throw new EmptyIntStackExcption();
		return stk[--ptr];
	}
	//���ÿ��� �����͸� peek(���� �ִ� data�� ���� ��)
	public int peek() throws EmptyIntStackExcption {
		if(ptr<=0)
			throw new EmptyIntStackExcption();
		return stk[ptr-1];
	}
	//���ÿ��� x�� ã�� �ε���(������ -1)��ȯ
	public int indexOf(int x) {
		for(int i=ptr-1;i>=0;i--)
			if(stk[i]==x)
				return i;
			return -1;
	}
	//������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	//���ÿ� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return ptr;
	}
	//������ ����°�?
	public boolean isEmpty() {
		return ptr<=0;
	}
	//������ ���� ã�°�?
	public boolean isFull() {
		return ptr>=max;
	}
	//���� ���� ��� �����͸� �ٴ�->����� ������ ���
	public void dump() {
		if(ptr<=0)
			System.out.println("������ ������ϴ�.");
		else {
			for(int i=0;i<ptr;i++)
				System.out.println(stk[i]+" ");
			System.out.println();
		}
	}
	
}
