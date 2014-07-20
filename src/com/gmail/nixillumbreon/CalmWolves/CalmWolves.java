/**
 * 
 */
package com.gmail.nixillumbreon.CalmWolves;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class CalmWolves extends JavaPlugin {
	Logger log;
	
	public void onEnable() {
		log = this.getLogger();
		getServer().getPluginManager().registerEvents(new SitListener(), this);
	}
	
	public void onDisable() {
		// Some code
	}
}
