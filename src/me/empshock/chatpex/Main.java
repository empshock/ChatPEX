package me.empshock.chatpex;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Main
        extends JavaPlugin
        implements Listener
{
    public static Main plugin;

    public void onDisable()
    {
        PluginDescriptionFile pdfFile = getDescription();
        System.out.print("[ChatPEX] Plugin enabled!");
    }

    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
        PluginDescriptionFile pdfFile = getDescription();
        System.out.print("[ChatPEX] Plugin disabled!");
    }



    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e)
    {
        Player player = e.getPlayer();
        String prefix = PermissionsEx.getUser(player).getPrefix();
        String suffix = PermissionsEx.getUser(player).getSuffix();
        String suffixcolor = ChatColor.translateAlternateColorCodes('&', suffix);
        String prefixcolor = ChatColor.translateAlternateColorCodes('&', prefix);
        player.setDisplayName(prefixcolor + player.getName() + suffixcolor);
    }
}

