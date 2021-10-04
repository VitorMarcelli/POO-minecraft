package oficina;



public class Enxada {

	public static void main(String[] args) throws InterruptedException {
		Ferramentas enxadas = new Ferramentas();
		enxadas.textura = "Madeira";
		System.out.println("Iniciando Mineração...");
		enxadas.arar();
		System.out.println("");
		enxadas.conquista = true;
		if (enxadas.conquista == true) {
			enxadas.minerar();
			System.out.println("Conquista desbloqueada!!!");
		} else {
			System.out.println("Você causou dano!");
		}
		System.out.println("");
		
		
		

	}
}
	