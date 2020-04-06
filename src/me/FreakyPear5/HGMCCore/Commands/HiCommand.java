package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HiCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aUsage: /hi <your name>w"));
			}
			else {
				String name = args[0];
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aGreetings, " + name + "! I hope you are having a fine day."));	
			}
		}
		else {
		}
		return true;
	}

}
