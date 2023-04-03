package com.github.youssfbr.gof.subsistema.cep;

public class CepApi {
	
private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {	
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Fortaleza";
	}
	
	public String recuperarEstado(String estado) {
		return "CE";
	}


}
