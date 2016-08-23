package com.simpleduino.CreativeMenu.Menu;

import com.simpleduino.CreativeMenu.Microblocks.MBType;
import com.simpleduino.CreativeStats.API.CreaStats;
import net.minecraft.server.v1_8_R3.Block;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.minecraft.server.v1_8_R3.TileEntity;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Skull;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class MainMenu {

    Inventory i = Bukkit.createInventory(null, 54, ChatColor.YELLOW + "Créatif");
    public MainMenu(Player p)
    {
        ItemStack links = new ItemStack(Material.BOOKSHELF, 1);
        ItemMeta linksIM = links.getItemMeta();
        linksIM.setDisplayName(ChatColor.BOLD.toString() + ChatColor.YELLOW.toString() + "Liens (Forum/Teamspeak)");
        links.setItemMeta(linksIM);
        this.i.setItem(0, links);

        ItemStack MBMenu = new ItemStack(Material.SKULL_ITEM, 1);
        MBMenu.setDurability((short) 3);
        SkullMeta MBMenum = (SkullMeta)MBMenu.getItemMeta();
        MBMenum.setOwner(MBType.BLOCK_MAP.get("chest").getPlayerName());
        MBMenum.setDisplayName(ChatColor.BLUE + "Microblocks");
        MBMenu.setItemMeta(MBMenum);
        this.i.setItem(21-9, MBMenu);

        ItemStack GMenu = new ItemStack(Material.DIAMOND, 1);
        ItemMeta GMenum = GMenu.getItemMeta();
        GMenum.setDisplayName(ChatColor.BLUE + "Liste des grades");
        GMenu.setItemMeta(GMenum);
        this.i.setItem(8, GMenu);

        ItemStack CMenu = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
        ItemMeta CMenum = CMenu.getItemMeta();
        CMenum.setDisplayName(ChatColor.BLUE + "Commandes utiles");
        CMenu.setItemMeta(CMenum);
        this.i.setItem(23-9, CMenu);

        ItemStack tpLobby = new ItemStack(Material.SKULL_ITEM, 1);
        tpLobby.setDurability((short) 3);
        SkullMeta tpLobbym = (SkullMeta)tpLobby.getItemMeta();
        tpLobbym.setOwner(MBType.BLOCK_MAP.get("arrowright").getPlayerName());
        tpLobbym.setDisplayName(ChatColor.BLUE + "Retour au lobby");
        tpLobby.setItemMeta(tpLobbym);
        this.i.setItem(30+9, tpLobby);

        ItemStack tpSpawn = new ItemStack(Material.SLIME_BALL, 1);
        ItemMeta tpSpawnm = tpSpawn.getItemMeta();
        tpSpawnm.setDisplayName(ChatColor.BLUE + "Retour au spawn");
        tpSpawn.setItemMeta(tpSpawnm);
        this.i.setItem(32+9, tpSpawn);

        ItemStack head = new ItemStack(Material.SKULL_ITEM, 1);
        head.setDurability((short) 3);
        SkullMeta headm = (SkullMeta)head.getItemMeta();
        headm.setOwner(p.getName());
        headm.setDisplayName(ChatColor.BOLD.toString() + ChatColor.DARK_GREEN.toString() + "Statistiques de " + p.getName());
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Blocs cassés: "+new CreaStats(p).getBrokenBlocks());
        lore.add(ChatColor.WHITE + "Blocs posés: "+new CreaStats(p).getPlacedBlocks());
        if(new CreaStats(p).getTimePlayed() <= 60)
        {
            lore.add(ChatColor.WHITE + "Temps joué (sec): "+new CreaStats(p).getTimePlayed());
        }
        else if(new CreaStats(p).getTimePlayed()/60 <= 60)
        {
            lore.add(ChatColor.WHITE + "Temps joué (min): "+new CreaStats(p).getTimePlayed()/60);
        }
        else if((new CreaStats(p).getTimePlayed()/60)/60 <= 24)
        {
            lore.add(ChatColor.WHITE + "Temps joué (heures): "+(new CreaStats(p).getTimePlayed()/60)/60);
        }
        else if(((new CreaStats(p).getTimePlayed()/60)/60)/24 <= 365)
        {
            lore.add(ChatColor.WHITE + "Temps joué (jours): "+((new CreaStats(p).getTimePlayed()/60)/60)/24);
        }
        headm.setLore(lore);
        head.setItemMeta(headm);
        this.i.setItem(45, head);

        ItemStack close = new ItemStack(Material.BARRIER, 1);
        ItemMeta closeIM = close.getItemMeta();
        closeIM.setDisplayName(ChatColor.BOLD.toString() + ChatColor.DARK_RED.toString() + "Fermer le menu");
        close.setItemMeta(closeIM);
        this.i.setItem(53, close);

        ItemStack greenPane = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemStack greyPane = new ItemStack(Material.STAINED_GLASS_PANE);
        greenPane.setDurability((short) 5);
        greyPane.setDurability((short) 0);
        for(int pos = 0; pos<this.i.getSize();pos++)
        {
            if(this.i.getItem(pos) == null)
            {
                if((pos%2)==0)
                {
                    this.i.setItem(pos, greenPane);
                }
                else
                {
                    this.i.setItem(pos, greyPane);
                }
            }
        }
    }

    public Inventory getInventory()
    {
        return this.i;
    }

}
