package delivery;

public abstract class Massa extends Lanche {
	private String molho;
	private final int TEMPO_PREPARO_MINUTOS = 30;
	
	public Massa(double preco, String molho) {
		super(preco);
		this.molho = molho;
	}
	
	public String getMolho() {
		return molho;
	}
	
	@Override
	public double getPreco() {
		return super.getPreco();
	}
	
	@Override
	public int getTempoEntrega(int distancia) {
		return distancia * TEMPO_ENTREGA_MIN_POR_KM + TEMPO_PREPARO_MINUTOS;
	}
}
