package com.vipul.services;

public interface DAOInterface {

	default public void doSomething(){
		System.out.println(" This is from default method");
	}
}
