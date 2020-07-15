package Loja;

public class Invoice {

	private String numero, item;
	private int quantidadecomprada;
	private double preco;
	
	
	
	public Invoice(String numero, String item, int quantidadecomprada, double preco){

		this.numero = numero;
		this.item = item;
		this.quantidadecomprada = quantidadecomprada;
		this.preco = preco;
	}
	public double getInvoiceAmount () {
		
		if (preco <= 0.0 || quantidadecomprada <= 0.0 ) {
			return 0;
		}else {
			return (preco*quantidadecomprada*1.00);
		}
	
	}

	public void ExibePedido(double valorfinal) {
		
		System.out.println("O pedido " + numero + ", possui o(s) iten(s) " + item + " na quantidade de " + quantidadecomprada + ", totalizando o valor de R$ " + valorfinal);
	
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantidadecomprada() {
		return quantidadecomprada;
	}

	public void setQuantidadecomprada(int quantidadecomprada) {
		this.quantidadecomprada = quantidadecomprada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
