package iphone;

public interface AparelhoTelefonico {

	public String call(String numero);
	public void voiceMail();
	public void answear();
	public void hungUp();
	
	
	
	public interface PhoneiPhone extends AparelhoTelefonico {
		
				
		}
		default public void waitCall() {
			System.out.println("CHAMADA EM ESPERA");
						
		}
		default public void callConf() {
			System.out.println("INICIAR CONFERENCIA CHAMADA");
	}
		
}
