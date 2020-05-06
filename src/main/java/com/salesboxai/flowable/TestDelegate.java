package com.salesboxai.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class TestDelegate implements JavaDelegate {
	
	public void execute(DelegateExecution execution) {
		System.out.println("Test Delegate Working - now you can do anything!");
	}
}
