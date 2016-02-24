
public class Carro {

	// Attributes
	private String cor;
	private String modelo;
	private int velocidade;
	private int velocidadeAtual;
	private int velocidadeMaxima = 250;
	private boolean ligar;

	// Builders
	public Carro(String cor, String modelo, int velocidade, int velocidadeAtual, int velocidadeMaxima, boolean ligar) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.ligar = ligar;
	}

	// Get and Setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	// Methods
	public boolean ligar(boolean ligar) {
		if (ligar == true) {
			System.out.println("Carro Ligado");
		} else {
			System.out.println("Carro Desligado");
		}
		return ligar;
	}

	public int acelerar(int velocidade) {
		velocidade = velocidadeAtual + velocidade;
		if(ligar == true){
		if (velocidade < 250)  {
			System.out.println("Velocidade atual do carro: " + velocidade);
		} else {
			System.out.println("Velocidade do carro foi excedida");
		}
		
		}
		if(ligar == false){
			System.out.println("Carro Desligado");
		}
		return velocidade;
	}
}
