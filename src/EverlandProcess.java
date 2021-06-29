import java.util.ArrayList;

public class EverlandProcess {
	
	final int ADULTATICKET = 60000;
	final int ADULTBTICKET = 56000;
	final int ADULTCTICKET = 50000;
	final int CHILDATICKET = 48000;
	final int CHILDBTICKET = 44000;
	final int CHILDCTICKET = 40000;
	public String ticketName;
	public int usrAge;
	public String preferentialName = "�⺻";
	
	public void clearAll(ArrayList<String> selectDate, ArrayList<String> regNum, ArrayList<Integer> quantity,
			ArrayList<Integer> preferentialNum) {
		selectDate.clear();
		regNum.clear();
		quantity.clear();
		preferentialNum.clear();
	}

	public void printPrice(ArrayList<String> selectDate, ArrayList<String> regNum, ArrayList<Integer> quantity,
			ArrayList<Integer> preferentialNum) {
		ArrayList<String> printTicketName = new ArrayList<String>();
		ArrayList<String> printAgeResult = new ArrayList<String>();
		ArrayList<Integer> printQuantity = new ArrayList<Integer>();
		ArrayList<Integer> printTotalPrice = new ArrayList<Integer>();
		ArrayList<String> printPreferentialName = new ArrayList<String>();
		ArrayList<Integer> totalPrice = new ArrayList<Integer>();
		int sumTotalPrice = 0;

		for (int index = 0; index < regNum.size(); index++) {
			String ageResult = calculateAge(selectDate.get(0), regNum.get(index));
			int finalPrice = calculatePrice(selectDate.get(0), preferentialNum.get(index));

			totalPrice.add(finalPrice * quantity.get(index));
			sumTotalPrice += totalPrice.get(index);

			printTicketName.add(ticketName);
			printAgeResult.add(ageResult);
			printQuantity.add(quantity.get(index));
			printTotalPrice.add(totalPrice.get(index));
			printPreferentialName.add(preferentialName);
		}

		System.out.printf("������ %d�� �Դϴ�. \n�����մϴ�.\n", sumTotalPrice);
		System.out.println("====================��������====================");
		for (int print = 0; print < regNum.size(); print++) {
			System.out.printf("%s\t%s X %d\t%d��\t*%s �������\n", printTicketName.get(print), printAgeResult.get(print),
					printQuantity.get(print), printTotalPrice.get(print), printPreferentialName.get(print));
		}
		System.out.println("==============================================");
	}

	public int calculatePrice(String selectDate, int preferentialNum) {
		int price = 0;
		// 6��
		if (selectDate.substring(0, 6).equals("202106")) {
			switch (Integer.parseInt(selectDate.substring(6))) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 19, 20, 26, 27:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDBTICKET;
				} else {
					price = ADULTBTICKET;
				}
				ticketName = "BƼ��";
				break;
			case 14, 15, 16, 17, 18, 21, 22, 23, 24, 25, 28, 29, 30:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDCTICKET;
				} else {
					price = ADULTCTICKET;
				}
				ticketName = "CƼ��";
				break;
			}
		}

		// 7��
		if (selectDate.substring(0, 6).equals("202107")) {
			switch (Integer.parseInt(selectDate.substring(6))) {
			case 3, 4, 10, 11, 17, 18, 24, 25, 29, 30, 31:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDBTICKET;
				} else {
					price = ADULTBTICKET;
				}
				ticketName = "BƼ��";
				break;
			case 1, 2, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 26, 27, 28:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDCTICKET;
				} else {
					price = ADULTCTICKET;
				}
				ticketName = "CƼ��";
				break;
			}
		}

		// 8��
		if (selectDate.substring(0, 6).equals("202108")) {
			switch (Integer.parseInt(selectDate.substring(6))) {
			case 1, 2, 3, 7, 8, 14, 15, 21, 22, 28, 29:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDBTICKET;
				} else {
					price = ADULTBTICKET;
				}
				ticketName = "BƼ��";
				break;
			case 4, 5, 6, 9, 10, 11, 12, 13, 16, 17, 18, 19, 20, 23, 24, 25, 26, 27, 30, 31:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDCTICKET;
				} else {
					price = ADULTCTICKET;
				}
				ticketName = "CƼ��";
				break;
			}
		}

		// 9��
		if (selectDate.substring(0, 6).equals("202109")) {
			switch (Integer.parseInt(selectDate.substring(6))) {
			case 4, 5, 11, 12, 18, 19, 20, 21, 22, 25, 26:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDATICKET;
				} else {
					price = ADULTATICKET;
				}
				ticketName = "AƼ��";
				break;
			case 3, 6, 7, 8, 9, 10, 13, 14, 15, 16, 17, 23, 24, 27, 28, 29, 30:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDBTICKET;
				} else {
					price = ADULTBTICKET;
				}
				ticketName = "BƼ��";
				break;
			case 1, 2:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDCTICKET;
				} else {
					price = ADULTCTICKET;
				}
				ticketName = "CƼ��";
				break;
			}
		}

		// 10��
		if (selectDate.substring(0, 6).equals("202110")) {
			switch (Integer.parseInt(selectDate.substring(6))) {
			case 2, 3, 9, 10, 16, 17, 23, 24, 30, 31:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDATICKET;
				} else {
					price = ADULTATICKET;
				}
				ticketName = "AƼ��";
				break;
			case 1, 4, 5, 6, 7, 8, 11, 12, 13, 14, 15, 18, 19, 20, 21, 22, 25, 26, 27, 28, 29:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDBTICKET;
				} else {
					price = ADULTBTICKET;
				}
				ticketName = "BƼ��";
				break;
			}
		}

		// 11��
		if (selectDate.substring(0, 6).equals("202111")) {
			switch (Integer.parseInt(selectDate.substring(6))) {
			case 6, 7:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDATICKET;
				} else {
					price = ADULTATICKET;
				}
				ticketName = "AƼ��";
				break;
			case 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 20, 21, 27, 28:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDBTICKET;
				} else {
					price = ADULTBTICKET;
				}
				ticketName = "BƼ��";
				break;
			case 15, 16, 17, 18, 19, 22, 23, 24, 25, 26, 29, 30:
				if (usrAge >= 65 || usrAge < 13) {
					price = CHILDCTICKET;
				} else {
					price = ADULTCTICKET;
				}
				ticketName = "CƼ��";
				break;
			}
		}

		switch (preferentialNum) {
		case 1:
			if (usrAge >= 65 || usrAge < 13) {
				preferentialName = "���� ���";
			}
			break;
		case 2: // ����� ��� 40%
			price = (int) (price * 0.6);
			preferentialName = "����� ���";
			break;
		case 3: // ������ ��� 50%
			price = (int) (price * 0.5);
			preferentialName = "���� ������ ���";
			break;
		case 4: // ���ڳ� ��� 20%
			price = (int) (price * 0.8);
			preferentialName = "���ڳ� ���";
			break;
		case 5: // �ӻ�� ��� 15%
			price = (int) (price * 0.85);
			preferentialName = "�ӻ�� ���";
			break;
		}
		return price;
	}

	public String calculateAge(String selectDate, String regNum) {
		String ageResult;
		int age = 0;
		int comparisonYear = Integer.parseInt(selectDate.substring(0, 4)); // 2021
		int comparisonYear2 = Integer.parseInt(selectDate.substring(2, 4)); // 21
		int comparisonDate = Integer.parseInt(selectDate.substring(4)); // ���� ��,��
		int birthYear = Integer.parseInt(regNum.substring(0, 2)); // �⵵
		int birthDate = Integer.parseInt(regNum.substring(2, 6)); // ��, ��

		// �� ���� ���
		if (birthDate >= comparisonDate && birthYear > comparisonYear2) { // ���� �� ���� ��� -2
			age = comparisonYear - (1900 + birthYear) - 1;
		} else if (birthDate >= comparisonDate && birthYear <= comparisonYear2) {
			age = comparisonYear - (2000 + birthYear) - 1;
		} else if (birthDate < comparisonDate && birthYear > comparisonYear2) { // ���� ���� ��� -1
			age = comparisonYear - (1900 + birthYear);
		} else if (birthDate < comparisonDate && birthYear <= comparisonYear2) {
			age = comparisonYear - (2000 + birthYear);
		}
		// ���
		if (age >= 65) {
			ageResult = "���";
		} else if (age >= 13) {
			ageResult = "����";
		} else {
			ageResult = "����";
		}
		usrAge = age;
		return ageResult;
	}
	
}

