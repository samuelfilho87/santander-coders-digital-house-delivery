package delivery;

public class Pizza extends Massa {
	private String sabor;
	
	public Pizza(String molho, String sabor) {
		super(20, molho);
		this.sabor = sabor;
	}

	@Override
	public String getDescricao() {
		String texto = "\n>> Seu pedido:";
		texto += "\n\tPizza sabor " + sabor;
		
		return texto;
	}
}
