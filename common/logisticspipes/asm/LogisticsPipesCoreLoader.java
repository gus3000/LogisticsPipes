package logisticspipes.asm;

import java.util.Map;

import net.minecraft.launchwrapper.Launch;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import lombok.Getter;

//@IFMLLoadingPlugin.SortingIndex(1001) TODO: For next MC update. Changing this now, will change ASM check sums as well.
public class LogisticsPipesCoreLoader implements IFMLLoadingPlugin {

	@Getter
	private static boolean coremodLoaded = false;

	public LogisticsPipesCoreLoader() throws Exception {
		Launch.classLoader.addTransformerExclusion("logisticspipes.asm.");
		coremodLoaded = true;
	}

	@Override
	public String[] getASMTransformerClass() {
		return new String[] { "logisticspipes.asm.LogisticsClassTransformer" };
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {

	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}
}
