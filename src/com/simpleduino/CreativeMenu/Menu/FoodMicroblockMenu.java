package com.simpleduino.CreativeMenu.Menu;

import com.simpleduino.CreativeMenu.Microblocks.MBType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class FoodMicroblockMenu {

    Inventory i = Bukkit.createInventory(null, 9, ChatColor.YELLOW + "Microblock nourriture");

    public FoodMicroblockMenu()
    {
        ItemStack apple = new ItemStack(Material.SKULL_ITEM, 1);
        apple.setDurability((short) 3);
        SkullMeta applem = (SkullMeta)apple.getItemMeta();
        applem.setOwner(MBType.BLOCK_MAP.get("apple").getPlayerName());
        applem.setDisplayName("Apple");
        ArrayList<String> appleLore = new ArrayList<>();
        appleLore.add("microblock");
        applem.setLore(appleLore);
        apple.setItemMeta(applem);
        this.i.setItem(0, apple);

        ItemStack melon = new ItemStack(Material.SKULL_ITEM, 1);
        melon.setDurability((short) 3);
        SkullMeta melonm = (SkullMeta)melon.getItemMeta();
        melonm.setOwner(MBType.BLOCK_MAP.get("melon").getPlayerName());
        melonm.setDisplayName("Melon");
        ArrayList<String> melonLore = new ArrayList<>();
        melonLore.add("microblock");
        melonm.setLore(appleLore);
        melon.setItemMeta(melonm);
        this.i.setItem(1, melon);

        ItemStack popcorn = new ItemStack(Material.SKULL_ITEM, 1);
        popcorn.setDurability((short) 3);
        SkullMeta popcornm = (SkullMeta)popcorn.getItemMeta();
        popcornm.setOwner(MBType.BLOCK_MAP.get("popcorn").getPlayerName());
        popcornm.setDisplayName("Popcorn");
        ArrayList<String> popcornLore = new ArrayList<>();
        popcornLore.add("microblock");
        popcornm.setLore(popcornLore);
        popcorn.setItemMeta(popcornm);
        this.i.setItem(2, popcorn);

        ItemStack pumpkin = new ItemStack(Material.SKULL_ITEM, 1);
        pumpkin.setDurability((short) 3);
        SkullMeta pumpkinm = (SkullMeta)pumpkin.getItemMeta();
        pumpkinm.setOwner(MBType.BLOCK_MAP.get("pumpkin").getPlayerName());
        pumpkinm.setDisplayName("Pumpkin");
        ArrayList<String> pumpkinLore = new ArrayList<>();
        pumpkinLore.add("microblock");
        pumpkinm.setLore(pumpkinLore);
        pumpkin.setItemMeta(pumpkinm);
        this.i.setItem(3, pumpkin);

        ItemStack taco = new ItemStack(Material.SKULL_ITEM, 1);
        taco.setDurability((short) 3);
        SkullMeta tacom = (SkullMeta)taco.getItemMeta();
        tacom.setOwner(MBType.BLOCK_MAP.get("taco").getPlayerName());
        tacom.setDisplayName("Taco");
        ArrayList<String> tacoLore = new ArrayList<>();
        tacoLore.add("microblock");
        tacom.setLore(tacoLore);
        taco.setItemMeta(tacom);
        this.i.setItem(4, taco);

        ItemStack cookie = new ItemStack(Material.SKULL_ITEM, 1);
        cookie.setDurability((short) 3);
        SkullMeta cookiem = (SkullMeta)cookie.getItemMeta();
        cookiem.setOwner(MBType.BLOCK_MAP.get("cookie").getPlayerName());
        cookiem.setDisplayName("Cookie");
        ArrayList<String> cookieLore = new ArrayList<>();
        cookieLore.add("microblock");
        cookiem.setLore(cookieLore);
        cookie.setItemMeta(cookiem);
        this.i.setItem(5, cookie);

        ItemStack haybale = new ItemStack(Material.SKULL_ITEM, 1);
        haybale.setDurability((short) 3);
        SkullMeta haybalem = (SkullMeta)apple.getItemMeta();
        haybalem.setOwner(MBType.BLOCK_MAP.get("haybale").getPlayerName());
        haybalem.setDisplayName("Haybale");
        ArrayList<String> haybalemLore = new ArrayList<>();
        haybalemLore.add("microblock");
        haybalem.setLore(haybalemLore);
        haybale.setItemMeta(haybalem);
        this.i.setItem(6, haybale);

        ItemStack cake = new ItemStack(Material.SKULL_ITEM, 1);
        cake.setDurability((short) 3);
        SkullMeta cakem = (SkullMeta)apple.getItemMeta();
        cakem.setOwner(MBType.BLOCK_MAP.get("cake").getPlayerName());
        cakem.setDisplayName("Cake");
        ArrayList<String> cakeLore = new ArrayList<>();
        cakeLore.add("microblock");
        cakem.setLore(cakeLore);
        cake.setItemMeta(cakem);
        this.i.setItem(7, cake);

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
