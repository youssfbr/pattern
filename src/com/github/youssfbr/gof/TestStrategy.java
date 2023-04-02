package com.github.youssfbr.gof;

import com.github.youssfbr.gof.strategy.Comportamento;
import com.github.youssfbr.gof.strategy.ComportamentoAgressivo;
import com.github.youssfbr.gof.strategy.ComportamentoDefensivo;
import com.github.youssfbr.gof.strategy.ComportamentoNormal;
import com.github.youssfbr.gof.strategy.Robo;

public class TestStrategy {

	public static void main(String[] args) {
		
		
		
		// Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);		
		robo.mover();
		robo.mover();
		
	}
}
