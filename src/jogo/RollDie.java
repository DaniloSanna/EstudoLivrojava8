package jogo;
import java.security.SecureRandom;
import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// o objeto randomNumbers produzir� n�meros aleat�rios seguros
		
		//SecureRandom randomNumbers = new SecureRandom();
		Random randomNumbers = new Random();
		
		int frequency1 = 0; // contagem de 1s lan�ados
		int frequency2 = 0; // contagem de 2s lan�ados
		int frequency3 = 0; // contagem de 3s lan�ados
		int frequency4 = 0; // contagem de 4s lan�ados
		int frequency5 = 0; // contagem de 5s lan�ados
		int frequency6 = 0; // contagem de 6s lan�ados
		
		for (int roll = 1; roll <= 6000000; roll++) 
		{
			int face = 1 + randomNumbers.nextInt(6); // n�mero entre 1 e 6
			// usa o valor 1�6 para as faces a fim de determinar qual contador incrementar
			switch (face)
			{    
				// incrementa o contador de 1s
				case 1: 
					++frequency1; 
				break;
				// incrementa o contador de 2s
				case 2: 
					++frequency2; 
				break;
				// incrementa o contador de 3s
				case 3: 
					++frequency3; 
				break;
				// incrementa o contador de 4s
				case 4: 
					++frequency4; 
				break;
				// incrementa o contador de 5s
				case 5: 
					++frequency5;
				break;
				// incrementa o contador de 6s
				case 6: 
					++frequency6; 
				break; 
			}
		}
		
		 System.out.println("Face\tFrequency"); // cabe�alhos de sa�da 
		 System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
		 
		 System.out.printf("Maior Frequencia ");
		 if ((frequency1 > frequency2) && (frequency1 > frequency3) && (frequency1 > frequency4) && (frequency1 > frequency5) && (frequency1 > frequency6)){System.out.printf("1");}
		 if ((frequency2 > frequency1) && (frequency2 > frequency3) && (frequency2 > frequency4) && (frequency2 > frequency5) && (frequency2 > frequency6)){System.out.printf("2");}
		 if ((frequency3 > frequency1) && (frequency2 > frequency3) && (frequency2 > frequency4) && (frequency2 > frequency5) && (frequency2 > frequency6)){System.out.printf("3");}
		 if ((frequency4 > frequency1) && (frequency4 > frequency2) && (frequency1 > frequency3) && (frequency4 > frequency5) && (frequency4 > frequency6)){System.out.printf("4");}
		 if ((frequency5 > frequency1) && (frequency5 > frequency2) && (frequency5 > frequency3) && (frequency5 > frequency4) && (frequency5 > frequency6)){System.out.printf("5");}
		 if ((frequency6 > frequency1) && (frequency6 > frequency3) && (frequency6 > frequency4) && (frequency6 > frequency5) && (frequency6 > frequency2)){System.out.printf("6");}
		 
	
	
	
	
	
	
	}

}
