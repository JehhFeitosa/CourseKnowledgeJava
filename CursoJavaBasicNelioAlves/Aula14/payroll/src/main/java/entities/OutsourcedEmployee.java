package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmployee(String name, Double additionalCharge, double valuePerHour, double additionalCharge2) {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
}
