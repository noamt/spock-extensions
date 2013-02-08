package org._10ne.spock.extensions.feature

import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension
import org.spockframework.runtime.model.FeatureInfo

/**
 * @author Noam Y. Tenne
 */
class BeforeFeatureSetupExtension extends AbstractAnnotationDrivenExtension<BeforeFeatureSetupExtensionAnnotation> {

    @Override
    void visitFeatureAnnotation(BeforeFeatureSetupExtensionAnnotation annotation, FeatureInfo feature) {
        def methodToInvoke = annotation.value()
        def interceptor = new BeforeFeatureSetupInterceptor(methodToInvoke: methodToInvoke)
        feature.addInterceptor(interceptor)
    }
}
