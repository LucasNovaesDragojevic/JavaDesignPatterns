package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDesconto;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiroOrcamento = new Orcamento();
		primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		Orcamento segundoOrcamento = new Orcamento();
		primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		
		System.out.println(calculadora.calcular(primeiroOrcamento));
		System.out.println(calculadora.calcular(segundoOrcamento));
	}

}
