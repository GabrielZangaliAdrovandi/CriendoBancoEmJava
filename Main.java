package aplication;

import java.util.Scanner;

import entidade.Cliente;
import entidade.Contacliente;
import entidade.MovimBancario;
import entidade.ContaCNPJ;
import entidade.Investimento;


public class Main {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cliente x = new Cliente();//Objeto

        Contacliente cont = new Contacliente();

        MovimBancario y = new MovimBancario();
        
        Investimento Inv = new Investimento();
        

        
        ContaCNPJ c = new ContaCNPJ();
        
        System.out.println("Deseja criar uma conta no BigBank? Digite 1 para SIM e 2 para NÃO");
        
        int BancoSim=sc.nextInt();
        
        if(BancoSim == 2 ) {
     	   System.out.println("Que pena  :(  Espero que na próxima podemos te ajudar.");
        }
        
        if(BancoSim == 1 ) {
           System.out.println("Vamos juntos criar sua conta");
         
            System.out.println("Preencha os dados abaixo");
            
           System.out.println("Nome: ");
            x.nome = sc.nextLine();
            sc.nextLine();
            
           System.out.println("Endereco: ");
           x.Endereco=sc.nextLine();
           sc.nextLine();
        	
           System.out.println("Renda: ");
           x.Renda=sc.nextDouble();
            
           System.out.println("CPF: ");
           x.CPF=sc.nextDouble();
            
           System.out.println("Profissao: ");
           x.Profissao=sc.nextLine();
           sc.nextLine();
            
            System.out.println("Para terminar de criar sua conta precisa depositar um valor X");
            y.valor = sc.nextDouble();
            
            System.out.println("Conta criada com sucesso!");
            
            cont.geraConta();
            
            int i = 1;
            int voltar = 0;
            
            	while (i==1) {
                	
                	
            		
                    System.out.println("Escolha uma das opções abaixo:");
                    System.out.println("1 - Ver saldo");
                    System.out.println("2 - Transferência");
                    System.out.println("3 - Sacar dinheiro");
                    System.out.println("4 - Depositar");
                    System.out.println("5 - Investimento");          
                    System.out.println("6 - Abrir um CNPJ");//fazer sumir isso
                    
                   int opcao = sc.nextInt();
                   
                   if(opcao == 1) {												//Ver saldo
                	   System.out.println("Seu saldo e : " +y.saldo_atual()+ " reais");
                	   System.out.println("Deseja voltar pro menu principal ou encerrar a navegacao?");
                	   System.out.println("Digite 1 para SIM ou 2 NAO");
                	   voltar =sc.nextInt();
                	   if (voltar == 1) {
                		   
                	   }else {
                		   System.out.println("Ate a proxima");
                		   i = 2;
                		   
                	   }
                	   
                   } else if (opcao == 2) {										//Transferir dinheiro
                	  System.out.println("Transferir dinheiro. Seu saldo atual e:" +y.saldo_atual()+ " reais"); 
                	  System.out.println("Qual o valor que voc� deseja transferir?");
                	  y.transfere = sc.nextDouble();
                	  y.transferir(y.transfere);//objeto tranferrir
                	  
                	
                	System.out.println("Voce transferiu " +y.transfere+ " reais");
                	
                	 System.out.println("Deseja voltar pro menu principal ou encerrar a navegacao?");
                	 System.out.println("Digite 1 para SIM ou 2 Nao");
                	 voltar =sc.nextInt();
                	 if (voltar == 1) {
              		   
                	 	}else {
                	 	System.out.println("Ate a proxima");
                	 		i = 2;
                	 		
                	 	}
                	
                   } else if (opcao == 3) {										// Sacar dinheiro
                	   System.out.println("Voc� selecionou sacar dinheiro");
                	   System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
                	   System.out.println("Qual o valor que voco deseja sacar?");
                	   y.sacar = sc.nextDouble();
                	   y.sacar(y.sacar);//objeto sacar 


                	   System.out.println("Voce sacou " +y.sacar+ " reais");
                	   
                	   System.out.println("Deseja voltar pro menu principal ou encerrar a navegacao?");
                	   System.out.println("Digite 1 para SIM ou 2 Nao");
                	   voltar =sc.nextInt();
                	   if (voltar == 1) {
                		   
                	   }else {
                		   System.out.println("Ate a proxima");
                		   i = 2;
                		   
                	   }
                	  
                   }else if(opcao == 4){
                	   System.out.println("Voc� selecionou depositar dinheiro");
                	   System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
                	   System.out.println("Qual o valor que voco deseja depositar?");
                	   double deposito = sc.nextDouble();
                	   y.depos(deposito);//objeto sacar
                	   System.out.println("Voce depositou " +deposito+ " reais");
                	   
                	   System.out.println("Deseja voltar pro menu principal ou encerrar a navegacao?");
                	   System.out.println("Digite 1 para SIM ou 2 Nao");
                	   voltar =sc.nextInt();
                	   if (voltar == 1) {
                		   
                	   }else {
                		   System.out.println("Ate a proxima");
                		   i = 2;
                		   
                	   }
                	   
                   }else if(opcao == 5) {  
                	   System.out.println("Voce selecionou Investir dinheiro");
                	   System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
                	   
                	   System.out.println("Selecione onde voce quer investir?");
                	   System.out.println("1 - Poupanca");
                	   System.out.println("2 - CBD");
                	   System.out.println("3 - LCI");
                	   System.out.println("4 - LCA");
                	   System.out.println("5 - LC");
                	   	
                	   int invest=sc.nextInt();
                	   	switch(invest) {
                	   	case 1:
                	   		System.out.println("O rendimento da poupanca e de 7,13% ao ano ");
                	   		System.out.println("Deseja investir na poupanca? Digite 1 para sim ou 2 para nao");
                	   		int sUn=sc.nextInt();
                	   		if(sUn == 1) {
                	   			System.out.println("Voce digitou 1");
                	   			System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
                	   			System.out.println("Qual o valor que voco deseja investir?");
                	   			double val1=sc.nextDouble();
                	   			Inv.Investir(y, val1);
                	   			System.out.println("Voce investio "+val1);
                	   			break;
                	   			
                	   			
                	   		}else {
                	   			break;
                	   		}
                	   	case 2:
                	   		System.out.println("O rendimento da CDI e de 13,65% ao ano ");
                	   		System.out.println("Deseja investir no CDI? Digite 1 para sim ou 2 para nao");
                	   		int sUn1=sc.nextInt();
                	   		if(sUn1 == 1) {
                	   			System.out.println("Voce digitou 1");
                	   			System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
                	   			System.out.println("Qual o valor que voco deseja investir?");
                	   			double val2=sc.nextDouble();
                	   			y.transferir(val2);
                	   			System.out.println("Voce investio "+val2); 
                	   			break;
                	   	
                	   		}else {
                	   			break;
                	   		}
                	   			
                	   	case 3:
                	   		System.out.println("O rendimento da LCI e de 1,17% oa mes ");
                	   		System.out.println("Deseja investir no LCI? Digite 1 para sim ou 2 para nao");
                	   		int sUn2=sc.nextInt();
                	   		if(sUn2 == 1) {
                	   			System.out.println("Voce digitou 1");
                	   			System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
                	   			System.out.println("Qual o valor que voco deseja investir?");
                	   			double val3=sc.nextDouble();
                	   			y.transferir(val3);
                	   			System.out.println("Voce investio "+val3);
                	   			break;
                	   		}else {
                	   			break;
                	   		} 
                	   	case 4:System.out.println("O rendimento da LCA e de 90% ");
            	   		System.out.println("Deseja investir no LCA? Digite 1 para sim ou 2 para nao");
            	   		int sUn3=sc.nextInt();
            	   		if(sUn3 == 1) {
            	   			System.out.println("Voce digitou 1");
            	   			System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
            	   			System.out.println("Qual o valor que voco deseja investir?");
            	   			double val4=sc.nextDouble();
            	   			y.transferir(val4);
            	   			System.out.println("Voce investio "+val4);
            	   			
            	   		}else {
            	   			break;
            	   	} 
                	   	case 5:
                	   		System.out.println("O rendimento da LC e de 1,17% oa mes ");
                	   		System.out.println("Deseja investir no LC? Digite 1 para sim ou 2 para nao");
                	   		int sUn4=sc.nextInt();
                	   		if(sUn4 == 1) {
                	   			System.out.println("Voce digitou 1");
                	   			System.out.println("Seu saldo atual e: " +y.saldo_atual()+ " reais");
                	   			System.out.println("Qual o valor que voco deseja investir?");
                	   			double val5=sc.nextDouble();
                	   			y.transferir(val5);
                	   			System.out.println("Voce investio "+val5);
                	   		}else {
                	   			break;
                	   		}
                }
                	   
              
                   }else if(opcao==6) {//se torna NCPJ
                	   
                	   System.out.println("Vamos juntos criar sua conta PJ");
                       
                	   System.out.println("Preencha os dados abaixo");
                       
                	   System.out.println("CNPJ: ");
                    		c.CNPJ = sc.nextLine();
                    		sc.nextLine();
                    	
                    		System.out.println("Endereco: ");
                    		c.Endereco=sc.nextLine();
                    		sc.nextLine();
                    		System.out.println("Razao Social: ");
                    		c.RazaoSocial=sc.nextLine();
                    		sc.nextLine();
                    		System.out.println("Sua conta CNPJ criada com suesso senhor(a) "+x.nome);
                    		System.out.println("Deseja voltar pro menu principal ou encerrar a navegacao?");
                    		System.out.println("Digite 1 para SIM ou 2 Nao");
             	   				voltar =sc.nextInt();
             	   			if (voltar == 1) {
             	   				
             	   			}else {
             	   				System.out.println("Ate a proxima");
             	   				i = 2;
             	   				
             	   			}
                   }
            }
            
           
        }
        
}
                
        
    


}