package desafio;
import java.util.Arrays;
import java.util.Scanner;
public class Desafio {

		public class VerificacaoServico {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Entrada do serviço a ser verificado
		        System.out.println("Digite o nome do serviço");
		        String servico = scanner.nextLine().trim();
		        // Entrada do nome do cliente e os serviços contratados
		        System.out.println("Digite o nome do cliente");
		        String entradaCliente = scanner.nextLine().trim();
		        
		                		        
		        // Separando o nome do cliente e os serviços contratados
		        String[] partes = entradaCliente.split(",");
		        String nomeCliente = partes[0];
		        boolean contratado = false;
		        
		       		        
		        // TODO: Verifique se o serviço está na lista de serviços contratados
		        contratado = Arrays.asList(partes).contains(servico);
		        System.out.println(contratado ? "Sim" : "Não");
		        
		       		 		        
		       		        
		        scanner.close();
		    }

					
		}


	}


		

	
	
