package com.simpleduino.CreativeMenu.Listeners;

import com.simpleduino.CreativeMenu.Menu.MainMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {
        Inventory i = e.getPlayer().getInventory();
        ItemStack c = new ItemStack(Material.COMPASS, 1);
        ItemMeta cim = c.getItemMeta();
        cim.setDisplayName(ChatColor.GREEN + "Menu");
        c.setItemMeta(cim);
        i.setItem(0, c);
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e)
    {
        if(e.getPlayer().getInventory().getItemInHand().getType().equals(Material.COMPASS) && ChatColor.stripColor(e.getPlayer().getInventory().getItemInHand().getItemMeta().getDisplayName()).equalsIgnoreCase("Menu"))
        {
            e.setCancelled(true);
            e.getPlayer().openInventory(new MainMenu(e.getPlayer()).getInventory());
        }
    }

    @EventHandler
    public void onInventoryInteract(InventoryInteractEvent e)
    {
        if(e.getInventory().getType().equals(InventoryType.PLAYER))
        {
            if(e.getInventory().getItem(0).getType().equals(Material.COMPASS))
            {
                e.setCancelled(true);
            }
            else
            {
                ItemStack c = new ItemStack(Material.COMPASS, 1);
                ItemMeta cim = c.getItemMeta();
                cim.setDisplayName(ChatColor.GREEN + "Menu");
                c.setItemMeta(cim);
                e.getInventory().setItem(0, c);
            }
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e)
    {
        if(e.getSlot() == 0)
        {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onInventoryMove(InventoryMoveItemEvent e)
    {
        if(e.getItem().getType().equals(Material.COMPASS) && ChatColor.stripColor(e.getItem().getItemMeta().getDisplayName()).equalsIgnoreCase("Menu"))
        {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onItemPickup(InventoryPickupItemEvent e)
    {
        if(e.getItem().getItemStack().getType().equals(Material.COMPASS) && ChatColor.stripColor(e.getItem().getItemStack().getItemMeta().getDisplayName()).equalsIgnoreCase("Menu"))
        {
            e.setCancelled(true);
        }
    }

}
