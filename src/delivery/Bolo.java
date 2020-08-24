package delivery;

public class Bolo extends Lanche {
	private String massa;
	private String recheio;
	private String cobertura;
	private final int TEMPO_PREPARO_MINUTOS = 10;
	
	public Bolo(String massa, String recheio, String cobertura) {
		super(10);
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}
	
	@Override
	public int getTempoEntrega(int distancia) {
		return distancia * TEMPO_ENTREGA_MIN_POR_KM + TEMPO_PREPARO_MINUTOS;
	}

	@Override
	public String getDescricao() {
		String texto = "\n>> Seu pedido:";
		texto += "\n\tBolo com massa de " + massa + ", recheio de " + recheio + " e cobertura de " + cobertura;
		
		return texto;
	}
}
