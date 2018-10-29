package com.vipul.services;

public interface ServiceInterface {

	default public void doSomething(){
		System.out.println(" This is from default method");
	}
}
