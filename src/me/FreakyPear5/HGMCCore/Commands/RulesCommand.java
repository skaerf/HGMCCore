package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RulesCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e---------- &c&lHGMC Rules&e ----------\n"
					+ "&81.&aBe nice to players and staff!\n"
					+ "&82.&aPlease don't hack! &3/whatban &afor more info!\n"
					+ "&83.&aDo not abuse glitches! &3/bug &afor more info!\n"
					+ "&84.&aBe considerate of other people's feelings when doing something!\n"
					+ "&85.&aHave Fun!"));
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}

}
