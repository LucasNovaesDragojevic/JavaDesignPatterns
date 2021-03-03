package br.com.loja.pedido;

import java.util.List;

import br.com.loja.orcamento.ItemOrcamento;

public class GeraPedido {

	private String cliente;
	private List<ItemOrcamento> itensOrcamento;
	
	public GeraPedido(String cliente, List<ItemOrcamento> itensOrcamento) {
		this.cliente = cliente;
		this.itensOrcamento = itensOrcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public List<ItemOrcamento> getItensOrcamento() {
		return this.itensOrcamento;
	}
}
