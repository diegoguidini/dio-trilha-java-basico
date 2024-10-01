package estrutura_repeticao;

public class EstruturaRepeticaoForArrays {

	public static void main(String[] args) {
		
		//em arrays o indice inicia em ZERO
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		for (int x=0; x<alunos.length; x++) {
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

			
			//Forma abreviada
			/**for(String aluno : alunos) {
			  System.out.println(aluno);*/
			
			
		}
	}
}