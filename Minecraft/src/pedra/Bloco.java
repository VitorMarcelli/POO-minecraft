/**
 * Minecraft
 * 
 * Aluno: Heder Santos
 */


package pedra;

public class Bloco {
		public int resistencia;
		public String textura;

			// Construtor
			public Bloco() throws InterruptedException { 
				System.out.println("Construtor criado...");
				Thread.sleep(1500); 
				System.out.println("Construtor a Caminho...");
				Thread.sleep(1500);
				System.out.println("");
			}
			
		
			//metodos
			
			public void construir() {
				System.out.println("Bloco em construção...");
			}
			
			public void minerar() {
				System.out.println("Recursos minerados do Bloco!");
			}
			
			public void craftar() {
				System.out.println("Transformação realizada.");
		
			}
}
