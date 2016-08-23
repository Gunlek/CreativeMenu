package com.simpleduino.CreativeMenu.Menu;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class CommandsMenu {

    Inventory i = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "Liste des commandes");
    ItemMeta im;
    ArrayList<String> lore = new ArrayList<>();

    public CommandsMenu()
    {
        ItemStack greenPane = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemStack greyPane = new ItemStack(Material.STAINED_GLASS_PANE);
        greenPane.setDurability((short) 13);
        greyPane.setDurability((short) 0);

        ItemStack netherStar = new ItemStack(Material.NETHER_STAR, 1);
        this.im = netherStar.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/spawn");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Vous teleporte au spawn");
        this.im.setLore(this.lore);
        netherStar.setItemMeta(this.im);

        ItemStack bed = new ItemStack(Material.BED, 1);
        this.im = bed.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/sethome, /home");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Définie un /home");
        this.lore.add(ChatColor.WHITE + "Vous téléporte à un de vos /home");
        this.im.setLore(this.lore);
        bed.setItemMeta(this.im);

        ItemStack compass = new ItemStack(Material.COMPASS, 1);
        this.im = compass.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/tpahere <player>, /tpa <player>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Envoie un requête pour téléporter un joueur à vous");
        this.lore.add(ChatColor.WHITE + "Envoie un requête pour vous téléporter vers un joueur");
        this.im.setLore(this.lore);
        compass.setItemMeta(this.im);

        ItemStack comparator = new ItemStack(Material.REDSTONE_COMPARATOR, 1);
        this.im = comparator.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/helpop <message>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Envoie un message d'assitance à un modérateur");
        this.im.setLore(this.lore);
        comparator.setItemMeta(this.im);

        ItemStack creeperHead = new ItemStack(Material.SKULL_ITEM, 1);
        this.im = creeperHead.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/hat");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Place le bloc courant sur votre tête");
        this.im.setLore(this.lore);
        creeperHead.setDurability((short)4);
        creeperHead.setItemMeta(this.im);

        ItemStack witherHead = new ItemStack(Material.SKULL_ITEM, 1);
        this.im = witherHead.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/skull <pseudo>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Donne la tête du joueur demandé");
        this.im.setLore(this.lore);
        witherHead.setDurability((short)1);
        witherHead.setItemMeta(this.im);

        ItemStack hopper = new ItemStack(Material.HOPPER, 1);
        this.im = hopper.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/ci");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Vide votre inventaire");
        this.im.setLore(this.lore);
        hopper.setItemMeta(this.im);

        ItemStack speedPotion = new ItemStack(Material.POTION, 1);
        PotionMeta pm = (PotionMeta)speedPotion.getItemMeta();
        pm.setMainEffect(PotionEffectType.SPEED);
        pm.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 30, 2, false, false), true);
        pm.setDisplayName(ChatColor.YELLOW + "/speed 1-10");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Modifie votre vitesse");
        pm.setLore(this.lore);
        speedPotion.setItemMeta(pm);

        ItemStack leave = new ItemStack(Material.LEAVES, 1);
        this.im = leave.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/plot set biome <biome_type>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Définie le biome de votre parcelle");
        this.im.setLore(this.lore);
        leave.setItemMeta(this.im);

        ItemStack double_plant = new ItemStack(Material.DOUBLE_PLANT, 1);
        this.im = double_plant.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/ptime <time>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Définie l'heure personnelle");
        this.im.setLore(this.lore);
        double_plant.setDurability((short)0);
        double_plant.setItemMeta(this.im);

        ItemStack snow = new ItemStack(Material.SNOW, 1);
        this.im = snow.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/pweather <weather>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Définie la météo personnelle");
        this.im.setLore(this.lore);
        snow.setItemMeta(this.im);

        ItemStack grass = new ItemStack(Material.GRASS, 1);
        this.im = grass.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/plot claim ou /plot auto");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Protège une parcelle");
        this.lore.add(ChatColor.WHITE + "Vous permet de construire dessus ensuite");
        this.im.setLore(this.lore);
        grass.setItemMeta(this.im);

        ItemStack bucket = new ItemStack(Material.BUCKET, 1);
        this.im = bucket.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/plot clear");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Reset une parcelle à son état d'origine");
        this.im.setLore(this.lore);
        bucket.setItemMeta(this.im);

        ItemStack wooden_door = new ItemStack(Material.WOOD_DOOR, 1);
        this.im = wooden_door.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/plot add <pseudo>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Ajoute le joueur spécifié à votre parcelle");
        this.im.setLore(this.lore);
        wooden_door.setItemMeta(this.im);

        ItemStack iron_door = new ItemStack(Material.IRON_DOOR, 1);
        this.im = iron_door.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/plot remove <pseudo>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Retire le joueur spécifié de votre parcelle");
        this.im.setLore(this.lore);
        iron_door.setItemMeta(this.im);

        ItemStack note_block = new ItemStack(Material.NOTE_BLOCK, 1);
        this.im = note_block.getItemMeta();
        this.im.setDisplayName(ChatColor.YELLOW + "/plot deny <pseudo>");
        this.lore.clear();
        this.lore.add(ChatColor.WHITE + "Interdit l'accès à votre parcelle au joueur spécifié");
        this.im.setLore(this.lore);
        note_block.setItemMeta(this.im);

        this.i.setItem(0, greyPane);
        this.i.setItem(1, netherStar);
        this.i.setItem(2, bed);
        this.i.setItem(3, compass);
        this.i.setItem(4, comparator);
        this.i.setItem(5, creeperHead);
        this.i.setItem(6, witherHead);
        this.i.setItem(7, hopper);
        this.i.setItem(8, greenPane);
        this.i.setItem(9, speedPotion);
        this.i.setItem(10, greyPane);
        this.i.setItem(11, greenPane);
        this.i.setItem(12, greyPane);
        this.i.setItem(13, greenPane);
        this.i.setItem(14, greyPane);
        this.i.setItem(15, greenPane);
        this.i.setItem(16, greyPane);
        this.i.setItem(17, leave);
        this.i.setItem(18, greenPane);
        this.i.setItem(19, double_plant);
        this.i.setItem(20, snow);
        this.i.setItem(21, grass);
        this.i.setItem(22, bucket);
        this.i.setItem(23, wooden_door);
        this.i.setItem(24, iron_door);
        this.i.setItem(25, note_block);
        this.i.setItem(26, greyPane);
    }

    public Inventory getInventory()
    {
        return this.i;
    }
}
