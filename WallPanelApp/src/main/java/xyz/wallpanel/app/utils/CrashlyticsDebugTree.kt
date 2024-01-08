package xyz.wallpanel.app.utils

import android.util.Log
import timber.log.Timber
import java.lang.Exception
import java.util.*

class CrashlyticsDebugTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, throwable: Throwable?) {
        if (priority != Log.ERROR) {
            return
        }
    }

    companion object {
        private const val CRASHLYTICS_KEY_PRIORITY = "priority"
        private const val CRASHLYTICS_KEY_TAG = "tag"
        private const val CRASHLYTICS_KEY_MESSAGE = "message"

        private fun trimmedException(e: Exception): Throwable {
            val elements = e.stackTrace
            var trim = 0
            for (i in elements.indices) {
                val element = elements[i]
                val className = element.className
                if (!className.contains("Timber") && !className.contains("CrashlyticsReportingTree")) {
                    trim = i
                    break
                }
            }
            e.stackTrace = Arrays.copyOfRange(elements, trim, elements.size)
            return e
        }
    }
}