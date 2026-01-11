package org.dev.nofireoverlaymod.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.TitleScreen;
import org.dev.nofireoverlaymod.NoFireOverlayMod;
import org.dev.nofireoverlaymod.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinTitleScreen implements Util {
    @Inject(method = "render", at = @At("HEAD"))
    private void renderText(GuiGraphics guiGraphics, int i, int j, float f, CallbackInfo ci) {
        guiGraphics.drawString(mc.font, NoFireOverlayMod.NAME, 1, 1, -1);
    }
}
