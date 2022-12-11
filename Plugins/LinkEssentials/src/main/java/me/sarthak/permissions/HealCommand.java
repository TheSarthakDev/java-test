package me.sarthak.permissions;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandsender, Command command, String s, String[] args) {
        if (commandsender instanceof Player){
            Player player = (Player) commandsender;
            if (player.hasPermission("bruhheal.heal")){
                player.setHealth(20);
                player.getPlayer().sendTitle(
                        ChatColor.GREEN + "✔ | Completed!",
                        ChatColor.GRAY + "You Health Has Been Restored.", 20 , 100, 20);
            } else {
                player.getPlayer().sendTitle(
                        ChatColor.RED + "✘ | DENIED",
                        ChatColor.GRAY + "You Don't Have Permission To Use This Command!", 20 , 100, 20);
            }

        }
        return false;
    }
}
