package com.github.youssfbr.gof;

/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * 
 * @author youssfbr
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {		
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();		
	}	
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {	
		return InstanceHolder.instancia;
	}

}
