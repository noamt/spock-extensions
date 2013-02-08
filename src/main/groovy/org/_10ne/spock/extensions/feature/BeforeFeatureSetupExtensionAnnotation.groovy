package org._10ne.spock.extensions.feature

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * @author Noam Y. Tenne
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@org.spockframework.runtime.extension.ExtensionAnnotation(BeforeFeatureSetupExtension)

public @interface BeforeFeatureSetupExtensionAnnotation {

    String value();
}