package com.example.bipbusiness.model.main.restclient


import okhttp3.OkHttpClient
import okhttp3.Request
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

fun retrofitModule(baseUrl: String) = module {

    single {
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor { chain ->
            val request: Request = chain.request().newBuilder().
                    addHeader("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjAzZWMwZDYzYTZmMDRmMGU0ZTYwMGIzMmJjYWYxNzc4NjBiMTk4OWYzMTY3NWJiMGE5MDI5MDUxNGQ5ZDgyNmQ4OTkyNjRiMDNkZDdmN2QyIn0.eyJhdWQiOiIxMSIsImp0aSI6IjAzZWMwZDYzYTZmMDRmMGU0ZTYwMGIzMmJjYWYxNzc4NjBiMTk4OWYzMTY3NWJiMGE5MDI5MDUxNGQ5ZDgyNmQ4OTkyNjRiMDNkZDdmN2QyIiwiaWF0IjoxNTc1Mjk2NzY5LCJuYmYiOjE1NzUyOTY3NjksImV4cCI6MTYwNjkxOTE2OSwic3ViIjoiMTY2Iiwic2NvcGVzIjpbXX0.GhUqvs760kwGijG86TsoMpMXxaApjii_6TwauQGt9zyHLpIeTgi8eSe15p4sJEmDi54AT_v2qgmfrWPFRDuAr_gKf8EM5xrOftmIHb3QufuaBxwsUe-2qWJueNiNAYKLMpbgYgsS-Ok0e-QwCVWYfdj-4mrexOBVuArkYUrWZG1OdG5KhjLQXx7hZvPN_WhCDrg4wVN0zgW5Rtx899eSxj_-u84UB4fPiiGlibMVebRSE1xKPcKpp_FmVk8srZ_nvllHm9L5Gm6Aymf33OtrwGZfgfGdxfFLzDRvWpRUnQSRVJeJjtZzm7HKSJHrbjj5W5ZbpKmYAYonLaQXg22nrvjVKqnf2mY6XH5H7NWqkjogJFQeJ52HGCcbTAOCz3B_94zNObFpVU7_WNBEzJOSeHYqeBPeIyNsqaGqJcRgTcK2-km0ADLDVeVqPGg4ZrYoC2w0w6mSRHgfRsxjcrjpahzSBFQaQYg8klzNO2cXmrPrSbV8ANp5o3ZFu-Ke7ykY5xOzZOjW1ytNo5h_USpOF8JOIOaLSdfzgtoPYmRpxtAtRimbT4ZJUbLwxLZywxa2MB_AUjwqMsSn8WSy0IQIRHRuJHqzPaO-98I3UEs7Ag81PHr8mmH2muVXQcal9uZ3ji1MFG0w0tcOP5mgyMA3XhRYNIi8NZ6DOPD_ry3ISdw")
                    .addHeader("UDID","d69a86034821c18e")
                    .build()
            chain.proceed(request)
        }
    }

    single {
        Retrofit.Builder()
    }

    single {
        get<Retrofit.Builder>()
                .client(get<OkHttpClient.Builder>().build())
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}