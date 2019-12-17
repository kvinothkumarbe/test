package com.cts.flowable.delegate;

import java.util.Map;
import java.util.Map.Entry;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;


public class ServiceDelegate implements JavaDelegate{
	
	ProcessEngine processEngine;

	public void execute(DelegateExecution execution) {
		System.out.println("ServiceDelegate function is calling .............!!!");
		//cibil score - logic 
		execution.setVariable("result", "success");
		Map<String, Object> map =execution.getVariables();
		for(Entry<String, Object> entry : map.entrySet()){
			System.out.println("Key : "+ entry.getKey()+" vs Value : "+entry.getValue());
		}
		System.out.println("ServiceDelegate function is executed .............!!!");
	}

}
