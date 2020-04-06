package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aJoin our Discord server\n"
					+ "&aat &nhttps://discord.gg/6wKCMkk&a!"));
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}
	

}
