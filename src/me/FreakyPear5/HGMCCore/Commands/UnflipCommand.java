package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnflipCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.chat("┬─┬ ノ( ゜-゜ノ)");
		}
		else {
			sender.sendMessage("n00b");
		}
		return true;
	}

}
