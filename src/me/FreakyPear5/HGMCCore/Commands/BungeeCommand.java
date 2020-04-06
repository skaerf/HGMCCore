package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BungeeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGamesMC >> &aWe are running a snapshot of BungeeCord 1.8x-1.13x!"));
		}
		else {
			sender.sendMessage("n00B");
		}
		return true;
	}

}
