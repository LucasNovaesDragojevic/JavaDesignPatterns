package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido salvdo no banco.");
	}
}
