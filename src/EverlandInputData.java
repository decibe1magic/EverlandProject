import java.util.ArrayList;
import java.util.Scanner;

public class EverlandInputData {
	String selectDate;
	String regNum;
	int quantity;
	int preferentialNum;
	
	public ArrayList<ArrayClass> arrData = new ArrayList<ArrayClass>();
	
	public String selectDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̿볯¥�� �Է��ϼ���.(���ڷθ� 8�ڸ�)");
		selectDate = sc.next();
		if (selectDate.length() != 8) {
			while (selectDate.length() != 8) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				selectDate = sc.next();
			}
		}
		return selectDate;
	}
	
	public ArrayList<ArrayClass> inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ ���ڸ��� �Է��ϼ���.(���ڷθ� 6�ڸ�)");
		regNum = sc.next();
		if (regNum.length() != 6) {
			while (regNum.length() != 6) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				regNum = sc.next();
			}
		}
		System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�?");
		quantity = sc.nextInt();
		
		System.out.println("�������� �����ϼ���.\n1. ����\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��");
		preferentialNum = sc.nextInt();
		
		arrData.add(new ArrayClass(selectDate,regNum,quantity,preferentialNum));
		return arrData;
	}
	
	public int inputEndSequence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�߰� : 0, ���� : 1");
		int endNum = sc.nextInt();
		return endNum;
	}
}
