package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoteCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aPlease go to &nmc.hypergames.scalacube.net/vote"
					+ "&a to vote, or join the discord server by using &3/discord&a!"
					+ "&aIf you want to get the voting links now, just do\n"
					+ "&3/votelinks&a!"));
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}
	

}
