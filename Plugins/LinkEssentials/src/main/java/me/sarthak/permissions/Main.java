package me.sarthak.permissions;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "██╗░░░░░██╗███╗░░██╗██╗░░██╗       ░█████╗░██╗████████╗██╗░░░██╗\n" +
                "██║░░░░░██║████╗░██║██║░██╔╝       ██╔══██╗██║╚══██╔══╝╚██╗░██╔╝\n" +
                "██║░░░░░██║██╔██╗██║█████═╝░       ██║░░╚═╝██║░░░██║░░░░╚████╔╝░\n" +
                "██║░░░░░██║██║╚████║██╔═██╗░       ██║░░██╗██║░░░██║░░░░░╚██╔╝░░\n" +
                "███████╗██║██║░╚███║██║░╚██╗       ╚█████╔╝██║░░░██║░░░░░░██║░░░\n" +
                "╚══════╝╚═╝╚═╝░░╚══╝╚═╝░░╚═╝       ░╚════╝░╚═╝░░░╚═╝░░░░░░╚═╝░░░\n" +
                "\n" +
                "                Author: TheSarthakDev \n" +
                "               Dc: TheSarthakDev#6496 \n" +
                "              Github: github.com/thesarthakdev \n" +
                "             Website: https://www.thesarthakdev.wiki \n" +
                "              Made With ♥ By City Studios \n"+
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        System.out.println("LinkCity Has Been Loaded.");
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("gmc").setExecutor(new GmcCommand());
        getCommand("godset").setExecutor(new GodSet());
    }

}
