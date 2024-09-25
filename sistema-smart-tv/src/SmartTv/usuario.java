package SmartTv;
//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class usuario {
	public static void main(String[] args) throws Exception{
		
		SmartTv smartTv = new SmartTv();
		System.out.println("TV Ligada? " + smartTv.ligada);		
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
	
		smartTv.ligar();
		System.out.println("Novo status: " + smartTv.ligada );
			
		
		smartTv.desligar();
		System.out.println("Novo status: " + smartTv.ligada);
		
		smartTv.ligar();
		System.out.println("Novo status: " + smartTv.ligada );
		
		smartTv.aumentarVolume();
		System.out.println("volume: " + smartTv.volume);
		
		smartTv.diminuirVolume();
		System.out.println("volume: " + smartTv.volume);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		System.out.println("volume: " + smartTv.volume);
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("volume: " + smartTv.volume);
		
		smartTv.aumentarCanal();
		System.out.println("Canal: " + smartTv.canal );
		
		smartTv.dimunuirCanal();
		System.out.println("Canal: " + smartTv.canal );
		
		smartTv.definirCanal(3);
		System.out.println("Canal: " + smartTv.canal);
		
	}
}