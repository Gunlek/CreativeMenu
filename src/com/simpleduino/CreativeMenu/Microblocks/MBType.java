package com.simpleduino.CreativeMenu.Microblocks;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Simple-Duino on 06/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class MBType {
    private String blockName;
    private String playerName;
    public static final Map<String, MBType> BLOCK_MAP = new HashMap<String, MBType>();
    public static final Map<String, MBType> PLAYER_MAP = new HashMap<String, MBType>();

    private MBType(String blockName, String playerName) {
        this.blockName = blockName;
        this.playerName = playerName;
    }

    private static void add(String blockName, String playerName) {
        blockName = blockName.toLowerCase();
        MBType mb = new MBType(blockName, playerName);
        BLOCK_MAP.put(blockName, mb);
        PLAYER_MAP.put(playerName, mb);
    }

    public String getBlockName() {
        return this.blockName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public ItemStack getItem()
    {
        ItemStack b = new ItemStack(Material.SKULL, 3);
        SkullMeta bm = (SkullMeta)b.getItemMeta();
        bm.setOwner(BLOCK_MAP.get(this.blockName.toLowerCase()).getPlayerName());
        bm.setDisplayName(BLOCK_MAP.get(this.blockName.toLowerCase()).getBlockName().substring(0,0).toUpperCase() + BLOCK_MAP.get(this.blockName.toLowerCase()).getBlockName().substring(1));
        b.setItemMeta(bm);
        return b;
    }

    static {
        MBType.add("apple", "MHF_Apple");
        MBType.add("orange", "hi1232");
        MBType.add("lemon", "Aesixx");
        MBType.add("mushroom_stew", "Tumbolisu");
        MBType.add("beer", "Fire_Feather");
        MBType.add("milk_bucket", "Cxomtdoh");
        MBType.add("arrowdown", "MHF_ArrowDown");
        MBType.add("arrowleft", "MHF_ArrowLeft");
        MBType.add("arrowright", "MHF_ArrowRight");
        MBType.add("arrowup", "MHF_ArrowUp");
        MBType.add("enderchest", "_Brennian");
        MBType.add("monitor", "Alistor");
        MBType.add("blaze", "MHF_Blaze"); //
        MBType.add("bookshelf", "BowAimbot");
        MBType.add("ice", "icytouch");
        MBType.add("ironchest", "godman21");
        MBType.add("furnace", "NegativeZeroTV");
        MBType.add("qcube", "jarrettgabe");
        MBType.add("cactus", "MHF_Cactus");
        MBType.add("cake", "MHF_Cake");
        MBType.add("camera", "FHG_Cam");
        MBType.add("camera2", "gocodygo");
        MBType.add("cavespider", "MHF_CaveSpider"); //
        MBType.add("horse", "gavertoso"); //
        MBType.add("cherry", "TheEvilEnderman");
        MBType.add("chest", "MHF_Chest");
        MBType.add("chicken", "MHF_Chicken"); //
        MBType.add("clock", "nikx004");
        MBType.add("coconut", "KyleWDM");
        MBType.add("companioncube", "sk8erace1");
        MBType.add("cow", "MHF_Cow"); //
        MBType.add("derpysnow", "GLaDOS");
        MBType.add("diamondblock", "Fyspyguy");
        MBType.add("diamondore", "akaBruce");
        MBType.add("glowstone", "samstine11");
        MBType.add("beachball", "PurplePenguinLPs");
        MBType.add("dicewhite", "jmars213");
        MBType.add("dicered", "gumbo632");
        MBType.add("diceblack", "azbandit2000");
        MBType.add("dirt", "zachman228");
        MBType.add("dispenser", "scemm");
        MBType.add("emeraldore", "Tereneckla");
        MBType.add("enderdragon", "KingEndermen");
        MBType.add("enderman", "MHF_Enderman"); //
        MBType.add("exclamation", "MHF_Exclamation");
        MBType.add("golem", "MHF_Golem"); //
        MBType.add("grass", "MoulaTime");
        MBType.add("haybale", "Bendablob");
        MBType.add("headlight", "Toby_The_Coder");
        MBType.add("herobrine", "MHF_Herobrine"); //
        MBType.add("ironblock", "metalhedd");
        MBType.add("witch", "scrafbrothers4");
        MBType.add("jukebox", "C418");
        MBType.add("lampon", "AutoSoup");
        MBType.add("lavaslime", "MHF_LavaSlime"); //
        MBType.add("leaves", "rsfx");
        MBType.add("lemon", "Aesixx");
        MBType.add("lime", "greenskull27");
        MBType.add("machine", "aetherX");
        MBType.add("melon", "MHF_Melon");
        MBType.add("mossycobblestone", "Khrenan");
        MBType.add("muffin", "ChoclateMuffin");
        MBType.add("mushroomcow", "MHF_MushroomCow"); //
        MBType.add("netherrack", "Numba_one_Stunna");
        MBType.add("notexture", "ddrl46");
        MBType.add("oaklog2", "MightyMega");
        MBType.add("oaklog", "MHF_OakLog");
        MBType.add("obsidian", "loiwiol");
        MBType.add("ocelot", "MHF_Ocelot");
        MBType.add("orange", "hi1232");
        MBType.add("eyeofender", "Edna_I");
        MBType.add("pigzombie", "MHF_PigZombie"); //
        MBType.add("pig", "MHF_Pig"); //
        MBType.add("piston", "JL2579");
        MBType.add("podzol", "PhasePvP");
        MBType.add("popcorn", "ZachWarnerHD");
        MBType.add("present", "I_Xenon_I");
        MBType.add("pumpkinface", "Koebasti");
        MBType.add("pumpkin", "MHF_Pumpkin");
        MBType.add("quartzblock", "bubbadawg01");
        MBType.add("question", "MHF_Question");
        MBType.add("radio", "uioz");
        MBType.add("redsand", "OmniSulfur");
        MBType.add("redstoneore", "annayirb");
        MBType.add("rubixcube", "iTactical17");
        MBType.add("sand", "rugofluk");
        MBType.add("sheep", "MHF_Sheep"); //
        MBType.add("slime", "MHF_Slime"); //
        MBType.add("speaker", "b1418");
        MBType.add("spider", "MHF_Spider"); //
        MBType.add("sponge", "pomi44");
        MBType.add("squid", "MHF_Squid"); //
        MBType.add("stickypiston", "Panda4994");
        MBType.add("stone", "Robbydeezle");
        MBType.add("taco", "Crunchy_Taco34");
        MBType.add("tnt2", "MHF_TNT2");
        MBType.add("tnt", "MHF_TNT");
        MBType.add("toiletpaper", "Ethegj");
        MBType.add("tv", "Metroidling");
        MBType.add("villager", "MHF_Villager"); //
        MBType.add("ghast", "MHF_Ghast"); //
        MBType.add("oakplanks", "terryxu");
        MBType.add("gamecube", "ReflectedNicK");
        MBType.add("redstoneblock", "AlexDr0ps");
        MBType.add("tv2", "nonesuchplace");
        MBType.add("troll", "Trollface20"); //
        MBType.add("eye", "Taizun");
        MBType.add("parrot", "Luk3011");
        MBType.add("pokeball", "Chuzard");
        MBType.add("cookie", "QuadratCookie");
        MBType.add("orangewool", "titou36");
        MBType.add("stonebrick", "Cakers");
        MBType.add("swskeleton", "lesto123");
        MBType.add("goldblock", "StackedGold");
        MBType.add("fox", "hugge75"); //
        MBType.add("potato", "CraftPotato13");
        MBType.add("leaves2", "half_bit");
        MBType.add("cobblestone", "_Rience");
        MBType.add("water", "emack0714");
        MBType.add("noteblock", "PixelJuke");
        MBType.add("brick", "BrickInTheHead");
        MBType.add("penguin", "Patty14"); //
    }

}
