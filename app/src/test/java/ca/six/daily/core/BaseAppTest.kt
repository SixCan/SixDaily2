package ca.six.daily.core

import android.os.Build
import ca.six.daily.BuildConfig
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP), application = BaseApp::class)
class BaseAppTest {

    @Test
    fun testContextNotNull() {
        assertNotNull(BaseApp.app)
    }


}
