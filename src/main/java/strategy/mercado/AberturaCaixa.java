package strategy.mercado;

import java.math.BigDecimal;

public class AberturaCaixa implements OperacaoCaixa {

	@Override
	public void executarOperacao(BigDecimal valor, BigDecimal valorCaixaAtual) {
		valorCaixaAtual = valorCaixaAtual.add(valorCaixaAtual);		
	}

}
