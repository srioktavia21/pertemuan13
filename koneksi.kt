package com.informatika19100060.databarang.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class koneksi {
    companion object{
        val BaseUrl = "https://jsonlaceholder.typicode.com/"
        val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: ApiService= retrofit.create(ApiService::class.java)
    }
}