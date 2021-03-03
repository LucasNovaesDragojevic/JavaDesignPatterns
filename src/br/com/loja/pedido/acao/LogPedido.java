package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class LogPedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido gerado");
	}

}
