# Notes

## What happens at compilation?

The Kotlin compiler (kotlinc) takes files with the `.kt` extension as input and generate `.class` bytecode files. At 
this point, the `.class` files are equivalent to Java `.class` files and the JVM can run them.

To run Kotlin applications, you need a `Kotlin runtime library`, in addition to the `JRE`. When distributing a Kotlin 
application, you have to distribute the `Kotlin runtime library` and the `JRE`. Otherwise, the application won't run.

## Kotlin Standard Library

Automatically imports "living essentials" at runtime. This is why it's required.
For more information: https://kotlinlang.org/api/latest/jvm/stdlib/

### Kotlin REPL

Tools > Kotlin > Kotlin REPL
