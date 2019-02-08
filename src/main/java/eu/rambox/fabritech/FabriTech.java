package eu.rambox.fabritech;

import eu.rambox.fabritech.block.FabriTechBlocks;
import eu.rambox.fabritech.util.worldgen.FabriTechAdditionalBiomeFeatures;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabriTech implements ModInitializer {

    private static final Logger LOGGER = LogManager.getFormatterLogger("FabriTech");

    @Override
    public void onInitialize() {
        this.log("Initializing FabriTech mod.");

        // Registration
        //FabriTechBlocks.registerBlocks();

        Registry.register(Registry.BLOCK, "copper_ore", FabriTechBlocks.COPPER_ORE);
        Registry.register(Registry.ITEM, Registry.BLOCK.getId(FabriTechBlocks.COPPER_ORE), new BlockItem(FabriTechBlocks.COPPER_ORE, new Item.Settings().itemGroup(ItemGroup.BUILDING_BLOCKS)));

        FabriTechAdditionalBiomeFeatures.addBiomeFeatures();
    }

    public static void log(Object message) {
        LOGGER.log(Level.DEBUG, message.toString());
    }
}