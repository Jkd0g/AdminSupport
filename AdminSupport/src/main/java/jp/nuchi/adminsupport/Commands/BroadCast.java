package jp.nuchi.adminsupport.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadCast implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        Player p = (Player)sender;

        command.getName().equalsIgnoreCase("BC");

        if (!(sender instanceof Player)){
            return true;
        }
        if (args.length == 0) {
            return true;
        }
            String message = null;
            for (String s : args) {
                if (message == null) {
                    message = s;
                    continue;
                }
                message = message + " " + s;
            }
            message = ChatColor.translateAlternateColorCodes('&', ChatColor.RED +"【" + ChatColor.GOLD + p.getDisplayName() + ChatColor.RED + "】" + ChatColor.WHITE + message);
            Bukkit.broadcastMessage(message);
            return true;
        }
    }
