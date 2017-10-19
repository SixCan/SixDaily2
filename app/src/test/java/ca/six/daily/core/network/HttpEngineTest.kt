package ca.six.daily.core.network

import org.junit.Assert.*
import org.junit.Test

class HttpEngineTest {

    @Test
    fun testRequest_getFakeResponse(){
        HttpEngine.isMock = true
        HttpEngine.mockJson = "{}"
        val resp = HttpEngine.requestString(HttpEngine.http,"test1")
        assertEquals("{}", resp)
    }


    @Test
    fun testRequest_getFakeResponse_andResponseCodeIsError(){

    }

    @Test
    fun testRequest_getFakeResponse_inObservable(){

    }

}
