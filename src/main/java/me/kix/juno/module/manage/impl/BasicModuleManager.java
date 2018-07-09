package me.kix.juno.module.manage.impl;

import me.kix.juno.module.Module;
import me.kix.juno.module.manage.ModuleManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kix
 * @since 7/9/2018
 */
public class BasicModuleManager implements ModuleManager {

	private final Map<String, Module> modules = new HashMap<>();

	@Override
	public void register(Module module) {

	}

	@Override
	public void unregister(Module module) {

	}

	@Override
	public Map<String, Module> getModules() {
		return modules;
	}

}
