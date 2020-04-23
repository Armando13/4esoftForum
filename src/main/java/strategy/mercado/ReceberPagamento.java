package strategy.mercado;

import java.math.BigDecimal;

public class ReceberPagamento implements OperacaoCaixa {

	@Override
	public void executarOperacao(BigDecimal valor, BigDecimal valorCaixaAtual) {
		valorCaixaAtual = valorCaixaAtual.add(valor);		
	} 

}
