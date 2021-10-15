package model.entities;

public class Invoice {

	public Double basicPayment;
	public Double tax;

	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double bascPayment) {
		this.basicPayment = bascPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	
	public Double getTotalPayment() {
		return  getBasicPayment() + getTax();
	}
	
	
	
}
