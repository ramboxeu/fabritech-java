package eu.rambox.fabritech.item;

import eu.rambox.fabritech.FabriTech;
import eu.rambox.fabritech.block.FabriTechBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FabriTechItemGroups {
    public static final ItemGroup FABRITECH_ALL = FabricItemGroupBuilder.build(FabriTech.locate("fabritech_all"), () -> new ItemStack(FabriTechBlocks.COPPER_ORE));
}
