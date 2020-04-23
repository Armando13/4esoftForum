package strategy.mercado;

import java.math.BigDecimal;

public interface OperacaoCaixa {

	void executarOperacao(BigDecimal valor, BigDecimal valorCaixaAtual);
	
}
