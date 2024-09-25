package SmartTv;
//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class usuario {
	public static void main(String[] args) throws Exception{

		SmartTv smartTv = new SmartTv();
		System.out.println("TV Ligada? " + smartTv.ligada);		
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
	
		
		smartTv.ligar();
		System.out.printf("Novo status: " + smartTv.ligada);
	}
}