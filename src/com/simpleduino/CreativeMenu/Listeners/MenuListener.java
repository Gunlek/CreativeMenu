package com.simpleduino.CreativeMenu.Listeners;

import com.simpleduino.CreativeMenu.API.SendToServer;
import com.simpleduino.CreativeMenu.Menu.*;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.TimeUnit;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class MenuListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e)
    {
        if(e.getWhoClicked() instanceof Player && e.getInventory().getType().equals(InventoryType.CHEST)) {
            Player p = (Player)e.getWhoClicked();
            if(ChatColor.stripColor(e.getInventory().getTitle()).equalsIgnoreCase("Créatif") || ChatColor.stripColor(e.getInventory().getTitle()).equalsIgnoreCase("Liste des commandes"))
            {
                e.setCancelled(true);
            }
            if(e.getInventory().getItem(e.getSlot()).hasItemMeta())
            {
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Liens (Forum/Teamspeak)")) {
                    p.closeInventory();
                    p.sendMessage(ChatColor.YELLOW + "Notre forum: " + ChatColor.RESET + "http://endless-fight.com/forum");
                    p.sendMessage(ChatColor.YELLOW + "Notre teamspeak: " + ChatColor.RESET + "ts.nativgaming.com");
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Retour au lobby")) {
                    p.closeInventory();
                    new SendToServer("lobby", p);
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Fermer le menu")) {
                    p.closeInventory();
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Retour au principal")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.openInventory(new MainMenu((Player) e.getWhoClicked()).getInventory());
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Retour au spawn")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.teleport(p.getWorld().getSpawnLocation());
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Microblocks")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.openInventory(new MicroblockMenu().getInventory());
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Liste des grades")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.openInventory(new GradeMenu().getInventory());
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Commandes utiles")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.openInventory(new CommandsMenu().getInventory());
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Microblock Nourriture")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.openInventory(new FoodMicroblockMenu().getInventory());
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Microblock Créatures")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.openInventory(new AnimalsMicroblockMenu().getInventory());
                }
                if (ChatColor.stripColor(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName()).equalsIgnoreCase("Microblock Construction")) {
                    e.setCancelled(true);
                    p.closeInventory();
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    p.openInventory(new ConstructionMicroblockMenu().getInventory());
                }
            }
            if(e.getClickedInventory().getItem(e.getSlot()).getItemMeta().hasLore()) {
                if (!e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getLore().isEmpty()) {
                    if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getLore().contains("microblock")) {
                        p.closeInventory();
                        ItemStack toGive = e.getClickedInventory().getItem(e.getSlot());
                        toGive.setAmount(1);
                        p.getInventory().addItem(toGive);
                    }
                }
            }
        }
    }

}
