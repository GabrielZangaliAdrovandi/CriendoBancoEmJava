package entidade;

import java.util.Random;

public class Contacliente {
	
	public void geraConta() {
		
		 Random aleatorio = new Random();
		    
		    int valor = aleatorio.nextInt(500) +1;
		    
		    System.out.println("O número da sua conta é: " + valor);
		    System.out.println("A sua agencia é: 13");
		    
		    
		  }

}

