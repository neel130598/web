package m.p.model;

public class Details {

	private String Vendor_Name;
	private String invoice_Number;
	private String Invoice_Date;
	private String Purchase_Item;
	private String Total_Amount;
	private String Certification_Date;
	
	
	public String getVendor_Name() {
		return Vendor_Name;
	}
	public void setVendor_Name(String vendor_Name) {
		Vendor_Name = vendor_Name;
	}
	public String getInvoice_Number() {
		return invoice_Number;
	}
	public void setInvoice_Number(String invoice_Number) {
		this.invoice_Number = invoice_Number;
	}
	public String getInvoice_Date() {
		return Invoice_Date;
	}
	public void setInvoice_Date(String invoice_Date) {
		Invoice_Date = invoice_Date;
	}
	public String getPurchase_Item() {
		return Purchase_Item;
	}
	public void setPurchase_Item(String purchase_Item) {
		Purchase_Item = purchase_Item;
	}
	public String getTotal_Amount() {
		return Total_Amount;
	}
	public void setTotal_Amount(String total_Amount) {
		Total_Amount = total_Amount;
	}
	public String getCertification_Date() {
		return Certification_Date;
	}
	public void setCertification_Date(String certification_Date) {
		Certification_Date = certification_Date;
	}
}
