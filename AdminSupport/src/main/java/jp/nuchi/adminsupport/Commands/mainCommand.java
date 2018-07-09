package jp.nuchi.adminsupport.Commands;

import jp.nuchi.adminsupport.AdminSupport;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import static jp.nuchi.adminsupport.AdminSupport.prefix;


public class mainCommand implements CommandExecutor {

    AdminSupport plugin = jp.nuchi.adminsupport.AdminSupport.getPlugin(AdminSupport.class);

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        command.getName().equalsIgnoreCase("admin"); {
            switch (args.length) {

                case 0:

                    sender.sendMessage(ChatColor.GOLD + "=====" + ChatColor.GREEN + prefix + ChatColor.GOLD + "=====");
                    sender.sendMessage(ChatColor.GOLD + "ver1.0");
                    sender.sendMessage(ChatColor.AQUA + "制作者：Nuchi");
                    break;
                case 1:
                    if (args[0].equalsIgnoreCase("help")) {
                        sender.sendMessage(ChatColor.AQUA + "/Twtter ツイッターのリンクのメッセージを送ります。");
                        sender.sendMessage(ChatColor.AQUA + "/Discord ディスコードのリンクのメッセージを送ります。");
                        sender.sendMessage(ChatColor.AQUA + "/Youtube Youtubeのリンクのメッセージを送ります。");
                        sender.sendMessage(ChatColor.AQUA + "/WebSite ウェブのリンクのメッセージを送ります。");
                        sender.sendMessage(ChatColor.AQUA + "/Admin reload AdminSupportのコンフィグをリロードします。");
                        break;
                    }
                    if (args[0].equalsIgnoreCase("reload")) {
                        if (sender.hasPermission("AdminSupport.admin"))
                            plugin.reloadConfig();
                            plugin.saveDefaultConfig();
                        sender.sendMessage(prefix + ChatColor.GRAY + "コンフィグをリロードしました。");
                        break;
                    } else {
                        sender.sendMessage(prefix + ChatColor.GRAY + "存在しないコマンドです。");
                        break;
                    }

            }
        }


return true;

                    }
            }



