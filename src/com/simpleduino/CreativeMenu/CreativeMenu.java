package com.simpleduino.CreativeMenu;

import com.simpleduino.CreativeMenu.Commands.menuExecutor;
import com.simpleduino.CreativeMenu.Listeners.MenuListener;
import com.simpleduino.CreativeMenu.Listeners.PlayerListener;
import com.simpleduino.CreativeMenu.Listeners.onPluginMessage;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class CreativeMenu extends JavaPlugin {

    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);

        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", new onPluginMessage());
        this.getServer().getPluginCommand("menu").setExecutor(new menuExecutor());
    }

    public void onDisable()
    {

    }

}
