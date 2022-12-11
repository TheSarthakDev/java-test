package me.sarthak.permissions;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GodSet implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandsender, Command command, String s, String[] args) {
        if (commandsender instanceof Player){
            Player player = (Player) commandsender;
            if (player.hasPermission("bruhheal.godset")){
                player.getPlayer().sendTitle(
                        ChatColor.GREEN + "✔ | Completed!",
                        ChatColor.GRAY + "You Have Been Given God Set.", 20 , 100, 20);


                ItemStack godHelmet = new ItemStack(Material.NETHERITE_HELMET);
                String godHelmetName = "Helmet Of Mighty Link";
                ArrayList<String> godHelmetLore = new ArrayList<String>();
                godHelmetLore.add("");
                godHelmetLore.add(ChatColor.AQUA + "✘ 〣 This Is An Extremely Powerful Helmet!");
                godHelmetLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Staff! Using Can Lead To A Ban!");
                godHelmetLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Showcase Purpose! Using It Can Lead To A Demote!");
                godHelmetLore.add("");
                ItemMeta Helmetmeta = godHelmet.getItemMeta();
                Helmetmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + godHelmetName);
                Helmetmeta.setLore(godHelmetLore);
                godHelmet.setItemMeta(Helmetmeta);
                godHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
                godHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 10);
                godHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
                godHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 10);
                godHelmet.addUnsafeEnchantment(Enchantment.THORNS, 10);
                godHelmet.addUnsafeEnchantment(Enchantment.MENDING, 1);

                ItemStack godChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
                String godChestplateName = "Chestplate Of Mighty Link";
                ArrayList<String> godChestplateLore = new ArrayList<String>();
                godChestplateLore.add("");
                godChestplateLore.add(ChatColor.AQUA + "✘ 〣 This Is An Extremely Powerful Chestplate!");
                godChestplateLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Staff! Using Can Lead To A Ban!");
                godChestplateLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Showcase Purpose! Using It Can Lead To A Demote!");
                godChestplateLore.add("");
                ItemMeta Chestplatemeta = godChestplate.getItemMeta();
                Chestplatemeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + godChestplateName);
                Chestplatemeta.setLore(godChestplateLore);
                godChestplate.setItemMeta(Chestplatemeta);
                godChestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
                godChestplate.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 10);
                godChestplate.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
                godChestplate.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 10);
                godChestplate.addUnsafeEnchantment(Enchantment.THORNS, 10);
                godChestplate.addUnsafeEnchantment(Enchantment.MENDING, 1);

                ItemStack godLeggins = new ItemStack(Material.NETHERITE_LEGGINGS);
                String godLegginsName = "Leggings Of Mighty Link";
                ArrayList<String> godLeggingsLore = new ArrayList<String>();
                godLeggingsLore.add("");
                godLeggingsLore.add(ChatColor.AQUA + "✘ 〣 This Is An Extremely Powerful Leggings!");
                godLeggingsLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Staff! Using Can Lead To A Ban!");
                godLeggingsLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Showcase Purpose! Using It Can Lead To A Demote!");
                godLeggingsLore.add("");
                ItemMeta Legginsmeta = godLeggins.getItemMeta();
                Legginsmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + godLegginsName);
                Legginsmeta.setLore(godLeggingsLore);
                godLeggins.setItemMeta(Legginsmeta);
                godLeggins.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
                godLeggins.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 10);
                godLeggins.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
                godLeggins.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 10);
                godLeggins.addUnsafeEnchantment(Enchantment.THORNS, 10);
                godLeggins.addUnsafeEnchantment(Enchantment.MENDING, 1);

                ItemStack godBoots = new ItemStack(Material.NETHERITE_BOOTS);
                ArrayList<String> godBootsLore = new ArrayList<String>();
                godBootsLore.add("");
                godBootsLore.add(ChatColor.AQUA + "✘ 〣 This Is An Extremely Powerful Boots!");
                godBootsLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Staff! Using Can Lead To A Ban!");
                godBootsLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Showcase Purpose! Using It Can Lead To A Demote!");
                godBootsLore.add("");
                String godBootsName = "Boots Of Mighty Link";
                ItemMeta bootsmeta = godBoots.getItemMeta();
                bootsmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + godBootsName);
                bootsmeta.setLore(godBootsLore);
                godBoots.setItemMeta(bootsmeta);
                godBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
                godBoots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 10);
                godBoots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
                godBoots.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 10);
                godBoots.addUnsafeEnchantment(Enchantment.THORNS, 10);
                godBoots.addUnsafeEnchantment(Enchantment.MENDING, 1);


                String godSwordName = "Sword Of Mighty Link";
                ArrayList<String> godSwordLore = new ArrayList<String>();
                godSwordLore.add("");
                godSwordLore.add(ChatColor.AQUA + "✘ 〣 This Is An Extremely Powerful Sword!");
                godSwordLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Staff! Using Can Lead To A Ban!");
                godSwordLore.add(ChatColor.AQUA + "✘ 〣 This Is Only For Showcase Purpose! Using It Can Lead To A Demote!");
                godSwordLore.add("");
                ItemStack godSword = new ItemStack(Material.NETHERITE_SWORD);
                ItemMeta swordmeta = godSword.getItemMeta();
                swordmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + godSwordName);
                swordmeta.setLore(godSwordLore);
                godSword.setItemMeta(swordmeta);
                godSword.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 10);
                godSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL,10);
                godSword.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,10);
                godSword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT,10);
                godSword.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
                godSword.addUnsafeEnchantment(Enchantment.MENDING, 1);

                ((Player) commandsender).getInventory().addItem(godHelmet);
                ((Player) commandsender).getInventory().addItem(godLeggins);
                ((Player) commandsender).getInventory().addItem(godChestplate);
                ((Player) commandsender).getInventory().addItem(godBoots);
                ((Player) commandsender).getInventory().addItem(godSword);
            } else {
                player.getPlayer().sendTitle(
                        ChatColor.RED + "✘ | DENIED",
                        ChatColor.GRAY + "You Don't Have Permission To Use This Command!", 20 , 100, 20);
            }

        }
        return false;
    }
}

