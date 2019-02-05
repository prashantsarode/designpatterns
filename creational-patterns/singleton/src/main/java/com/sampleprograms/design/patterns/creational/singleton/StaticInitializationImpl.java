package com.sampleprograms.design.patterns.creational.singleton;

public final class StaticInitializationImpl {

	private static final StaticInitializationImpl INSTANCE = new StaticInitializationImpl();

	private StaticInitializationImpl() {
	}

	public static StaticInitializationImpl getInstance() {
		return INSTANCE;
	}

}
