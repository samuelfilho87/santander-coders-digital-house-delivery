package delivery;

import java.util.Scanner;

public class Menu {
	private Scanner scan = new Scanner(System.in);
	private int opcao = -1;
	private String pergunta = "";
	private String texto = "";
	private String opcoes[];
	
	public Menu(String[] opcoes, String pergunta) {
		this.opcoes = opcoes;
		this.pergunta = pergunta;
	}
	
	private void showMenu() {
		texto = "\n>> " + pergunta + "\n";
		
		for(int i = 1; i < opcoes.length; i++) {
			texto += "\n[" + i + "] " + opcoes[i];
		}
		
		texto += "\n[0] " + opcoes[0];		
	}
	
	public String getOpcao() {		
		do {
			showMenu();
			
            System.out.println(texto);
            
            opcao = scan.nextInt();
            
            if(opcao < 0 || opcao > opcoes.length - 1) {
            	System.out.println("\n\nOpção inválida, tente novamente.\n");
            }
		} while(opcao < 0 || opcao > opcoes.length - 1);
		
		return opcoes[opcao];
	}
	
	public void setOpcoes(String[] opcoes) {
		this.opcoes = opcoes;
	}
	
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
}
