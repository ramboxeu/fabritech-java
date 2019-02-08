package eu.rambox.fabritech.util.worldgen;

import eu.rambox.fabritech.block.FabriTechBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class FabriTechAdditionalBiomeFeatures {
    public static void addBiomeFeatures () {
        Biome.BIOMES.forEach((Biome biome) -> {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Biome.configureFeature(
                            Feature.ORE,
                            new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, FabriTechBlocks.COPPER_ORE.getDefaultState(), 9),
                            Decorator.COUNT_RANGE,
                            new RangeDecoratorConfig(20, 0, 0, 64)
                    )
            );
        });
    }
}
