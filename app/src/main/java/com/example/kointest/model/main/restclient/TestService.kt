package com.example.kointest.model.main.restclient

import com.example.kointest.model.main.restclient.model.Response
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface TestService {

    @GET("api/users")
    fun getUsers(@Query("page") page: Int): Single<Response>
}