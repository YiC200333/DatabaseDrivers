package me.yic.databasedrivers;


import org.bukkit.plugin.java.JavaPlugin;

public class DDriversAPI extends JavaPlugin {

    private static final String mysqldriver = "me.yic.libs.mysql.jdbc.Driver";
    private static final String sqlitedriver = "org.sqlite.JDBC";


	public static String getversion() {
		return DDriversBukkit.getInstance().getDescription().getVersion();
	}

    public static String getclass(String type) {
            if (type.equalsIgnoreCase("mysql")) {
                return mysqldriver;
            } else if (type.equalsIgnoreCase("sqlite")) {
				return sqlitedriver;
            }
        return null;
    }

}
