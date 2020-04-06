package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VipCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (player.hasPermission("hgmc.vip")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aTeleporting you to the VIP Lounge!"));
				player.teleport(new Location(Bukkit.getWorld("vip"), 278,71,21));
			}
			else {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aYou do not have permission!"));
			}
		}
		else {
			
		}
		return true;
	}

}
