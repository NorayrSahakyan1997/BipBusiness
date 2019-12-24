package com.example.bipbusiness.model.main.restclient

import com.example.bipbusiness.model.main.restclient.model.Response
import io.reactivex.Single
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Retrofit

class MainComponent: KoinComponent {
    private val retrofit: Retrofit by inject()
    fun getUsers(): Single<Response> = retrofit.create(TestService::class.java).getUsers(1)
    fun getDetials():Single<Response> =retrofit.create(TestService::class.java).getUsersDetail(1)
    fun getLanguages():Single<Response> =retrofit.create(TestService::class.java).getLanguageList()

}