package entities;

public class Aluguel {
	
	private String nomeEstudante;
	private String email;
	//private int quarto;
	
	

//	public Aluguel(String nomeEstudante, String email, int quarto) {
//		this.nomeEstudante = nomeEstudante;
//		this.email = email;
//		this.quarto = quarto;
//	}
//	
	
	

	public Aluguel(String nomeEstudante, String email) {
		super();
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

//	public int getQuarto() {
//		return quarto;
//	}
//
//	public void setQuartos(int quarto) {
//		this.quarto = quarto;
//	}
	
	
	

}
