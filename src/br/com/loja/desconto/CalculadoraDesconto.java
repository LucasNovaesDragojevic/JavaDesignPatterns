package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDesconto {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
							new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
							new SemDesconto()));
			
		return desconto.efetuarCalculo(orcamento);
	}
}
