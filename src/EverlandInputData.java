import java.util.ArrayList;
import java.util.Scanner;

public class EverlandInputData {
	
	public ArrayList<String> inputDate(ArrayList<String> selectDate, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̿볯¥�� �Է��ϼ���.(���ڷθ� 8�ڸ�)");
		selectDate.add(sc.next());
		if (selectDate.get(count).length() != 8) {
			while (selectDate.get(count).length() != 8) {
				selectDate.remove(count);
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				selectDate.add(sc.next());
			}
		}
		return selectDate;
	}
	
	public ArrayList<String> inputRegNum(ArrayList<String> regNum, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ ���ڸ��� �Է��ϼ���.(���ڷθ� 6�ڸ�)");
		regNum.add(sc.next());
		if (regNum.get(count).length() != 6) {
			while (regNum.get(count).length() != 6) {
				regNum.remove(count);
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

}
