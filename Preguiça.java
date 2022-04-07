package br.com.generation.heranca;

public class Preguiça extends Animal{

		private String preguicoso;
		
		void subir_em_arvores() {
			System.out.println("O animal gosta de subir em árvores...");
			
		}

		public String getPreguicoso() {
			return preguicoso;
		}

		public void setPreguicoso(String preguicoso) {
			this.preguicoso = preguicoso;
		}

}
