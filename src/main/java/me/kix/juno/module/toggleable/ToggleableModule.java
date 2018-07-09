package me.kix.juno.module.toggleable;

import me.kix.juno.module.AbstractModule;
import me.kix.juno.module.addon.Category;

/**
 * @author Kix
 * @since 7/9/2018
 */
public class ToggleableModule extends AbstractModule implements Toggleable {

	private boolean enabled;

	public ToggleableModule(String label, Category category) {
		super(label, category);
	}

	public ToggleableModule() {
	}

	@Override
	public void toggle() {
		setEnabled(!isEnabled());
		if (enabled) {
			onEnable();
		} else {
			onDisable();
		}
	}

	@Override
	public void onEnable() {

	}

	@Override
	public void onDisable() {

	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
