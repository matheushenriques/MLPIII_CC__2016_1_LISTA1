package lojaInformatica;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o Numero:");
		String numero = scan.nextLine();
		System.out.println("Informe a descri��o:");
		String descricao = scan.nextLine();
		System.out.println("Informe o pre�o:");
		double preco = scan.nextDouble();
		System.out.println("Informe a quantidade:");
		int qtdComprada = scan.nextInt();
		Fatura f = new Fatura(numero, descricao, qtdComprada, preco);
		scan.close();
		f.getValorFatura();
	}
}
