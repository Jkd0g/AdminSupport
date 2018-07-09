package jp.nuchi.adminsupport;

import jp.nuchi.adminsupport.Commands.BroadCast;
import jp.nuchi.adminsupport.Commands.Link;
import jp.nuchi.adminsupport.Commands.mainCommand;
import jp.nuchi.adminsupport.Event.JoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class AdminSupport extends JavaPlugin {


    public final static String prefix = ChatColor.DARK_GREEN + "[" + ChatColor.RED + "AdminSupport" + ChatColor.DARK_GREEN + "]";
    @Override
    public void onEnable() {
        saveDefaultConfig();

        //起動メッセージ
        Bukkit.getConsoleSender().sendMessage(prefix + "プラグインを起動させました。");
        Bukkit.getConsoleSender().sendMessage(prefix + "制作者：Nuchi");
        Bukkit.getConsoleSender().sendMessage(prefix + "copyright  2018 Nuchi All Rights Reserved.");

        //イベント処理
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);

        //コマンドの追加
        getCommand("Twitter").setExecutor(new Link());
        getCommand("Youtube").setExecutor(new Link());
        getCommand("Discord").setExecutor(new Link());
        getCommand("WebSite").setExecutor(new Link());
        getCommand("BC").setExecutor(new BroadCast());
        getCommand("admin").setExecutor(new mainCommand());

    }

    @Override
    public void onDisable() {
        //終了メッセージ
        Bukkit.getConsoleSender().sendMessage(prefix + "プラグインを停止しました。");
        Bukkit.getConsoleSender().sendMessage(prefix + "制作者：Nuchi");
        Bukkit.getConsoleSender().sendMessage(prefix + "copyright Ⓒ 2018 Nuchi All Rights Reserved.");

        //終了する際にコンフィグをセーブ
        saveConfig();

    }



    }

