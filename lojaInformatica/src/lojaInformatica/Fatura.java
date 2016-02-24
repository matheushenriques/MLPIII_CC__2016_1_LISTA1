package lojaInformatica;

public class Fatura {
	private String numero;
	private String descricao;
	private int qtdComprada;
	private double preco;
	private double valorFatura;
	
	//Builders

	public Fatura(String numero, String descricao, int qtdComprada, double preco){
		this.numero = numero;
		this.descricao = descricao;
		this.qtdComprada = qtdComprada;
		this.preco = preco;
	}

	
	//Get and Setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdComprada() {
		return qtdComprada;
	}
	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
		if(preco < 0){
			System.out.println("0");
		}
		else{
			System.out.println("Valor valido");
		}
	}
	
	
	// Methods
	public double getValorFatura(){
		valorFatura = preco*qtdComprada;
		if(valorFatura <= 0){
			System.out.println("O valor da fatura é: 0");
			return valorFatura = 0;
		}
		else{
	    System.out.println("O valor da fatura é: R$" + valorFatura);
	    return valorFatura;
		}
	}
	
	
}
