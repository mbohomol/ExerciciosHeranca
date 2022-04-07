package br.com.generation.heranca;

public class Cachorro extends Animal {
	
	private String manso;

	public String getManso() {
		return manso;
	}

	public void setManso(String manso) {
		this.manso = manso;
	}

	void correr() {
		System.out.println("O animal corre rápido...");
	}



	
}
