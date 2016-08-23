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

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class ConstructionMicroblockMenu {

    Inventory i = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "Microblocks Construction");

    public ConstructionMicroblockMenu()
    {
        ArrayList<String> lore = new ArrayList<>();
        lore.add("microblock");

        ItemStack iron_block = new ItemStack(Material.SKULL_ITEM, 1);
        iron_block.setDurability((short) 3);
        SkullMeta iron_blockm = (SkullMeta)iron_block.getItemMeta();
        iron_blockm.setOwner("metalhedd");
        iron_blockm.setDisplayName("Iron Block");
        iron_blockm.setLore(lore);
        iron_block.setItemMeta(iron_blockm);
        this.i.setItem(0, iron_block);

        ItemStack gold_block = new ItemStack(Material.SKULL_ITEM, 1);
        gold_block.setDurability((short) 3);
        SkullMeta gold_blockm = (SkullMeta)iron_block.getItemMeta();
        gold_blockm.setOwner("teachdaire");
        gold_blockm.setDisplayName("Gold Block");
        gold_blockm.setLore(lore);
        gold_block.setItemMeta(gold_blockm);
        this.i.setItem(1, gold_block);

        ItemStack oak_wood = new ItemStack(Material.SKULL_ITEM, 1);
        oak_wood.setDurability((short) 3);
        SkullMeta oak_woodm = (SkullMeta)oak_wood.getItemMeta();
        oak_woodm.setOwner("MHF_OakLog");
        oak_woodm.setDisplayName("Oak Wood");
        oak_woodm.setLore(lore);
        oak_wood.setItemMeta(oak_woodm);
        this.i.setItem(2, oak_wood);

        ItemStack dark_oak_wood = new ItemStack(Material.SKULL_ITEM, 1);
        dark_oak_wood.setDurability((short) 3);
        SkullMeta dark_oak_woodm = (SkullMeta)oak_wood.getItemMeta();
        dark_oak_woodm.setOwner("Benlisted");
        dark_oak_woodm.setDisplayName("Spruce Wood");
        dark_oak_woodm.setLore(lore);
        dark_oak_wood.setItemMeta(dark_oak_woodm);
        this.i.setItem(3, dark_oak_wood);

        ItemStack jungle_wood = new ItemStack(Material.SKULL_ITEM, 1);
        jungle_wood.setDurability((short) 3);
        SkullMeta jungle_woodm = (SkullMeta)oak_wood.getItemMeta();
        jungle_woodm.setOwner("Thypthon");
        jungle_woodm.setDisplayName("Jungle Wood");
        jungle_woodm.setLore(lore);
        jungle_wood.setItemMeta(jungle_woodm);
        this.i.setItem(4, jungle_wood);

        ItemStack pumpkin = new ItemStack(Material.SKULL_ITEM, 1);
        pumpkin.setDurability((short) 3);
        SkullMeta pumpkinm = (SkullMeta)oak_wood.getItemMeta();
        pumpkinm.setOwner("MHF_Pumpkin");
        pumpkinm.setDisplayName("Pumpkin");
        pumpkinm.setLore(lore);
        pumpkin.setItemMeta(pumpkinm);
        this.i.setItem(5, pumpkin);

        ItemStack cactus = new ItemStack(Material.SKULL_ITEM, 1);
        cactus.setDurability((short) 3);
        SkullMeta cactusm = (SkullMeta)oak_wood.getItemMeta();
        cactusm.setOwner("MHF_Cactus");
        cactusm.setDisplayName("Cactus");
        cactusm.setLore(lore);
        cactus.setItemMeta(cactusm);
        this.i.setItem(6, cactus);

        ItemStack chest = new ItemStack(Material.SKULL_ITEM, 1);
        chest.setDurability((short) 3);
        SkullMeta chestm = (SkullMeta)oak_wood.getItemMeta();
        chestm.setOwner("MHF_Chest");
        chestm.setDisplayName("Chest");
        chestm.setLore(lore);
        chest.setItemMeta(chestm);
        this.i.setItem(7, chest);

        ItemStack dispenser = new ItemStack(Material.SKULL_ITEM, 1);
        dispenser.setDurability((short) 3);
        SkullMeta dispenserm = (SkullMeta)oak_wood.getItemMeta();
        dispenserm.setOwner("scemm");
        dispenserm.setDisplayName("Dispenser");
        dispenserm.setLore(lore);
        dispenser.setItemMeta(dispenserm);
        this.i.setItem(8, dispenser);

        ItemStack sponge = new ItemStack(Material.SKULL_ITEM, 1);
        sponge.setDurability((short) 3);
        SkullMeta spongem = (SkullMeta)oak_wood.getItemMeta();
        spongem.setOwner("pomi44");
        spongem.setDisplayName("Sponge");
        spongem.setLore(lore);
        sponge.setItemMeta(spongem);
        this.i.setItem(9, sponge);

        ItemStack jukebox = new ItemStack(Material.SKULL_ITEM, 1);
        jukebox.setDurability((short) 3);
        SkullMeta jukeboxm = (SkullMeta)oak_wood.getItemMeta();
        jukeboxm.setOwner("C418");
        jukeboxm.setDisplayName("JukeBox");
        jukeboxm.setLore(lore);
        jukebox.setItemMeta(jukeboxm);
        this.i.setItem(10, jukebox);

        ItemStack grass = new ItemStack(Material.SKULL_ITEM, 1);
        grass.setDurability((short) 3);
        SkullMeta grassm = (SkullMeta)oak_wood.getItemMeta();
        grassm.setOwner("MoulaTime");
        grassm.setDisplayName("Grass");
        grassm.setLore(lore);
        grass.setItemMeta(grassm);
        this.i.setItem(11, grass);

        ItemStack diamond_ore = new ItemStack(Material.SKULL_ITEM, 1);
        diamond_ore.setDurability((short) 3);
        SkullMeta diamond_orem = (SkullMeta)oak_wood.getItemMeta();
        diamond_orem.setOwner("akaBruce");
        diamond_orem.setDisplayName("Diamond Ore");
        diamond_orem.setLore(lore);
        diamond_ore.setItemMeta(diamond_orem);
        this.i.setItem(12, diamond_ore);

        ItemStack redstone_ore = new ItemStack(Material.SKULL_ITEM, 1);
        redstone_ore.setDurability((short) 3);
        SkullMeta redstone_orem = (SkullMeta)oak_wood.getItemMeta();
        redstone_orem.setOwner("annayirb");
        redstone_orem.setDisplayName("Redstone Ore");
        redstone_orem.setLore(lore);
        redstone_ore.setItemMeta(redstone_orem);
        this.i.setItem(13, redstone_ore);

        ItemStack radio = new ItemStack(Material.SKULL_ITEM, 1);
        radio.setDurability((short) 3);
        SkullMeta radiom = (SkullMeta)oak_wood.getItemMeta();
        radiom.setOwner("uioz");
        radiom.setDisplayName("Radio");
        radiom.setLore(lore);
        radio.setItemMeta(radiom);
        this.i.setItem(14, radio);

        ItemStack tv = new ItemStack(Material.SKULL_ITEM, 1);
        tv.setDurability((short) 3);
        SkullMeta tvm = (SkullMeta)oak_wood.getItemMeta();
        tvm.setOwner("Metroidling");
        tvm.setDisplayName("TV");
        tvm.setLore(lore);
        tv.setItemMeta(tvm);
        this.i.setItem(15, tv);

        ItemStack tnt = new ItemStack(Material.SKULL_ITEM, 1);
        tnt.setDurability((short) 3);
        SkullMeta tntm = (SkullMeta)oak_wood.getItemMeta();
        tntm.setOwner("MHF_TNT");
        tntm.setDisplayName("TNT V1");
        tntm.setLore(lore);
        tnt.setItemMeta(tntm);
        this.i.setItem(16, tnt);

        ItemStack tnt2 = new ItemStack(Material.SKULL_ITEM, 1);
        tnt2.setDurability((short) 3);
        SkullMeta tnt2m = (SkullMeta)oak_wood.getItemMeta();
        tnt2m.setOwner("MHF_TNT2");
        tnt2m.setDisplayName("TNT V2");
        tnt2m.setLore(lore);
        tnt2.setItemMeta(tnt2m);
        this.i.setItem(17, tnt2);

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
