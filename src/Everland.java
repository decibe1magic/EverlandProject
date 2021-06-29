
public class Everland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
			} while (inputData.inputEndSequence() != 1);
			everlandProcess.printPrice(arrayClass.selectDate, arrayClass.regNum, arrayClass.quantity,
					arrayClass.preferentialNum);
		}
	}
}
