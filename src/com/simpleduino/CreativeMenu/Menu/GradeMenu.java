package com.simpleduino.CreativeMenu.Menu;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class GradeMenu {

    Inventory i = Bukkit.createInventory(null, 54, ChatColor.YELLOW + "Liste des grades");

    public GradeMenu()
    {

    }

    public Inventory getInventory()
    {
        return this.i;
    }
}
