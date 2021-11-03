package calculadora;

import java.util.Scanner;

public class calculadoraa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int multiplicador = 0;
		int numero;
		int total;
		
		System.out.println("Qual calculadora deseja ver ? ");
        numero = leitor.nextInt();
        
        
        while ( multiplicador <= 10) {
			  
			 total = numero * multiplicador;
			 
			 System.out.println(numero + " x " + multiplicador + " = "+ total); 
			
        	multiplicador++;
			
		}
	}

}
