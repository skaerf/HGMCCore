package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e---------- &c&lHGMC Help&e ----------\n"
					+ "&6/<server> - &fTravel to the server you want to play on. i.e /skyblock\n"
					+ "&6/report <player> <reason> - &fReport someone if you think they are hacking!\n"
					+ "&6/hub - &fTeleport back to the hub!\n"
					+ "&6/friends - &fView help about the friend system!\n"
					+ "&e---------- &c&lHGMC Help&e ----------\n"));
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}
	

}
