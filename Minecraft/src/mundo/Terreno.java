package mundo;

import pedra.Bloco;

public class Terreno {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Bloco grama = new Bloco();
		grama.textura = "Verde";
		grama.resistencia = 3;
		System.out.println("---------------------------------------------------------------");
		System.out.println("A textura é: " + grama.textura);
		System.out.println("A resistência é: " + grama.resistencia);
		System.out.println("Em progresso...");
		grama.minerar();
		System.out.println("");
		System.out.println("Trabalhando nisso...");
		grama.craftar();
		System.out.println("");
		System.out.println("Fazendo...");
		grama.construir();
		System.out.println("");
		System.out.println("Ação concluída com sucesso!!");

		Bloco madeira = new Bloco();
		madeira.textura = "Marrom";
		madeira.resistencia = 5;
		System.out.println("---------------------------------------------------------------");
		System.out.println("A textura é: " + madeira.textura);
		System.out.println("A resistência é: " + madeira.resistencia);
		System.out.println("Em progresso...");
		madeira.minerar();
		System.out.println("");
		System.out.println("Trabalhando nisso...");
		madeira.craftar();
		System.out.println("");
		System.out.println("Fazendo...");
		madeira.construir();
		System.out.println("");
		System.out.println("Ação Concluída com Sucesso!!");
	}
}
