package me.kix.juno.module;

import me.kix.juno.module.addon.Category;
import me.kix.juno.module.manifest.ModuleManifest;

/**
 * An abstract implementation of {@link Module}
 *
 * @author Kix
 * @since 7/9/2018
 */
public class AbstractModule implements Module {

	private final String label;
	private final Category category;

	public AbstractModule(String label, Category category) {
		this.label = label;
		this.category = category;
	}

	public AbstractModule() {
		if (getClass().isAnnotationPresent(ModuleManifest.class)) {
			ModuleManifest manifest = getClass().getAnnotation(ModuleManifest.class);
			this.label = manifest.label();
			this.category = manifest.category();
		} else {
			this.label = "";
			this.category = Category.MISCELLANEOUS;
		}
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public Category getCategory() {
		return category;
	}
}
