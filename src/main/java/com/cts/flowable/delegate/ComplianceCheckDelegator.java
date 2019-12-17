package com.cts.flowable.delegate;

import java.util.Map;
import java.util.Map.Entry;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;


public class ComplianceCheckDelegator implements JavaDelegate{
	
	ProcessEngine processEngine;

	public void execute(DelegateExecution execution) {
		System.out.println("ComplianceCheckDelegator function is calling .............!!!");
		//Compliance Check Logic
		String clientName=execution.getVariable("clientname")!=null?execution.getVariable("clientname").toString():null;
		if(clientName!=null && "cognizant".equalsIgnoreCase(clientName)){
			execution.setVariable("isComplianceCheck", "approved");
		}else{
			execution.setVariable("isComplianceCheck", "rejected");
		}
		
		Map<String, Object> map =execution.getVariables();
		for(Entry<String, Object> entry : map.entrySet()){
			System.out.println("Key : "+ entry.getKey()+" vs Value : "+entry.getValue());
		}
		System.out.println("ComplianceCheckDelegator function is executed .............!!!");
	}

}
