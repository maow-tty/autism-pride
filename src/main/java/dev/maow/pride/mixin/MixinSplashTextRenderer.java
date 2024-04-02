package dev.maow.pride.mixin;

import dev.maow.pride.AutismPride;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.SplashTextRenderer;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SplashTextRenderer.class)
public abstract class MixinSplashTextRenderer {
	@Redirect(
		method = "render",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/client/gui/GuiGraphics;drawCenteredShadowedText(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)V"
		)
	)
	private void provideText(GuiGraphics graphics, TextRenderer renderer, String s, int centerX, int y, int color) {
		final var text = Text
			.translatable("splash.autism_pride")
			.append(" ")
			.append(AutismPride.symbol());
		graphics.drawCenteredShadowedText(renderer, text, centerX, y, 0xFFFFFFFF);
	}
}
