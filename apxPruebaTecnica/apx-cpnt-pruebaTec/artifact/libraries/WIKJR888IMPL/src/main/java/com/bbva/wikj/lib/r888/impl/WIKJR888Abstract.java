package com.bbva.wikj.lib.r888.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r888.WIKJR888;
import com.bbva.wikj.lib.r889.WIKJR889;

public abstract class WIKJR888Abstract extends AbstractLibrary implements WIKJR888 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR889 wikjR889;

	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}


	public void setWikjR889(WIKJR889 wikjR889) {
		this.wikjR889 = wikjR889;
	}

}