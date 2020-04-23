package strategy.mercado;

import java.math.BigDecimal;

public class Caixa {

	private OperacaoCaixa operacaoCaixa;
	
	public Caixa(Troco troco) { 
	}
	
	public Caixa(ReceberPagamento receberPagamento) {		
	}
	
	public Caixa(AberturaCaixa aberturaCaixa) {		
	}
	
	public void executar(BigDecimal valor, BigDecimal valorCaixaAtual) {
		this.operacaoCaixa.executarOperacao(valor, valorCaixaAtual);
	}
}
