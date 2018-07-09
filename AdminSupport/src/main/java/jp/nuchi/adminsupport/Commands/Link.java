package jp.nuchi.adminsupport.Commands;

import jp.nuchi.adminsupport.AdminSupport;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Link  implements CommandExecutor {

    AdminSupport plugin = jp.nuchi.adminsupport.AdminSupport.getPlugin(AdminSupport.class);

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (command.getName().equalsIgnoreCase("Twitter")) {
            p.sendMessage(plugin.getConfig().getString("Twitter"));
        } else if (command.getName().equalsIgnoreCase("Discord")) {
            p.sendMessage(plugin.getConfig().getString("Discord"));
        } else if (command.getName().equalsIgnoreCase("Youtube")) {
            p.sendMessage(plugin.getConfig().getString("Youtube"));
        } else if (command.getName().equalsIgnoreCase("WebSite")){
            p.sendMessage(plugin.getConfig().getString("WebSite"));
            return true;

        }
        return false;
            }

}
