package com.company.untitled112

import com.haulmont.cuba.testsupport.TestContainer
import org.junit.jupiter.api.extension.ExtensionContext

open class Untitled112TestContainer : TestContainer() {

    init {
        appComponents = mutableListOf(
                // list add-ons here:
                // "com.haulmont.reports",
                // "com.haulmont.addon.bproc",
                "com.haulmont.cuba"
        )
        appPropertiesFiles = mutableListOf(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the core module
                "com/company/untitled112/app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/company/untitled112/test-app.properties")

        this.autoConfigureDataSource()
    }

    class Common private constructor() : Untitled112TestContainer() {

        @Throws(Throwable::class)
        override fun beforeAll(extensionContext: ExtensionContext) {
            if (!initialized) {
                super.beforeAll(extensionContext)
                initialized = true
            }
            setupContext()
        }

        override fun afterAll(extensionContext: ExtensionContext) {
            cleanupContext()
            // never stops - do not call super
        }

        companion object {

            val INSTANCE = Common()

            @Volatile
            private var initialized: Boolean = false
        }
    }
}