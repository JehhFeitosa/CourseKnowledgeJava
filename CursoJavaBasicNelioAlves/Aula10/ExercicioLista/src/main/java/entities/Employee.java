package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.name = nome;
		this.salary = salario;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public double getSalario() {
		return salary;
	}

	public void setSalario(double salario) {
		this.salary = salario;
	}

	public void increaseSalary(double percentage) {
		salary = salary + salary * percentage / 100;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("% .2f, ", salary);
	}

}
