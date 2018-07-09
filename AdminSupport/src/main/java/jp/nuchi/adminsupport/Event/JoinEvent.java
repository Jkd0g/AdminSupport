package jp.nuchi.adminsupport.Event;

import jp.nuchi.adminsupport.AdminSupport;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    AdminSupport plugin = jp.nuchi.adminsupport.AdminSupport.getPlugin(AdminSupport.class);

    @EventHandler
    public boolean JoinEvent(PlayerJoinEvent e){
        Player p =e.getPlayer();

        if (plugin.getConfig().getBoolean("JoinMessageSet1")){
            p.sendMessage(plugin.getConfig().getString("JoinMessage1"));
        }
        if (plugin.getConfig().getBoolean("JoinMessageSet2")) {

            p.sendMessage(plugin.getConfig().getString("JoinMessage2"));
        }
        if (plugin.getConfig().getBoolean("JoinMessageSet3")){
            p.sendMessage(plugin.getConfig().getString("JoinMessage3"));
        }
        if (plugin.getConfig().getBoolean("JoinMessageSet4")){
            p.sendMessage(plugin.getConfig().getString("JoinMessage4"));
        }
        if (plugin.getConfig().getBoolean("JoinMessageSet5")) {
            p.sendMessage(plugin.getConfig().getString("JoinMessage5"));
        }
        return false;
    }

}
