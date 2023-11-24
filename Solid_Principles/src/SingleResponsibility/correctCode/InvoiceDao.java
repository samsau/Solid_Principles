package SingleResponsibility.correctCode;

public class InvoiceDao {
	Invoice invoice;
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	public void saveToDB() {
		// saves data into the DB
	}
}
