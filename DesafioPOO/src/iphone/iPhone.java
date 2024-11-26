package iphone;

import iphone.AparelhoTelefonico.PhoneiPhone;
import iphone.NavegadorInternet.Safari;
import iphone.ReprodutorMusical.MusicPlayeriPhone;

public class iPhone implements AparelhoTelefonico, ReprodutorMusical, 
NavegadorInternet, Safari, PhoneiPhone, MusicPlayeriPhone  {
	
	public static void main(String[] args) {
		
				
		iPhone iPhone = new iPhone();
		iPhone.call(null);
		iPhone.callConf();
		iPhone.waitCall();
		iPhone.answear();
		iPhone.hungUp();
		iPhone.voiceMail();
		
		iPhone.exibirPagina(null);
		iPhone.newTab();
		iPhone.refreshTab();
		iPhone.addBookmark();
		iPhone.removeBookmark();
		iPhone.zoomIn();
		iPhone.zoomOut();
		
		iPhone.selecionarMusica(null);
		iPhone.Play();
		iPhone.pause();
		iPhone.nextTrack();
		iPhone.previousTrack();
		iPhone.increaseVolume();
		iPhone.decreaseVolume();
		iPhone.avaliarMusica();
		iPhone.widescreenVideo();
		iPhone.exibeCapa();
		iPhone.repordutorVideos();
		
	}

	@Override
	public String exibirPagina(String url) {
		verificaConexaoInternet();
		System.out.println("ABRIR PAGINA");
		return null;
	}

	@Override
	public void newTab() {
		verificaConexaoInternet();
		System.out.println("ABRIR NOVA PAGINA");
		
	}

	@Override
	public void refreshTab() {
		verificaConexaoInternet();
		System.out.println("ATUALIZAR PAGINA");
		
	}

	@Override
	public void addBookmark() {
		verificaConexaoInternet();
		System.out.println("ADD FAVORITOS");
		
	}

	@Override
	public void removeBookmark() {
		verificaConexaoInternet();
		System.out.println("REMOVER FAVORITOS");
		
	}

	@Override
	public void Play() {
		System.out.println("TOCAR MUSICA");
		
	}

	@Override
	public void pause() {
		System.out.println("PAUSAR MUSICA");
		
	}

	@Override
	public String selecionarMusica(String musica) {
		System.out.println("SELECIONAR MUSICA");
		return null;
	}

	@Override
	public void nextTrack() {
		System.out.println("PROXIMA MUSICA");
		
	}

	@Override
	public void previousTrack() {
		System.out.println("VOLTAR MUSICA");
		
	}

	@Override
	public void increaseVolume() {
		System.out.println("AUMENTAR VOLUME");
		
	}

	@Override
	public void decreaseVolume() {
		System.out.println("DIMINUIR VOLUME");
		
	}

	@Override
	public String call(String numero) {
		System.out.println("INFORMAR NUMERO");
		return null;
	}

	@Override
	public void voiceMail() {
		System.out.println("CORREIO DE VOZ");
		
	}

	@Override
	public void answear() {
		System.out.println("ATENDER LIGAÇÃO");
		
	}

	@Override
	public void hungUp() {
		System.out.println("RECUSAR LIGAÇÃO");
		
	}

	@Override
	public void verificaConexaoInternet() {
		System.out.println("VERIFICANDO CONEXÃO INTERNET");
		
	}


}
		
	