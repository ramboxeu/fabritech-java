package eu.rambox.fabritech.block;

import eu.rambox.fabritech.FabriTech;
import eu.rambox.fabritech.item.FabriTechItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Array;

public class FabriTechBlocks {
    public static final Block COPPER_ORE = new CopperOreBlock();

    public static void register (){
        register(COPPER_ORE, "copper_ore");
    }

    private static void register (Block block, String name)
    {
        Registry.register(Registry.BLOCK, FabriTech.locate(name), block);
        Registry.register(Registry.ITEM, FabriTech.locate(name), new BlockItem(block, new Item.Settings().itemGroup(FabriTechItemGroups.FABRITECH_ALL)));
    }
    private static void register (Block block, String name, ItemGroup itemGroup)
    {
        Registry.register(Registry.BLOCK, FabriTech.locate(name), block);
        Registry.register(Registry.ITEM, FabriTech.locate(name), new BlockItem(block, new Item.Settings().itemGroup(itemGroup)));
    }
}
