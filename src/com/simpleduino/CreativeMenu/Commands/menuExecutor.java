package com.simpleduino.CreativeMenu.Commands;

import com.simpleduino.CreativeMenu.Menu.MainMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Simple-Duino on 07/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class menuExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player)
        {
            Player p = (Player)sender;
            ItemStack c = new ItemStack(Material.COMPASS, 1);
            ItemMeta cim = c.getItemMeta();
            cim.setDisplayName(ChatColor.GREEN + "Menu");
            c.setItemMeta(cim);
            p.getInventory().setItem(0, c);
            p.openInventory(new MainMenu(p).getInventory());
        }
        else
        {
            sender.sendMessage(ChatColor.RED + "Seuls les joueurs peuvent executer /menu");
        }
        return false;
    }
}
