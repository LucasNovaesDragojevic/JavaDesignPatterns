package br.com.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.acao.EnviarEmailPedido;
import br.com.loja.pedido.acao.LogPedido;
import br.com.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {

	public static void main(String[] args) {
		String cliente = "Rodrigo";
		GeraPedido gerador = new GeraPedido(cliente, Arrays.asList(new ItemOrcamento(new BigDecimal("1000"))));
		GeraPedidoHandler geraPedidoHandler = 
				new GeraPedidoHandler(
						Arrays.asList(
								new SalvarPedidoNoBancoDeDados(), 
								new EnviarEmailPedido(),
								new LogPedido()
								)
				);
		geraPedidoHandler.executa(gerador);
	}
}
