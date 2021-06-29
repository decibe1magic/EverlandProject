import java.util.ArrayList;
import java.util.Scanner;

public class EverlandInputData {
	
	public ArrayList<String> inputDate(ArrayList<String> selectDate) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이용날짜를 입력하세요.(숫자로만 8자리)");
		selectDate.add(sc.next());
		int index = selectDate.size() - 1;
		if (selectDate.get(index).length() != 8) {
			while (selectDate.get(index).length() != 8) {
				selectDate.remove(index);
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				selectDate.add(sc.next());
			}
		}
		return selectDate;
	}
	
	public ArrayList<String> inputRegNum(ArrayList<String> regNum) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력하세요.(숫자로만 6자리)");
		regNum.add(sc.next());
		int index = regNum.size() - 1;
		if (regNum.get(index).length() != 6) {
			while (regNum.get(index).length() != 6) {
				regNum.remove(index);
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				regNum.add(sc.next());
			}
		}
		return regNum;
	}
	
	public ArrayList<Integer> inputQuantity(ArrayList<Integer> quantity) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개를 주문하시겠습니까?");
		quantity.add(sc.nextInt());
		return quantity;
	}
	
	public ArrayList<Integer> inputPreferentialNum(ArrayList<Integer> preferentialNum) {
		Scanner sc = new Scanner(System.in);
		System.out.println("우대사항을 선택하세요.\n1. 없음\n2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부");
		preferentialNum.add(sc.nextInt());
		return preferentialNum;
	}
	
	public int inputEndSequence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 : 0, 종료 : 1");
		int endNum = sc.nextInt();
		return endNum;
	}
}
