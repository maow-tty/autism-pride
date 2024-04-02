package dev.maow.pride;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public final class AutismPride implements ModInitializer {
	public static final String MODID = "autism_pride";
	public static final String SYMBOL = "A";
	public static final Identifier SYMBOL_FONT = new Identifier(MODID, "symbol");

	@Override
	public void onInitialize(ModContainer mod) {}

	public static MutableText symbol() {
		return Text.literal(SYMBOL).styled(style -> style.withFont(SYMBOL_FONT));
	}
}
