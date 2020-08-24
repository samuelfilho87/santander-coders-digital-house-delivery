package delivery;

public class Lasanha extends Massa {
	private String recheio;
	
	public Lasanha(String molho, String recheio) {
		super(25, molho);
		this.recheio = recheio;
	}

	@Override
	public String getDescricao() {
		String texto = "\n>> Seu pedido:";
		texto += "\n\tLasanha de " + recheio + " com molho de " + super.getMolho();
		
		return texto;
	}
}
