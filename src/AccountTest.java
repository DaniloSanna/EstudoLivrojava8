// Figura 3.2 AccountTest.java
//Cria e manupula o objeto Account
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Account myAccount = new Account();
		Account myAccount = new Account("Danilo", 100.0);
		Account myAccount1 = new Account("Barbara", 3.0);
		
		
		//System.out.println("Entre com o nome da conta 1: ");
		//String theName = input.nextLine();
		//System.out.println("Entre com saldo 1: ");
		//Double theBalance = input.nextDouble();
		//Account myAccount = new Account(theName, theBalance);
		//System.out.println();
		
		
		//input.nextLine();
		//System.out.println("Entre com o nome da outra conta: ");
		//theName = input.nextLine();
		//System.out.println("Entre com saldo da outra conta: ");
		//theBalance = input.nextDouble();
		//Account myAccount1 = new Account(theName, theBalance);
		//System.out.println();
		
		System.out.println(myAccount.NomeSaldo());
		System.out.println(myAccount1.NomeSaldo());

		System.out.printf("Quanto quer sacar da conta1: ");
		double theBalance = input.nextDouble();
		String saque = myAccount.withdraw(theBalance);
		System.out.println("");
		System.out.println(saque);
		System.out.println("");
		System.out.println(myAccount.NomeSaldo());
		System.out.println(myAccount1.NomeSaldo());
		
		input.close();
	}

}
