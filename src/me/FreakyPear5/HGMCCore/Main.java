package me.FreakyPear5.HGMCCore;


import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.FreakyPear5.HGMCCore.Commands.BugCommand;
import me.FreakyPear5.HGMCCore.Commands.BungeeCommand;
import me.FreakyPear5.HGMCCore.Commands.BuyCommand;
import me.FreakyPear5.HGMCCore.Commands.CmdCommand;
import me.FreakyPear5.HGMCCore.Commands.ConsoleCommand;
import me.FreakyPear5.HGMCCore.Commands.DiscordCommand;
import me.FreakyPear5.HGMCCore.Commands.GrantCommand;
import me.FreakyPear5.HGMCCore.Commands.HGMCCoreCommand;
import me.FreakyPear5.HGMCCore.Commands.HelpCommand;
import me.FreakyPear5.HGMCCore.Commands.HiCommand;
import me.FreakyPear5.HGMCCore.Commands.Howlong2Command;
import me.FreakyPear5.HGMCCore.Commands.HowlongCommand;
import me.FreakyPear5.HGMCCore.Commands.MasssayCommand;
import me.FreakyPear5.HGMCCore.Commands.RulesCommand;
import me.FreakyPear5.HGMCCore.Commands.ShrugCommand;
import me.FreakyPear5.HGMCCore.Commands.SpigotCommand;
import me.FreakyPear5.HGMCCore.Commands.StaffCommand;
import me.FreakyPear5.HGMCCore.Commands.SudoCommand;
import me.FreakyPear5.HGMCCore.Commands.TableflipCommand;
import me.FreakyPear5.HGMCCore.Commands.UnflipCommand;
import me.FreakyPear5.HGMCCore.Commands.VanishCommand;
import me.FreakyPear5.HGMCCore.Commands.VipCommand;
import me.FreakyPear5.HGMCCore.Commands.VoteCommand;
import me.FreakyPear5.HGMCCore.Commands.VotelinksCommand;
import me.FreakyPear5.HGMCCore.Commands.WCommand;
import me.FreakyPear5.HGMCCore.Commands.WhatbanCommand;

public class Main extends JavaPlugin{

	public void onEnable() {
		System.out.println("[HGMCCore] Booting, please wait...");
		System.out.println("[HGMCCore] Grabbing commands...");
		this.getCommand("vote").setExecutor((CommandExecutor)new VoteCommand());
		this.getCommand("rules").setExecutor((CommandExecutor)new RulesCommand());
		this.getCommand("bug").setExecutor((CommandExecutor)new BugCommand());
		this.getCommand("whatban").setExecutor((CommandExecutor)new WhatbanCommand());
		this.getCommand("help").setExecutor((CommandExecutor)new HelpCommand());
		this.getCommand("discord").setExecutor((CommandExecutor)new DiscordCommand());
		this.getCommand("votelinks").setExecutor((CommandExecutor)new VotelinksCommand());
		this.getCommand("howlong").setExecutor((CommandExecutor)new HowlongCommand());
		this.getCommand("howlong2").setExecutor((CommandExecutor)new Howlong2Command());
		this.getCommand("hgmccore").setExecutor((CommandExecutor)new HGMCCoreCommand());
		this.getCommand("bungee").setExecutor((CommandExecutor)new BungeeCommand());
		this.getCommand("spigot").setExecutor((CommandExecutor)new SpigotCommand());
		this.getCommand("w").setExecutor((CommandExecutor)new WCommand());
		this.getCommand("cmd").setExecutor((CommandExecutor)new CmdCommand());
		this.getCommand("vip").setExecutor((CommandExecutor)new VipCommand());
		this.getCommand("staff").setExecutor((CommandExecutor)new StaffCommand());
		this.getCommand("hi").setExecutor((CommandExecutor)new HiCommand());
		this.getCommand("shrug").setExecutor((CommandExecutor)new ShrugCommand());
		this.getCommand("tableflip").setExecutor((CommandExecutor)new TableflipCommand());
		this.getCommand("unflip").setExecutor((CommandExecutor)new UnflipCommand());
		this.getCommand("grant").setExecutor((CommandExecutor)new GrantCommand());
		this.getCommand("console").setExecutor((CommandExecutor)new ConsoleCommand());
		this.getCommand("sudo").setExecutor((CommandExecutor)new SudoCommand());
		this.getCommand("masssay").setExecutor((CommandExecutor)new MasssayCommand());
		this.getCommand("vanish").setExecutor((CommandExecutor)new VanishCommand());
		this.getCommand("buy").setExecutor((CommandExecutor)new BuyCommand());
		System.out.println("[HGMCCore] Sucessfully booted.");
	}
		
	public void onDisable() {
		System.out.println("[HGMCCore] Terminating all processes and shutting down.");
	}
}
