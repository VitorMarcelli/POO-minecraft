package oficina;

import pedra.Bloco;

public class Ferramentas extends Bloco {
	
	public Ferramentas() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void arar() {
		System.out.println("Arando a Terra");
		
	}
	public boolean conquista;
	
	public void minerar() {
		int dano = (int) (Math.random() * 3);
		if (dano == 0) {
			System.out.println("Dano Causado é: " + dano + 3);
			
	} else {
			System.out.println("Terra arada com sucesso");
	}
		
	}	
}
