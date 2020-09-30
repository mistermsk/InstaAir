package com.shanebeestudios.ia;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class InstaAir extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
    }

}
