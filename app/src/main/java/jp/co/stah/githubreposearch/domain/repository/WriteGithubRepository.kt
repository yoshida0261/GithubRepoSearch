package jp.co.stah.githubreposearch.domain.repository

import io.reactivex.Single


interface WriteGithubRepository {
    fun store(repo : GithubRepository) : Single<GithubRepository>
}