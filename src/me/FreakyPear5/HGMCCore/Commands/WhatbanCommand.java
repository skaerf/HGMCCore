package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WhatbanCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aTo find out more about what can get you banned, "
					+ "&aplease speak to a staff member or go online to\n"
					+ "&a&nmc.hypergames.scalacube.net/bannable-offenses\n"
					+ "&ato get more information."));
		}
		else {
			sender.sendMessage("This command is blocked for console! If you think this is incorrect, please tell FreakyPear5!");
		}
		return true;
	}

}
