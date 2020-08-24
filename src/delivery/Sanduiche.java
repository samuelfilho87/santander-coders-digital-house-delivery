package delivery;

public class Sanduiche extends Lanche {	
	private String ingredientes[] = new String[10];
	
	private final int TEMPO_PREPARO_MINUTOS = 15;
	
	public Sanduiche(String[] ingredientes) {
		super(2);
		this.ingredientes = ingredientes;
	}

	@Override
	public double getPreco() {
		int count = 0;
		
		while(ingredientes[count] != null) {
			count++;
		}
		
		return count * 0.98 + super.getPreco();
	}
	
	@Override
	public int getTempoEntrega(int distancia) {
		return distancia * TEMPO_ENTREGA_MIN_POR_KM + TEMPO_PREPARO_MINUTOS;
	}

	@Override
	public String getDescricao() {
		String texto = "\n>> Ingredientes do seu sanduíche:";
		int count = 0;
		
		while(ingredientes[count] != null) {
			texto += "\n\t" + ingredientes[count];
			count++;
		}
		
		return texto;
	}
}
