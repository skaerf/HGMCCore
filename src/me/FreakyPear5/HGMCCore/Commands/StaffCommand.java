package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class StaffCommand implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (player.hasPermission("hgmc.staff")) {
				String staffmember = player.getName();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aHello, " + staffmember + "!"
						+ "\n&aWelcome to the staff's alternate dimension!"));
				player.sendTitle("Staff's Dimension", "Welcome " + staffmember);
			}
			else {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aYou do not have permission!"));
			}
		}
		else {
			sender.sendMessage("fatrt");
		}
		return true;
	}

}
