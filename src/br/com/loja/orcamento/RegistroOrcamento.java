package br.com.loja.orcamento;

import java.util.Map;

import br.com.loja.http.HttpAdapter;
import br.com.loja.orcamento.exception.DomainException;

public class RegistroOrcamento {
	
	private HttpAdapter http;

	public RegistroOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if (!orcamento.isFinalizado())
			throw new DomainException("Orçamento não finalizado");
		
		String url = "https://www.google.com.br";
		Map<String, Object> parametros = Map.of("valor", orcamento.getValor(), "quantidadeItens", orcamento.getQuantidadeItens());
		http.post(url, parametros);
	}
}
