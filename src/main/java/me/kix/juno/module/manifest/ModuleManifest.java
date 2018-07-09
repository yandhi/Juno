package me.kix.juno.module.manifest;

import me.kix.juno.module.addon.Category;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Kix
 * @since 7/9/2018
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleManifest {

	String label();

	Category category() default Category.MISCELLANEOUS;

}
