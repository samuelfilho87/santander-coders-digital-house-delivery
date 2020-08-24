package delivery;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		boolean sair = false;
		Lanche lanche = null;
		
		String[] opcoesMenuPrincipal = {
			"Sair",
			"Sanduíches",
			"Massas",
			"Bolos"
		};
		
		String[] opcoesSanduiche = {
			"Finalizar",
			"Alface", 
			"Bacon", 
			"Calabresa", 
			"Cheddar", 
			"Coração de galinha",
			"Ervilha",
			"Frango",
			"Hamburguer",
			"Hamburguer de soja",
			"Milho",
			"Mussarela",	
			"Ovo", 
			"Palmito",
			"Peixe",
			"Pepino",
			"Rúcula", 
			"Tomate",
		};
		
		String[] opcoesMassas = {
			"Sair",
			"Lasanha",
			"Macarrão",
			"Pizza"
		};
		
		String[] opcoesMolhosMassas = {
			"Sair",
			"Bolonhesa",
			"Branco",
			"Carbonara",
			"Funghi",
			"Tomate"
		};
		
		String[] opcoesLasanha = {
			"Sair",
			"4 queijos",
			"Carne",
			"Frango",
			"Legumes",
			"Presunto"
		};
		
		String[] opcoesMacarrao = {
			"Sair",
			"Espaguete",
			"Linguine",
			"Talharim",
			"Fettucine"
		};
				
		String[] opcoesPizza = {
			"Sair",
			"4 queijos",
			"Calabresa",
			"Portuguesa",
			"Mexicana",
			"Pepperoni"
		};
		
		String[] opcoesMassaBolo = {
			"Sair",
			"Amanteigada",
			"Chiffon",
			"Genoise",
			"Pão de ló",
		};
		
		String[] opcoesRecheioBolo = {
			"Sair",
			"Brigadeiro",
			"Creme patisserie",
			"Morango",
			"Sonho de valsa"
		};
		
		String[] opcoesCoberturaBolo = {
			"Sair",
			"Chantili",
			"Crocante de chocolate",
			"Fondant",
			"Merengue e marshmallow",
			"Pasta americana",
		};
		
		String opcao;
		Menu menu = new Menu(opcoesMenuPrincipal, "O que deseja?");
		
		while(!sair) {
			opcao = menu.getOpcao();
            
            switch(opcao) {
            	case "Sair":
            		sair = true;
            		break;
            		
            	case "Sanduíches":
            		menu.setOpcoes(opcoesSanduiche);
            		menu.setPergunta("Escolha os ingredientes do seu sanduíche");
            		
            		String opcaoSanduiche;
            		String[] ingredientes = new String[10];
            		int count = 0;
            		
            		String ingredientesEscolhidos = "";
            		
            		do {
            			if(count > 0) {
            				System.out.println("\n>> Ingredientes escolhidos: \n" + ingredientesEscolhidos);
            			}
            			
            			opcaoSanduiche = menu.getOpcao();
            			
            			if(opcaoSanduiche != "Finalizar" && count < 10) {
            				ingredientes[count] = opcaoSanduiche;
            				ingredientesEscolhidos += "\n\t" + opcaoSanduiche;
            				count++;
            			}
            		} while(opcaoSanduiche != "Finalizar" && count < 10);
            		
            		lanche = new Sanduiche(ingredientes);
            		
            		break;
            	case "Massas":
            		String molho = "";
            		String sabor = "";

            		menu.setOpcoes(opcoesMassas);
            		menu.setPergunta("Qual massa deseja?");
            		
            		opcao = menu.getOpcao();
            		
            		switch(opcao) {
            			case "Lasanha":
            				menu.setOpcoes(opcoesMolhosMassas);
                    		menu.setPergunta("Escolha o molho da sua lasanha:");
                    		
                    		do {       			
                    			molho = menu.getOpcao();
                    			
                    			if(molho == "Sair") {
                    				sair = true;
                    				return;
                    			}
                    		} while(molho == "");
                    		
                    		menu.setOpcoes(opcoesLasanha);
                    		menu.setPergunta("Escolha o sabor da sua lasanha:");
                    		
                    		do {       			
                    			sabor = menu.getOpcao();
                    			
                    			if(sabor == "Sair") {
                    				sair = true;
                    				return;
                    			}
                    		} while(sabor == "");
                    		
                    		lanche = new Lasanha(molho, sabor);
                    		
            				break;
            			case "Macarrão":
            				menu.setOpcoes(opcoesMacarrao);
            				menu.setPergunta("Escolha o tipo de macarrão:");
            				
            				do {       			
            					sabor = menu.getOpcao();
            					
            					if(sabor == "Sair") {
                    				sair = true;
                    				return;
                    			}
            				} while(sabor == "");
            				
            				menu.setOpcoes(opcoesMolhosMassas);
                    		menu.setPergunta("Escolha o molho da sua macarronada:");
                    		
                    		do {       			
                    			molho = menu.getOpcao();
                    			
                    			if(molho == "Sair") {
                    				sair = true;
                    				return;
                    			}
                    		} while(molho == "");                    		
                    		
                    		lanche = new Macarrao(molho, sabor);

                    		break;
            			case "Pizza":
            				menu.setOpcoes(opcoesPizza);
            				menu.setPergunta("Escolha o sabor da sua pizza:");
                    		
                    		do {       			
                    			sabor = menu.getOpcao();
                    			
                    			if(sabor == "Sair") {
                    				sair = true;
                    				return;
                    			}
                    		} while(sabor == "");
                    		
                    		lanche = new Pizza("Tomate", sabor);
                    		
            				break;
            			case "Sair":
                    		sair = true;
                    		break;
            		}
            		
            		break;
            	case "Bolos":
            		String massa = "";
            		
            		menu.setOpcoes(opcoesMassaBolo);
    				menu.setPergunta("Escolha a massa do bolo:");
    				
    				do {       			
    					massa = menu.getOpcao();
    					
    					if(massa == "Sair") {
            				sair = true;
            				return;
            			}
    				} while(massa == "");
    				
    				String recheio = "";
            		
            		menu.setOpcoes(opcoesRecheioBolo);
    				menu.setPergunta("Escolha o recheio do bolo:");
    				
    				do {       			
    					recheio = menu.getOpcao();
    					
    					if(recheio == "Sair") {
            				sair = true;
            				return;
            			}
    				} while(recheio == "");
    				
    				String cobertura = "";
            		
            		menu.setOpcoes(opcoesCoberturaBolo);
    				menu.setPergunta("Escolha o recheio do bolo:");
    				
    				do {       			
    					cobertura = menu.getOpcao();
    					
    					if(cobertura == "Sair") {
            				sair = true;
            				return;
            			}
    				} while(cobertura == "");
    				
    				lanche = new Bolo(massa, recheio, cobertura);
    				
            		break;
            }
            
            if(lanche != null) {
            	int distancia;
            	
            	do {
            		System.out.println("\n>> Qual sua distância do restaurante em km?");
            		distancia = scan.nextInt();
            		
            		if(distancia < 1) {
            			System.out.println("\n>> Distância deve ser maior que 0");
            		}
            	} while(distancia < 1);
            	
            	System.out.println(lanche.getDescricao());
            	
            	double preco = lanche.getPreco();
            	System.out.printf("\n>> Valor a ser pago: R$ %.2f", preco);
            	
            	int tempo = lanche.getTempoEntrega(distancia);
            	System.out.println("\n>> Tempo estimado de entrega do seu pedido é de " + tempo + " minutos");
            	
            	sair = true;            	
            }
		}
	}
}
