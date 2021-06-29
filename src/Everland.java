import java.util.Scanner;

public class Everland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int endSequence = 0;

		Scanner sc = new Scanner(System.in);
		EverlandArrayClass arrayClass = new EverlandArrayClass();
		EverlandProcess everlandProcess = new EverlandProcess();
		EverlandInputData inputData = new EverlandInputData();

		while (true) {
			everlandProcess.clearAll(arrayClass.selectDate, arrayClass.regNum, arrayClass.quantity,
					arrayClass.preferentialNum);
			inputData.inputDate(arrayClass.selectDate);
			do {
				inputData.inputRegNum(arrayClass.regNum);
				inputData.inputQuantity(arrayClass.quantity);
				inputData.inputPreferentialNum(arrayClass.preferentialNum);
				System.out.println("추가 : 0, 종료 : 1");
				endSequence = sc.nextInt();
			} while (endSequence != 1);
			everlandProcess.printPrice(arrayClass.selectDate, arrayClass.regNum, arrayClass.quantity,
					arrayClass.preferentialNum);
		}
	}
}
