package me.kix.juno.example;

import me.kix.juno.module.AbstractModule;
import me.kix.juno.module.addon.Category;
import me.kix.juno.module.manifest.ModuleManifest;

import java.util.logging.Logger;

/**
 * @author Kix
 * @since 7/16/2018
 */
@ModuleManifest(label = "Example", category = Category.MISCELLANEOUS)
public class ExampleModule extends AbstractModule {
	public ExampleModule() {
		Logger.getGlobal().info("I'm an example module!");
	}
}
