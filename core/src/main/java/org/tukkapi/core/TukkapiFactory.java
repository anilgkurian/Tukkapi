package org.tukkapi.core;

import org.tukkapi.core.service.TukkapiService;

public interface TukkapiFactory {

	public TukkapiService createService(String name);
}
