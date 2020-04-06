package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BugCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aIf you have found a bug,\n"
					+ "&aplease report it to a member of staff, type it on the\n"
					+ "&a'bug-reports' discord channel or make a forum post about it at\n"
					+ "&a&nmc.hypergames.scalacube.net/forums\n"
					+ "&aand we will attend to it as soon as we can. Thanks!"));
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}

}
