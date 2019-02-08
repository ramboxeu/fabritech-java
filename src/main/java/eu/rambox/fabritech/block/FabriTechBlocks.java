package eu.rambox.fabritech.block;

import eu.rambox.fabritech.FabriTech;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class FabriTechBlocks {
    public static final Block COPPER_ORE = new CopperOreBlock();

    public static void registerBlocks(){
        FabriTech.log("Registering blocks!");
        register(COPPER_ORE, "copper_ore");
    }

    private static void register (Block block, String name) {
        Registry.register(Registry.BLOCK, name, block);
    }
}
