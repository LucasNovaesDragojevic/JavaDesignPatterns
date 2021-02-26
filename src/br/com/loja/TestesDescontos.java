package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDesconto;
import br.com.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		
		System.out.println(calculadora.calcular(primeiroOrcamento));
		System.out.println(calculadora.calcular(segundoOrcamento));
	}

}
