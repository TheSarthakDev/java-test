package me.sarthak.permissions;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmcCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandsender, Command command, String s, String[] args) {
        if (commandsender instanceof Player){
            Player player = (Player) commandsender;
            if (player.hasPermission("bruhheal.gmc")){
                player.getPlayer().sendTitle(
                        ChatColor.GREEN + "✔ | Completed!",
                        ChatColor.GRAY + "Your Gamemode Has Been Switched To Creative.", 20 , 100, 20);
                player.setGameMode(GameMode.CREATIVE);

            } else {
                player.getPlayer().sendTitle(
                        ChatColor.RED + "✘ | DENIED",
                        ChatColor.GRAY + "You Don't Have Permission To Use This Command!", 20 , 100, 20);
            }

        }
        return false;
    }
}
