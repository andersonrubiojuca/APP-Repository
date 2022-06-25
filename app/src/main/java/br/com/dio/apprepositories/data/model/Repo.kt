package br.com.dio.apprepositories.data.model

import com.google.gson.annotations.SerializedName

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val language: String = "Nenhuma",
    @SerializedName("html_url")
    val htmlURL: String,
    val description: String
)
