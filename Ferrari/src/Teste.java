import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a velocidade:");
		int velocidade = scan.nextInt();
		System.out.println("Informe a velocidade atual:");
		int velocidadeAtual = scan.nextInt();
		Carro c = new Carro(null,null,velocidade,velocidadeAtual,250,true);
		c.acelerar(velocidade);
		scan.close();
	}
}
