package me.kix.juno.module.manage;

import me.kix.juno.module.Module;

import java.util.Map;
import java.util.Optional;

/**
 * @author Kix
 * @since 7/9/2018
 */
public interface ModuleManager {

	Map<String, Module> getModules();

	void register(Module module);

	void unregister(Module module);

	Optional<Module> getModule(String module);

}
