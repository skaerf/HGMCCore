package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HowlongCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (player.hasPermission("hgmc.howlong")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e---------- &c&lHow long? &e----------\n"
						+ "&aThis page will tell you how long to ban a player for!\n"
						+ "&aThe format is: <Hack> - <Length of time>\n"
						+ "&aXraying - 1 month\n"
						+ "&aFly - 7 days\n"
						+ "&aKillAura - 14 days\n"
						+ "&aTo view page 2, do &3/howlong2"));
			}
			else {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aYou do not have permission!"));
			}
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}

}
