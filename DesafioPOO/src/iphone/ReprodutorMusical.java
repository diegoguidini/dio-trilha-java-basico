package iphone;

public interface ReprodutorMusical {
	
	public void Play();
	public void pause();
	public String selecionarMusica(String musica);
	public void nextTrack();
	public void previousTrack();
	public void increaseVolume();
	public void decreaseVolume();
	

	
	public interface MusicPlayeriPhone extends ReprodutorMusical {	
		
				
		default public void widescreenVideo() {
			System.out.println("DIMINUIR VOLUME");
		}
		
		default public void exibeCapa() {
			System.out.println("MOSTRAR CAPA DO ALBUM");
		}
		default public void avaliarMusica() {
			System.out.println("AVALIAR MUSICA");
		}
		
		default public void repordutorVideos() {
			System.out.println("REPRODUZUR VIDEOS");
		}
	}
}