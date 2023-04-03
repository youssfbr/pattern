package com.github.youssfbr.gof.facade;

import com.github.youssfbr.gof.subsistema.cep.CepApi;
import com.github.youssfbr.gof.subsistema.crm.CrmService;

public class Facade {

	public void migrar(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
	
}
