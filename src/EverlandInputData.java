import java.util.ArrayList;
import java.util.Scanner;

public class EverlandInputData {
	
	public ArrayList<String> inputDate(ArrayList<String> selectDate) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̿볯¥�� �Է��ϼ���.(���ڷθ� 8�ڸ�)");
		selectDate.add(sc.next());
		int index = selectDate.size() - 1;
		if (selectDate.get(index).length() != 8) {
			while (selectDate.get(index).length() != 8) {
				selectDate.remove(index);
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				selectDate.add(sc.next());
			}
		}
		return selectDate;
	}
	
	public ArrayList<String> inputRegNum(ArrayList<String> regNum) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ ���ڸ��� �Է��ϼ���.(���ڷθ� 6�ڸ�)");
		regNum.add(sc.next());
		int index = regNum.size() - 1;
		if (regNum.get(index).length() != 6) {
			while (regNum.get(index).length() != 6) {
				regNum.remove(index);
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				regNum.add(sc.next());
			}
		}
		return regNum;
	}
	
	public ArrayList<Integer> inputQuantity(ArrayList<Integer> quantity) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�?");
		quantity.add(sc.nextInt());
		return quantity;
	}
	
	public ArrayList<Integer> inputPreferentialNum(ArrayList<Integer> preferentialNum) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����ϼ���.\n1. ����\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��");
		preferentialNum.add(sc.nextInt());
		return preferentialNum;
	}
	
	public int inputEndSequence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�߰� : 0, ���� : 1");
		int endNum = sc.nextInt();
		return endNum;
	}
}
