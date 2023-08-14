package me.yic.databasedrivers;


import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.lifecycle.StartedEngineEvent;
import org.spongepowered.api.event.lifecycle.StoppingEngineEvent;
import org.spongepowered.plugin.builtin.jvm.Plugin;

@Plugin("databasedrivers")
public class DDriversSponge8{

	private static DDriversSponge8 instance;
	@Inject
	private final Logger inforation;

	@Inject
	public DDriversSponge8(final Logger inforation){
		this.inforation = inforation;
		instance = this;
	}

	@SuppressWarnings(value = {"unused"})
	@Listener
	public void onEnable(final StartedEngineEvent<Server> event) {
		inforation.info("DatabaseDrivers successfully enabled!");
		inforation.info("===== YiC =====");

	}

	@SuppressWarnings("unused")
	@Listener
	public void onDisable(StoppingEngineEvent<Server> event) {
		inforation.info("DatabaseDrivers successfully disabled!");
	}

	public static DDriversSponge8 getInstance() {
		return instance;
	}


}
