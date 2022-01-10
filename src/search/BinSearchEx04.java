package search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//PhysExamSearch
public class BinSearchEx04 {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		public String toString() {
			return name+" "+height+" "+vision;
		}
		public static final Comparator<PhyscData>VISION_ORDER =new VisionOrderComparator();
		
		private static class VisionOrderComparator  implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision>d2.vision)?1 :
					(d1.vision<d2.vision)?-1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		PhyscData[]x = {
				new PhyscData("�̳���", 162, 0.1),
				new PhyscData("����ȣ", 168, 0.2),
				new PhyscData("�����", 151, 0.4),
				new PhyscData("ä���", 164, 0.7),
				new PhyscData("�Ȼ��", 186, 1.2),
				new PhyscData("���¹�", 152, 1.3),
				new PhyscData("��ö��", 190, 1.7)
		};
		System.out.print("ã�� �÷����� ");
		double  vision   =stdIn.nextDouble();
		int idx=Arrays.binarySearch(
				x,
				new PhyscData("",0 ,vision),
				PhyscData.VISION_ORDER
				);
		
		if(idx<0) 
			System.out.println("data�� �����ϴ�.");
		else {
			System.out.println("x["+idx+"]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������: "+x[idx]);
		}

	}

}
