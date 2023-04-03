package com.github.youssfbr.gof;

import com.github.youssfbr.gof.facade.Facade;

public class TestFacade {

	public static void main(String[] args) {		
		
		// Facade
		Facade facade = new Facade();
		facade.migrar("Alisson", "123456789");
		
	}
}
