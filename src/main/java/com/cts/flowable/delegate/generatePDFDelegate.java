package com.cts.flowable.delegate;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;


public class generatePDFDelegate implements JavaDelegate{
	
	ProcessEngine processEngine;

	public void execute(DelegateExecution execution) {
		System.out.println("Generate PDF");
		//genearte PDF 
		// store in local file 
		// Store the file path & Name in execution variables
	}

}
