package me.yic.databasedrivers;


import org.bukkit.plugin.java.JavaPlugin;

public class DDriversBukkit extends JavaPlugin {

	private static DDriversBukkit instance;

	public void onEnable() {
		instance = this;
		getLogger().info("DatabaseDrivers successfully enabled!");
		getLogger().info("===== YiC =====");

	}

	public void onDisable() {
		getLogger().info("DatabaseDrivers successfully disabled!");
	}

	public static DDriversBukkit getInstance() {
		return instance;
	}


}
