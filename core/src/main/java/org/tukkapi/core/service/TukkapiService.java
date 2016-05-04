package org.tukkapi.core.service;

import org.tukkapi.core.TukkapiException;

public interface TukkapiService  {

	public void submit(Runnable task, int order) throws TukkapiException;
	
	public void execute() throws TukkapiException;
}
