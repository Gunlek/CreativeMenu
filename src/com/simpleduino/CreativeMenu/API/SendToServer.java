package com.simpleduino.CreativeMenu.API;

import com.simpleduino.CreativeMenu.CreativeMenu;
import org.bukkit.entity.Player;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class SendToServer {

    public SendToServer(String server, Player p)
    {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(b);
        try{
            out.writeUTF("Connect");
            out.writeUTF(server);

        }catch(IOException e){

        }
        p.sendPluginMessage(CreativeMenu.getPlugin(CreativeMenu.class), "BungeeCord", b.toByteArray());
    }
}
