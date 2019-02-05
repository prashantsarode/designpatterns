package com.sampleprograms.design.patterns.creational.singleton;

public enum EnumSingletonImpl {

	INSTANCE;
	
	private String name;
	
	EnumSingletonImpl() {
		name = "Sanvi";
	}
	
	public String getValue() {
		return name;
	}
	
}
