package me.mchiappinam.pdghx1;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Comando implements CommandExecutor {

	private Main plugin;
	public Comando(Main main) {
		plugin=main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("abc")) {
			return true;
		}
		return false;
	}
}
