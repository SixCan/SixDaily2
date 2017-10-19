package ca.six.daily.core

import org.junit.Assert.*
import org.junit.Test

class BaseAppTest {

    @Test
    fun testContextNotNull(){
        assertNotNull(BaseApp.app)
    }


}
