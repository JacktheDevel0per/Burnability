package com.Jack.Burnability;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Burnability implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("Burnability");
	
	@Override
	public void onInitialize() {
		LOGGER.info("Burnability Loaded");
	}
}


