package entidade;

public class Investimento {
	
	
	public void Investir(MovimBancario neymar , double val) {
        if (val <= neymar.valor) {
            neymar.valor -= val;
            System.out.println("Valor tranferido com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}    
            
       
	}

	
}