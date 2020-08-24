package delivery;

public class Macarrao extends Massa {
	private String tipo;
	
	public Macarrao(String molho, String tipo) {
		super(16, molho);
		this.tipo = tipo;
	}

	@Override
	public String getDescricao() {
		String texto = "\n>> Seu pedido:";
		texto += "\n\tMacarrão tipo " + tipo + " com molho de " + super.getMolho();
		
		return texto;
	}
}
