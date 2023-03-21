package entidade;

import java.util.Scanner;

public class MovimBancario {
	
	public double valor;
	public double transfere;
	public double sacar;
	public double saldo_atual;
	
	
	
	public void transferir(double transfere) {
	
		if(transfere <= valor) {
			this.valor -= transfere;
			System.out.println("Valor tranferido com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	public void sacar(double sacar) {
		
		if(sacar <= valor) {
			this.valor-=sacar;
			System.out.println("Valor saca com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
	}
	
	public double saldo_atual() {
		
		return this.valor;
	}
	public void depos(double depositar) {
		
		this.valor+=depositar;
		
	}
	
}
