package me.yic.databasedrivers;

import net.md_5.bungee.api.plugin.Plugin;

public class DDriversBungee extends Plugin {
	private static DDriversBungee instance;

	@Override
	public void onEnable() {

		instance = this;

		getLogger().info("DatabaseDrivers successfully enabled!");
		getLogger().info("===== YiC =====");

	}

	@Override
	public void onDisable() {
		getLogger().info("DatabaseDrivers successfully disabled!");
	}

	public static DDriversBungee getInstance() {
		return instance;
	}
}
