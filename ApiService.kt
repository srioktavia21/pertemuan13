package com.informatika19100060.databarang.network

import android.telecom.Call
import okhttp3.Response
import

interface ApiService {
    @GET(value: "users")
    fun getUser() : Call<List<Response>>
}