package OperacoesMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> agendaContatoMap;
	
	
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println("Contatos" + agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		
		agendaContatos.adicionarContato("Diego",995392963);
		agendaContatos.adicionarContato("Davi",995392964);
		agendaContatos.adicionarContato("Patricia",995392965);
		agendaContatos.adicionarContato("Repete",995392965);
		
		agendaContatos.exibirContatos();
		agendaContatos.removerContato("Repete");
		agendaContatos.exibirContatos();
		System.out.println(agendaContatos.pesquisarPorNome("Diego"));
		

 }
}
