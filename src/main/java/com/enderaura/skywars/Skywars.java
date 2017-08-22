package com.enderaura.skywars;

import com.enderaura.skywars.listeners.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Skywars extends JavaPlugin {

    @Override
    public void onEnable() {
        register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    private void register() {
        new DeathListener(this);
    }
}
