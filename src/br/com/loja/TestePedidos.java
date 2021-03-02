package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;

public class TestePedidos {

	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		Integer quantidadeItens = Integer.parseInt(args[2]);
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler();
		geraPedidoHandler.executa(gerador);
	}
}
