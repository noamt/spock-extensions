spock-extensions
================

A set of extensions for the Spock testing framework.

### Current extensions: ###

###### BeforeFeatureSetupExtensionAnnotation ######

The annotation is applied to specification methods and receives a method name as a value.
The method whos name is specified will be invoked once before the specification method is executed, regardless of any iteration.
