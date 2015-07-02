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
        String c = "&";
        String suffixcolor = "";
        if (suffix.toLowerCase().contains(c))
        {
            if (suffix.contains(c + "0")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "1")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "2")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "3")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "4")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "5")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "6")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "7")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "8")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "9")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "a")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "b")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "c")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "d")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "e")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
            if (suffix.contains(c + "f")) {
                suffixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), suffix);
            }
        }
        else
        {
            suffixcolor = suffix;
        }
        String prefixcolor = "";
        if (prefix.toLowerCase().contains(c))
        {
            if (prefix.contains(c + "0")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "1")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "2")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "3")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "4")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "5")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "6")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "7")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "8")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "9")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "a")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "b")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "c")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "d")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "e")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
            if (prefix.contains(c + "f")) {
                prefixcolor = ChatColor.translateAlternateColorCodes(c.charAt(0), prefix);
            }
        }
        else
        {
            prefixcolor = prefix;
        }
        player.setDisplayName(prefixcolor + player.getName() + suffixcolor);
    }
}

