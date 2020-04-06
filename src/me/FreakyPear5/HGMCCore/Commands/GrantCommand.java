package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GrantCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (player.hasPermission("hgmc.grant")) {
				if (args.length == 0) {
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aUsage: /grant <player> <rank>"));
				}
				else {
					String username = args[0];
					String rank = args[1];
					player.performCommand("lp user " + username + " group set " + rank);
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aRank command sent to LuckPerms! Please read above for other info."));
				}
			}
			else {
		}		sender.sendMessage("You do not haver perwda");
			
		}
		return true;
	}

}
