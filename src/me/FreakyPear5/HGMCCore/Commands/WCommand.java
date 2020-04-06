package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (player.hasPermission("hgmc.wand")) {
				player.getPlayer().getInventory().addItem(new ItemStack(Material.WOOD_AXE, 1));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aLeft click sel pos 1"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aRight click sel pos 2"));
			}
			else {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aYou do not have permission!"));
				}
			}
		

		
		return true;
	}

}
