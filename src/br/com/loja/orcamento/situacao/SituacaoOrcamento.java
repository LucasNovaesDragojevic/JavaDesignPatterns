package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.exception.DomainException;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser aprovado!");
	}

	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser finalizado!");
	}

}
