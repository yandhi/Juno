package me.kix.juno.module.toggleable;

/**
 * @author Kix
 * @since 7/9/2018
 */
public interface Toggleable {
	void toggle();
	boolean isEnabled();
	void setEnabled(boolean enabled);
	void onEnable();
	void onDisable();
}
