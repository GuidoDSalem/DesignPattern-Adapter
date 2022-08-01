
public class SamsungTv implements Tv {
	int canal;
	boolean itsOn;
	int volumen;
	
	public SamsungTv() {
		this.canal = 10;
		this.itsOn = false;
		this.volumen = 22;
	}

	@Override
	public void turnOn() {
		System.out.println("Tv prendida");
		this.itsOn = true;
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv Apagada");
		this.itsOn = false;
		
	}
	
	public void power() {
		System.out.println("Power btn");
		this.itsOn = !this.itsOn;
	}

	@Override
	public void subirCanal() {
		System.out.println("Canal: "+this.canal);
		this.canal++;
		
	}

	@Override
	public void bajarCanal() {
		System.out.println("Canal: "+this.canal);
		this.canal--;
		
	}

	@Override
	public void subirVolumen() {
		if(this.itsOn) {
			this.volumen++;
			System.out.println("VolumenTv: "+this.volumen);
		}
		else {
			System.out.println("Para subir volumen prenda la tv");
		}
		
		
	}

	@Override
	public void bajarVolumen() {
		if(this.itsOn) {
			System.out.println("VolumenTV: "+this.volumen);
			this.volumen--;
		}
		else {
			System.out.println("Para bajar volumen prenda la tv");
		}
		
	}

	@Override
	public void setChannel(int i) {
		// TODO Auto-generated method stub
		
	}

}
