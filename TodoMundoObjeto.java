package br.com.generation.heranca;

public class TodoMundoObjeto {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Pregui�a p1 = new Pregui�a();
		
		c1.setNome("Scooby Doo");
		c1.setIdade(2);
		c1.setManso("Sim");
		
		
		c2.setNome("Thor");
		c2.setIdade(1);
		c2.setManso("Sim");
		
		p1.setNome("Soneca");
		p1.setIdade(2);
		p1.setPreguicoso("Sim");
		
		System.out.println("O nome do cachorro �: " + c1.getNome());
		System.out.println("Quantos anos o cachorro tem? " + c1.getIdade());
		System.out.println("O cachorro � manso? "+ c1.getManso());
		c1.emitir_som();
		c1.correr();
		
		System.out.println();
		
		System.out.println("O nome do cavalo �: " + c2.getNome());
		System.out.println("Quantos anos o cavalo tem? " + c2.getIdade());
		System.out.println("O cavalo � manso? " + c2.getManso());
		c2.emitir_som();
		c2.correr();
		
		System.out.println();
		
		System.out.println("O nome do pregui�a �: " + p1.getNome());
		System.out.println("Quantos anos o pregui�a tem? " + p1.getIdade());
		System.out.println("O pregui�a � pregui�oso?" + p1.getPreguicoso());
		p1.emitir_som();
		p1.subir_em_arvores();
		
		System.out.println();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
