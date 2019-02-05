package eu.rambox.fabritech.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.client.MinecraftClient;

@Mixin(MinecraftClient.class)
public class FabriTechMixin {
  @Inject(at = @At("HEAD"), method = "init()V")
  private void init(CallbackInfo info) {
    System.out.print("Initializing FabriTech mixin.");
  }
}