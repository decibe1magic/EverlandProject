
public class Everland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EverlandProcess everlandProcess = new EverlandProcess();
		EverlandInputData inputData = new EverlandInputData();

		while (true) {
			everlandProcess.clearAll(inputData.arrData);
			inputData.selectDate();
			do {
				inputData.inputData();
				
			} while (inputData.inputEndSequence() != 1);
			everlandProcess.printPrice(inputData.arrData);
		}
	}
}
