package br.com.loja.orcamento;

import java.math.BigDecimal;

public class OrcavelProxy implements Orcavel {

	private BigDecimal valor;
	private Orcavel orcavel;
	
	public OrcavelProxy(Orcavel orcavel) {
		this.orcavel = orcavel;
	}
	
	@Override
	public BigDecimal getValor() {
		if (this.valor == null)
			this.valor = orcavel.getValor();
		
		return this.valor;
	}
}
