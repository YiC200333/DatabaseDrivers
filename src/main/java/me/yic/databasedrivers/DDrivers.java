package me.yic.databasedrivers;


import org.bukkit.plugin.java.JavaPlugin;

public class DDrivers extends JavaPlugin {

	private static DDrivers instance;

	public void onEnable() {
		instance = this;
		getLogger().info("DatabaseDrivers successfully enabled!");
		getLogger().info("===== YiC =====");

	}

	public void onDisable() {
		getLogger().info("DatabaseDrivers successfully disabled!");
	}

	public static DDrivers getInstance() {
		return instance;
	}


}
