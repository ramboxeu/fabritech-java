package eu.rambox.fabritech;

import eu.rambox.fabritech.block.FabriTechBlocks;
import eu.rambox.fabritech.util.worldgen.FabriTechAdditionalBiomeFeatures;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabriTech implements ModInitializer {

    private static final Logger LOGGER = LogManager.getFormatterLogger("FabriTech");

    @Override
    public void onInitialize() {
        FabriTech.log("Initializing FabriTech mod.");

        // Registration
        FabriTech.log("Registering blocks.");

        FabriTechBlocks.register();

        // Add ores to generate
        FabriTechAdditionalBiomeFeatures.addBiomeFeatures();
    }

    public static void log(Object message) {
        LOGGER.log(Level.DEBUG, message.toString());
    }

    public static Identifier locate (String location) {
        return new Identifier("fabritech", location);
    }
}