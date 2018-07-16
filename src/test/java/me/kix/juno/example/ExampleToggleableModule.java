package me.kix.juno.example;

import me.kix.juno.module.addon.Category;
import me.kix.juno.module.manifest.ModuleManifest;
import me.kix.juno.module.toggleable.ToggleableModule;

import java.util.logging.Logger;

/**
 * @author Kix
 * @since 7/16/2018
 */
@ModuleManifest(label = "ExampleToggleable", category = Category.MISCELLANEOUS)
public class ExampleToggleableModule extends ToggleableModule {

	@Override
	public void onEnable() {
		super.onEnable();
		Logger.getGlobal().info("I'm an example on the enable.");
	}

	@Override
	public void onDisable() {
		super.onDisable();
		Logger.getGlobal().info("And on the disable!");
	}
}
