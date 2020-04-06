package me.FreakyPear5.HGMCCore.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_12_R1.EntityWither;
import net.minecraft.server.v1_12_R1.Packet;
import net.minecraft.server.v1_12_R1.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_12_R1.PacketPlayOutSpawnEntityLiving;

public class VanishCommand implements CommandExecutor {

	@Override
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (player.hasPermission("hgmc.vanish")) {
				if (args.length == 0) {
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aUsage: /vanish <on/off>"));
					return true;
				}
				else {
					if (args[0].equals("on")) {
						player.performCommand("btlp hide on");
						Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&e" + Bukkit.getPlayer("username") + " has left the game"));
						Location loc = player.getLocation();
						World playerworld = player.getWorld();
						EntityWither wither = newEntityWither(playerworld);
						wither.setLocation(loc.getX(), loc.getY() - 10, loc.getZ(), 0, 0);
						wither.setCustomName(ChatColor.translateAlternateColorCodes('&', "&aYou are in Staff Mode!"));
						Packet packet = new PacketPlayOutSpawnEntityLiving(wither);
						((CraftPlayer) player).getHandle().playerConnection.sendPacket((Packet<?>) packet);
						for (Player online : Bukkit.getOnlinePlayers()) {
							if (!online.hasPermission("hgmc.vanish.see")) online.hidePlayer(player);
							player.score
							return true;
							
						}
					}
					else {
						if (args[0].equals("off")) {
							player.performCommand("btlp hide off");
							Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&e" + Bukkit.getPlayer("username") + " has joined the game"));
							Player online = (Player) Bukkit.getOnlinePlayers();
							Packet packet = new PacketPlayOutEntityDestroy(wither);
							((CraftPlayer) player).getHandle().playerConnection
							player.showPlayer(online);
							return true;
						}
					}
				}
			}
			else {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHyperGames MC >> &aYou do not have permission to perform this command!"));
			}
		}
		else {
			
		}
		return false;
	}

	private EntityWither newEntityWither(World playerworld) {
		// TODO Auto-generated method stub
		return null;
	}

}
