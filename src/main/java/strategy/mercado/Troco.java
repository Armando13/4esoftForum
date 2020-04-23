package strategy.mercado;

import java.math.BigDecimal;

public class Troco implements OperacaoCaixa {

	@Override
	public void executarOperacao(BigDecimal valor, BigDecimal valorCaixaAtual) {
		valorCaixaAtual = valorCaixaAtual.subtract(valor);		
	}

	
}
