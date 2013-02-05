package com.github.triarry.PvPRestore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PvPRestoreCommandExecutor implements CommandExecutor {

	private PvPRestore plugin;
	  
	public PvPRestoreCommandExecutor(PvPRestore plugin){ 
		this.plugin = plugin; 
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("pvprestore")) {
			if (sender.hasPermission("pvprestore.info")) {
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "#####");
				sender.sendMessage(ChatColor.GREEN + "Currently running PvP Restore version 1.2.2");
				sender.sendMessage(ChatColor.GREEN + "Plugin made by triarry");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "#####");
				plugin.getLogger().info("A player requested information and was granted access.");
				return true;
			} else {
				sender.sendMessage(ChatColor.RED + "Sorry, you do not have permission to view this resource.");
                plugin.getLogger().info("A player requested information and was denied.");
				return true;
			}
    	} else {
			sender.sendMessage(ChatColor.RED + "Sorry, you do not have permission to view this resource.");
            plugin.getLogger().info("A player requested information and was denied.");
			return true;
		}
	}
}