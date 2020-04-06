package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VotelinksCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aVote using these links!\n"
					+ "&a&nhttps://minecraftservers.org/server/530470\n"
					+ "&a&nhttps://minecraft-server-list.com/server/436547/\n"
					+ "&a&nhttps://www.planetminecraft.com/server/hypergames-mc/\n"
					+ "&aThank you very much for helping out the server by voting!"));
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}
	

}
