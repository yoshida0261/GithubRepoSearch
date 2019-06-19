package com.stah.api

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    @GET("orgs/{org}/repos")
    fun getRepositoty(@Path("org") org: String): List<GithubRepositoryJson>
}