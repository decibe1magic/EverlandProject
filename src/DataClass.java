public class DataClass {
	String ticket = null;
	String ageResult = null;
	int quantity = 0;
	int totalPrice = 0;
	String preferentialName = null;

	DataClass(String ticket, String ageResult, int quantity, int totalPrice, String preferentialName) {
		this.ticket = ticket;
		this.ageResult = ageResult;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.preferentialName = preferentialName;
	}
}