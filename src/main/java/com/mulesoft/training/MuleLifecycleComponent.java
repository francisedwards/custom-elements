package com.mulesoft.training;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Startable;

public class MuleLifecycleComponent implements Callable, Startable {

	@Override
	public void start() throws MuleException {
		// TODO Auto-generated method stub
		System.out.println("###### start method invoked ######");
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("###### onCall method invoked ######");
		return eventContext.getMessage();
	}

}
