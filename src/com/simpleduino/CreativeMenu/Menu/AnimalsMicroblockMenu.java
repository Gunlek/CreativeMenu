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
public class AnimalsMicroblockMenu {

    Inventory i = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "Microblock Créatures");

    public AnimalsMicroblockMenu()
    {
        ItemStack blaze = new ItemStack(Material.SKULL_ITEM, 1);
        blaze.setDurability((short) 3);
        SkullMeta blazem = (SkullMeta)blaze.getItemMeta();
        blazem.setOwner(MBType.BLOCK_MAP.get("blaze").getPlayerName());
        blazem.setDisplayName("Blaze");
        ArrayList<String> blazeLore = new ArrayList<>();
        blazeLore.add("microblock");
        blazem.setLore(blazeLore);
        blaze.setItemMeta(blazem);
        this.i.setItem(0, blaze);

        ItemStack cavespider = new ItemStack(Material.SKULL_ITEM, 1);
        cavespider.setDurability((short) 3);
        SkullMeta cavespiderm = (SkullMeta)cavespider.getItemMeta();
        cavespiderm.setOwner(MBType.BLOCK_MAP.get("cavespider").getPlayerName());
        cavespiderm.setDisplayName("Cavespider");
        ArrayList<String> cavespiderLore = new ArrayList<>();
        cavespiderLore.add("microblock");
        cavespiderm.setLore(cavespiderLore);
        cavespider.setItemMeta(cavespiderm);
        this.i.setItem(1, cavespider);

        ItemStack horse = new ItemStack(Material.SKULL_ITEM, 1);
        horse.setDurability((short) 3);
        SkullMeta horsem = (SkullMeta)horse.getItemMeta();
        horsem.setOwner(MBType.BLOCK_MAP.get("horse").getPlayerName());
        horsem.setDisplayName("Horse");
        ArrayList<String> horseLore = new ArrayList<>();
        horseLore.add("microblock");
        horsem.setLore(horseLore);
        horse.setItemMeta(horsem);
        this.i.setItem(2, horse);

        ItemStack chicken = new ItemStack(Material.SKULL_ITEM, 1);
        chicken.setDurability((short) 3);
        SkullMeta chickenm = (SkullMeta)chicken.getItemMeta();
        chickenm.setOwner(MBType.BLOCK_MAP.get("chicken").getPlayerName());
        chickenm.setDisplayName("Chicken");
        ArrayList<String> chickenLore = new ArrayList<>();
        chickenLore.add("microblock");
        chickenm.setLore(chickenLore);
        chicken.setItemMeta(chickenm);
        this.i.setItem(3, chicken);

        ItemStack cow = new ItemStack(Material.SKULL_ITEM, 1);
        cow.setDurability((short) 3);
        SkullMeta cowm = (SkullMeta)blaze.getItemMeta();
        cowm.setOwner(MBType.BLOCK_MAP.get("cow").getPlayerName());
        cowm.setDisplayName("Cow");
        ArrayList<String> cowLore = new ArrayList<>();
        cowLore.add("microblock");
        cowm.setLore(horseLore);
        cow.setItemMeta(cowm);
        this.i.setItem(4, cow);

        ItemStack enderman = new ItemStack(Material.SKULL_ITEM, 1);
        enderman.setDurability((short) 3);
        SkullMeta endermanm = (SkullMeta)blaze.getItemMeta();
        endermanm.setOwner(MBType.BLOCK_MAP.get("enderman").getPlayerName());
        endermanm.setDisplayName("Enderman");
        ArrayList<String> endermanLore = new ArrayList<>();
        endermanLore.add("microblock");
        endermanm.setLore(endermanLore);
        enderman.setItemMeta(endermanm);
        this.i.setItem(5, enderman);

        ItemStack golem = new ItemStack(Material.SKULL_ITEM, 1);
        golem.setDurability((short) 3);
        SkullMeta golemm = (SkullMeta)blaze.getItemMeta();
        golemm.setOwner(MBType.BLOCK_MAP.get("golem").getPlayerName());
        golemm.setDisplayName("Golem");
        ArrayList<String> golemLore = new ArrayList<>();
        golemLore.add("microblock");
        golemm.setLore(golemLore);
        golem.setItemMeta(golemm);
        this.i.setItem(6, golem);

        ItemStack herobrine = new ItemStack(Material.SKULL_ITEM, 1);
        herobrine.setDurability((short) 3);
        SkullMeta herobrinem = (SkullMeta)blaze.getItemMeta();
        herobrinem.setOwner(MBType.BLOCK_MAP.get("herobrine").getPlayerName());
        herobrinem.setDisplayName("Herobrine");
        ArrayList<String> herobrineLore = new ArrayList<>();
        herobrineLore.add("microblock");
        herobrinem.setLore(herobrineLore);
        herobrine.setItemMeta(herobrinem);
        this.i.setItem(7, herobrine);

        ItemStack lavaslime = new ItemStack(Material.SKULL_ITEM, 1);
        lavaslime.setDurability((short) 3);
        SkullMeta lavaslimem = (SkullMeta)blaze.getItemMeta();
        lavaslimem.setOwner(MBType.BLOCK_MAP.get("lavaslime").getPlayerName());
        lavaslimem.setDisplayName("Lavaslime");
        ArrayList<String> lavaslimeLore = new ArrayList<>();
        lavaslimeLore.add("microblock");
        lavaslimem.setLore(lavaslimeLore);
        lavaslime.setItemMeta(lavaslimem);
        this.i.setItem(8, lavaslime);

        ItemStack mushroomcow = new ItemStack(Material.SKULL_ITEM, 1);
        mushroomcow.setDurability((short) 3);
        SkullMeta mushroomcowm = (SkullMeta)blaze.getItemMeta();
        mushroomcowm.setOwner(MBType.BLOCK_MAP.get("mushroomcow").getPlayerName());
        mushroomcowm.setDisplayName("Mushroom Cow");
        ArrayList<String> mushroomcowLore = new ArrayList<>();
        mushroomcowLore.add("microblock");
        mushroomcowm.setLore(mushroomcowLore);
        mushroomcow.setItemMeta(mushroomcowm);
        this.i.setItem(9, mushroomcow);

        ItemStack pigzombie = new ItemStack(Material.SKULL_ITEM, 1);
        pigzombie.setDurability((short) 3);
        SkullMeta pigzombiem = (SkullMeta)blaze.getItemMeta();
        pigzombiem.setOwner(MBType.BLOCK_MAP.get("pigzombie").getPlayerName());
        pigzombiem.setDisplayName("Zombie Pigmen");
        ArrayList<String> pigzombieLore = new ArrayList<>();
        pigzombieLore.add("microblock");
        pigzombiem.setLore(pigzombieLore);
        pigzombie.setItemMeta(pigzombiem);
        this.i.setItem(10, pigzombie);

        ItemStack pig = new ItemStack(Material.SKULL_ITEM, 1);
        pig.setDurability((short) 3);
        SkullMeta pigm = (SkullMeta)blaze.getItemMeta();
        pigm.setOwner(MBType.BLOCK_MAP.get("pig").getPlayerName());
        pigm.setDisplayName("Pig");
        ArrayList<String> pigLore = new ArrayList<>();
        pigLore.add("microblock");
        pigm.setLore(pigLore);
        pig.setItemMeta(pigm);
        this.i.setItem(11, pig);

        ItemStack sheep = new ItemStack(Material.SKULL_ITEM, 1);
        sheep.setDurability((short) 3);
        SkullMeta sheepm = (SkullMeta)blaze.getItemMeta();
        sheepm.setOwner(MBType.BLOCK_MAP.get("sheep").getPlayerName());
        sheepm.setDisplayName("Sheep");
        ArrayList<String> sheepLore = new ArrayList<>();
        sheepLore.add("microblock");
        sheepm.setLore(sheepLore);
        sheep.setItemMeta(sheepm);
        this.i.setItem(12, sheep);

        ItemStack slime = new ItemStack(Material.SKULL_ITEM, 1);
        slime.setDurability((short) 3);
        SkullMeta slimem = (SkullMeta)blaze.getItemMeta();
        slimem.setOwner(MBType.BLOCK_MAP.get("slime").getPlayerName());
        slimem.setDisplayName("Slime");
        ArrayList<String> slimeLore = new ArrayList<>();
        slimeLore.add("microblock");
        slimem.setLore(slimeLore);
        slime.setItemMeta(slimem);
        this.i.setItem(13, slime);

        ItemStack spider = new ItemStack(Material.SKULL_ITEM, 1);
        spider.setDurability((short) 3);
        SkullMeta spiderm = (SkullMeta)blaze.getItemMeta();
        spiderm.setOwner(MBType.BLOCK_MAP.get("spider").getPlayerName());
        spiderm.setDisplayName("Spider");
        ArrayList<String> spiderLore = new ArrayList<>();
        spiderLore.add("microblock");
        spiderm.setLore(spiderLore);
        spider.setItemMeta(spiderm);
        this.i.setItem(14, spider);

        ItemStack squid = new ItemStack(Material.SKULL_ITEM, 1);
        squid.setDurability((short) 3);
        SkullMeta squidm = (SkullMeta)blaze.getItemMeta();
        squidm.setOwner(MBType.BLOCK_MAP.get("squid").getPlayerName());
        squidm.setDisplayName("Squid");
        ArrayList<String> squidLore = new ArrayList<>();
        squidLore.add("microblock");
        squidm.setLore(squidLore);
        squid.setItemMeta(squidm);
        this.i.setItem(15, squid);

        ItemStack villager = new ItemStack(Material.SKULL_ITEM, 1);
        villager.setDurability((short) 3);
        SkullMeta villagerm = (SkullMeta)blaze.getItemMeta();
        villagerm.setOwner(MBType.BLOCK_MAP.get("villager").getPlayerName());
        villagerm.setDisplayName("Villager");
        ArrayList<String> villagerLore = new ArrayList<>();
        villagerLore.add("microblock");
        villagerm.setLore(villagerLore);
        villager.setItemMeta(villagerm);
        this.i.setItem(16, villager);

        ItemStack ghast = new ItemStack(Material.SKULL_ITEM, 1);
        ghast.setDurability((short) 3);
        SkullMeta ghastm = (SkullMeta)blaze.getItemMeta();
        ghastm.setOwner(MBType.BLOCK_MAP.get("ghast").getPlayerName());
        ghastm.setDisplayName("Ghast");
        ArrayList<String> ghastLore = new ArrayList<>();
        ghastLore.add("microblock");
        ghastm.setLore(ghastLore);
        ghast.setItemMeta(ghastm);
        this.i.setItem(17, ghast);

        ItemStack fox = new ItemStack(Material.SKULL_ITEM, 1);
        fox.setDurability((short) 3);
        SkullMeta foxm = (SkullMeta)blaze.getItemMeta();
        foxm.setOwner(MBType.BLOCK_MAP.get("fox").getPlayerName());
        foxm.setDisplayName("Fox");
        ArrayList<String> foxLore = new ArrayList<>();
        foxLore.add("microblock");
        foxm.setLore(foxLore);
        fox.setItemMeta(foxm);
        this.i.setItem(18, fox);

        ItemStack gunlek = new ItemStack(Material.SKULL_ITEM, 1);
        gunlek.setDurability((short) 3);
        SkullMeta gunlekm = (SkullMeta)blaze.getItemMeta();
        gunlekm.setOwner("Gunlek");
        gunlekm.setDisplayName("Gunlek");
        ArrayList<String> gunlekLore = new ArrayList<>();
        gunlekLore.add("microblock");
        gunlekm.setLore(gunlekLore);
        gunlek.setItemMeta(gunlekm);
        this.i.setItem(19, gunlek);

        ItemStack thegengiskhan = new ItemStack(Material.SKULL_ITEM, 1);
        thegengiskhan.setDurability((short) 3);
        SkullMeta thegengiskhanm = (SkullMeta)blaze.getItemMeta();
        thegengiskhanm.setOwner("Thegengiskhan");
        thegengiskhanm.setDisplayName("Thegengiskhan");
        ArrayList<String> thegengiskhanLore = new ArrayList<>();
        thegengiskhanLore.add("microblock");
        thegengiskhanm.setLore(thegengiskhanLore);
        thegengiskhan.setItemMeta(thegengiskhanm);
        this.i.setItem(20, thegengiskhan);

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
