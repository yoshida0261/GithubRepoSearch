package jp.co.stah.githubreposearch.domain.repository

import io.reactivex.Maybe
import io.reactivex.Single
import jp.co.stah.githubreposearch.domain.GithubRepositoryId


interface ReadGithubRepository {

    fun findById(repositoryId: GithubRepositoryId): Maybe<GithubRepository>
    fun findAllByPage(page: Int): Single<GithubRepository>
}