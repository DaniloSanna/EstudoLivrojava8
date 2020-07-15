package Loja;
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero, descricao;
		int quantidade;
		double valornf, valoritem;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe número do Pedido: ");
		numero = sc.nextLine();
		
		System.out.printf("Informe a descrição: ");
		descricao = sc.nextLine();
		
		System.out.printf("Informe a quantidade comprada: ");
		quantidade = sc.nextInt();
		
		System.out.printf("Informe o preço unit.: ");
		valoritem = sc.nextDouble();
		
		
		Invoice pedido = new Invoice(numero, descricao, quantidade, valoritem);
		
		valornf = pedido.getInvoiceAmount();
		
		pedido.ExibePedido(valornf);
		
		sc.close();
		
	}

}
