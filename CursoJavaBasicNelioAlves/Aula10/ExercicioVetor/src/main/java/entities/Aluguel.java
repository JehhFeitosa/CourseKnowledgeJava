package entities;

public class Aluguel {
	
	private String nomeEstudante;
	private String email;

	public Aluguel(String nomeEstudante, String email) {
		this.nomeEstudante = nomeEstudante;
		this.email = email;
	}


	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return nomeEstudante + "," + email;
	}

	
	
	
	

}
