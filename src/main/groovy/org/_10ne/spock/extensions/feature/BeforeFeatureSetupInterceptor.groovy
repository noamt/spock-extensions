package org._10ne.spock.extensions.feature

import org.spockframework.runtime.extension.AbstractMethodInterceptor
import org.spockframework.runtime.extension.IMethodInvocation

/**
 * @author Noam Y. Tenne
 */
class BeforeFeatureSetupInterceptor extends AbstractMethodInterceptor {

    String methodToInvoke

    @Override
    void interceptFeatureExecution(IMethodInvocation invocation) throws Throwable {
        def currentlyRunningSpec = invocation.sharedInstance
        currentlyRunningSpec."$methodToInvoke"()
        invocation.proceed()
    }
}
