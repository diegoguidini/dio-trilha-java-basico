package iphone;

public interface NavegadorInternet {

	public void verificaConexaoInternet();
	public String exibirPagina(String url);
	public void newTab();
	public void refreshTab();
	public void addBookmark();
	public void removeBookmark();

	public interface Safari extends NavegadorInternet  {
		
			
		default public void zoomIn() {
			System.out.println("AUMENTAR IMAGEM");
		}
		
		default public void zoomOut() {
			System.out.println("DIMINUIR IMAGEM");
			
		}
		
		default public void widescreenWeb() {
			System.out.println("PLANO PAISAGEM");
			
		}
		
	}
}
