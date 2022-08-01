
public class RadioMesa implements Radio {
	boolean estaPrendido;
	int frecuencia;
	int vol;
	
	public RadioMesa() {
		this.estaPrendido = false;
		this.frecuencia = 100;
		this.vol = 24;
	}
	@Override
	public void prender() {
		System.out.println("Radio prendida");
		this.estaPrendido = true;
		
	}

	@Override
	public void apagar() {
		System.out.println("Radio Apagada");
		this.estaPrendido = false;
		
	}

	@Override
	public void subirVol() {
		System.out.println("Volumen Radio: " + this.vol);
		this.vol ++;
		
	}

	@Override
	public void apagarVol() {
		while(this.vol > 0) {
			System.out.println("Volumen Radio: " + this.vol);
			this.vol --;
		}
		
	}

	@Override
	public void aumnetarFrec() {
		System.out.println("Frecuencia: " + this.frecuencia);
		this.frecuencia ++;
		
	}

	@Override
	public void disminFrec() {
		System.out.println("Frecuencia: " + this.frecuencia);
		this.frecuencia --;
		
	}
	@Override
	public void bajarVol() {
		System.out.println("Volumen Radio: " + this.vol);
		this.frecuencia--;
		
	}
	public int getFrecuencia() {
		return this.frecuencia;
	}
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

}
