package com.example.bipbusiness.model.main.restclient.model

import com.google.gson.annotations.SerializedName

data class Response(
        @SerializedName("data") var data: RowParent,
        @SerializedName("status") var status: Boolean,
        @SerializedName("message") var message: String
)

data class RowParent(
        @SerializedName("list") var listUsers: List<RowChild>
)

data class RowChild(
        @SerializedName("slug") val slug: String,
        @SerializedName("text") val text: String,
        @SerializedName("icon") val icon: String
)
