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
		System.out.println("이용날짜를 입력하세요.(숫자로만 8자리)");
		selectDate = sc.next();
		if (selectDate.length() != 8) {
			while (selectDate.length() != 8) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				selectDate = sc.next();
			}
		}
		return selectDate;
	}
	
	public ArrayList<ArrayClass> inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 앞자리를 입력하세요.(숫자로만 6자리)");
		regNum = sc.next();
		if (regNum.length() != 6) {
			while (regNum.length() != 6) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				regNum = sc.next();
			}
		}
		System.out.println("몇 개를 주문하시겠습니까?");
		quantity = sc.nextInt();
		
		System.out.println("우대사항을 선택하세요.\n1. 없음\n2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부");
		preferentialNum = sc.nextInt();
		
		arrData.add(new ArrayClass(selectDate,regNum,quantity,preferentialNum));
		return arrData;
	}
	
	public int inputEndSequence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 : 0, 종료 : 1");
		int endNum = sc.nextInt();
		return endNum;
	}
}
