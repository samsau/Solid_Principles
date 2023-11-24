package SingleResponsibility.incorrectCode;

public class Invoice {
	private Marker marker;
	private int quantity;
	public Invoice(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}
	public int calculateTotal() {
		int price = marker.price * quantity;
		return price;
	}
	public void printInvoice() {
		//print invoice into CSV
	}
	public void save() {
		//save the data to SQL-DB
	}
}

/*
	// First reason to change is:
	If I need to make a change in calculation and add GST also in the function. So calculate Total() method will get changed. 
	// Other reason to change is:
	If I want to print invoice in Excel, so for that I have to change the code.
	// Other reason for change is:
	If I want to save the data into Mongo-DB, then there will be change in the code.
	
	So, this class has "3 reason to change".
	
	*** To have 1 reason for change we have to break the code into different classes.***
*/