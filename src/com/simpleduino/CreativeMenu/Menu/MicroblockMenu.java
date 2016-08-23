package com.simpleduino.CreativeMenu.Menu;

import com.simpleduino.CreativeMenu.Microblocks.MBType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class MicroblockMenu {

    Inventory i = Bukkit.createInventory(null, 9, ChatColor.YELLOW + "Microblocks");

    public MicroblockMenu()
    {
        ItemStack foodMenu = new ItemStack(Material.SKULL_ITEM, 1);
        foodMenu.setDurability((short) 3);
        SkullMeta foodMenum = (SkullMeta)foodMenu.getItemMeta();
        foodMenum.setOwner(MBType.BLOCK_MAP.get("taco").getPlayerName());
        foodMenum.setDisplayName(ChatColor.BLUE + "Microblock Nourriture");
        foodMenu.setItemMeta(foodMenum);
        this.i.setItem(3, foodMenu);

        ItemStack blaze = new ItemStack(Material.SKULL_ITEM, 1);
        blaze.setDurability((short) 3);
        SkullMeta blazem = (SkullMeta)blaze.getItemMeta();
        blazem.setOwner(MBType.BLOCK_MAP.get("blaze").getPlayerName());
        blazem.setDisplayName(ChatColor.BLUE + "Microblock Créatures");
        blaze.setItemMeta(blazem);
        this.i.setItem(4, blaze);

        ItemStack iron_block = new ItemStack(Material.SKULL_ITEM, 1);
        iron_block.setDurability((short) 3);
        SkullMeta iron_blockm = (SkullMeta)iron_block.getItemMeta();
        iron_blockm.setOwner("metalhedd");
        iron_blockm.setDisplayName("Microblock Construction");
        iron_block.setItemMeta(iron_blockm);
        this.i.setItem(5, iron_block);

        ItemStack back = new ItemStack(Material.BARRIER, 1);
        ItemMeta backM = back.getItemMeta();
        backM.setDisplayName(ChatColor.DARK_RED + "Retour au principal");
        back.setItemMeta(backM);
        this.i.setItem(this.i.getSize()-1, back);
    }

    public Inventory getInventory()
    {
        return this.i;
    }
}
