package delivery;

public abstract class Lanche {
	private double preco;
	final int TEMPO_ENTREGA_MIN_POR_KM = 10;
	
	public Lanche(double preco) {
		this.preco = preco;
	}
		
	public abstract int getTempoEntrega(int distancia);
	public abstract String getDescricao();
	
	public double getPreco() {
		return preco;
	}
}
