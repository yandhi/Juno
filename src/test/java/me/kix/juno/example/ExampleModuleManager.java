package me.kix.juno.example;

import me.kix.juno.module.manage.impl.BasicModuleManager;

import java.util.logging.Logger;

/**
 * An extremely basic example of what your module manager would look like using Juno.
 *
 * @author Kix
 * @since 7/16/2018
 */
public class ExampleModuleManager extends BasicModuleManager {

	public void init() {
		Logger.getGlobal().info("I'm gonna start loading example modules.");
		register(new ExampleModule());
		register(new ExampleToggleableModule());
	}
}
