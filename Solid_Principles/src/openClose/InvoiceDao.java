package openClose;

public class InvoiceDao {
	Invoice invoice;

	public InvoiceDao(Invoice invoice) {
		super();
		this.invoice = invoice;
	}
	public void saveToDB() {
		// saving data to DB.
	}
	
	/*
	 * assume this code is tested and is in 'LIVE', the load to this function is also coming.
	 * So while, I have a new requirement for "the data should be saved into a simple file"
	 * 
	 * So I can create a new method to saveToFile()*/
	
	public void saveToFile() {
		// saving data into a simple file.
	}
	
	/*
	 * So this is a wrong approach of adding a new method when the code is in 'LIVE' mode.
	 * and we are updating the current code.
	 * 
	 * What if we can extend the capability of the class,
	 * we can Extend that from the other class or implement that.
	 */
}
