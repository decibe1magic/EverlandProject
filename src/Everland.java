import java.util.ArrayList;
import java.util.Scanner;

public class Everland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int endSequence = 0;

		Scanner sc = new Scanner(System.in);
		EverlandArrayClass arrayClass = new EverlandArrayClass();
		EverlandProcess everlandProcess = new EverlandProcess();
		EverlandInputData inputData = new EverlandInputData();

		while (true) {
			count = 0;
			everlandProcess.clearAll(arrayClass.selectDate, arrayClass.regNum, arrayClass.quantity,
					arrayClass.preferentialNum);
			do {
				inputData.inputDate(arrayClass.selectDate, count);
				inputData.inputRegNum(arrayClass.regNum, count);
				inputData.inputQuantity(arrayClass.quantity);
				inputData.inputPreferentialNum(arrayClass.preferentialNum);
				count++;
				System.out.println("추가 : 0, 종료 : 1");
				endSequence = sc.nextInt();
			} while (endSequence != 1);
			everlandProcess.printPrice(arrayClass.selectDate, arrayClass.regNum, arrayClass.quantity,
					arrayClass.preferentialNum, count);
		}
	}
}
