package org._10ne.spock.extensions

import org._10ne.spock.extensions.feature.BeforeFeatureSetupExtensionAnnotation
import spock.lang.Shared
import spock.lang.Specification

/**
 * @author Noam Y. Tenne
 */
class BeforeFeatureSetupSpec extends Specification {

    @Shared
    int setupInvocationCounter

    def setupSpec() {
        setupInvocationCounter = 0
    }

    def cleanupSpec() {
        assert setupInvocationCounter == 1
    }

    @BeforeFeatureSetupExtensionAnnotation('setupFeature')
    def 'Use before feature setup method'() {
        setup:
        println 'Perform some setup, doesn\'t really matter'

        expect:
        var instanceof String

        where:
        var << ['someVar', 'someVar2', 'someVar3']
    }

    void setupFeature() {
        println 'Invoking before feature setup method'
        setupInvocationCounter++
    }
}
