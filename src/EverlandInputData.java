import java.util.ArrayList;
import java.util.Scanner;

public class EverlandInputData {
	
	public ArrayList<String> inputDate(ArrayList<String> selectDate, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이용날짜를 입력하세요.(숫자로만 8자리)");
		selectDate.add(sc.next());
		if (selectDate.get(count).length() != 8) {
			while (selectDate.get(count).length() != 8) {
				selectDate.remove(count);
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				selectDate.add(sc.next());
			}
		}
		return selectDate;
	}
	
	public ArrayList<String> inputRegNum(ArrayList<String> regNum, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력하세요.(숫자로만 6자리)");
		regNum.add(sc.next());
		if (regNum.get(count).length() != 6) {
			while (regNum.get(count).length() != 6) {
				regNum.remove(count);
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

}
