package com.github.youssfbr.gof;

/**
 * Singleton "apressado"
 * 
 * @author youssfbr
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {	
		return instancia;
	}

}
