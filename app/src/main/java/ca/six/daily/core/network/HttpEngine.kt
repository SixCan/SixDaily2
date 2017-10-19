package ca.six.daily.core.network

import okhttp3.OkHttpClient
import okhttp3.Request

object HttpEngine {
    val PREFIX = " https://news-at.zhihu.com/api/4/"
    val ERROR = "Error"
    val http: OkHttpClient by lazy {
        OkHttpClient.Builder()
                .addInterceptor(MockResponseInterceptor())
                .build()
    }

    // for test
    var isMock = false
    var mockJson = ""

    fun requestString(http: OkHttpClient, end: String): String {
        try {
            val req = Request.Builder()
                    .url(PREFIX + end)
                    .build()
            val resp = http.newCall(req).execute()
            return resp.body()?.string() ?: "" // 三目运算符
        } catch (exception: Exception) {
            return ERROR
        }
    }


}

