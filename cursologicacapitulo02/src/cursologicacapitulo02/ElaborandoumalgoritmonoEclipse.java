package cursologicacapitulo02;

import java.util.Scanner;

public class ElaborandoumalgoritmonoEclipse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do produto ");
		Double valorProduto = scanner.nextDouble();
		System.out.print("Digite a quantidade passada pelo cliente ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		double valorTroco = valorPassadoPeloCliente - valorProduto;
		System.out.println("Valor do troco " +  valorTroco);
		scanner.close();
	}

}
