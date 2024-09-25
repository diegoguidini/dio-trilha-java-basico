package SmartTv;

public class SmartTv {

	boolean ligada = false;
	int volume = 25;
	int canal = 1;
	
	public void aumentarVolume() {
		volume ++;
	}
	
	public void diminuirVolume() {
		volume --;
	}
	
	
	public void ligar() {
		ligada=true;
		
	}
	public void desligar() {
		ligada=false;
		
	}

	public void aumentarCanal() {
		canal ++;
		
	}

	public void dimunuirCanal() {
		canal --;
		
	}

	public void definirCanal(int novoCanal) {
		canal = novoCanal;
		
	}

	
	
}