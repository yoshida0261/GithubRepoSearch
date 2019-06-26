package jp.co.stah.githubreposearch.infra.repository

import com.stah.api.ApiClient
import com.stah.api.ApiClient.Companion.apiClient
import io.reactivex.Maybe
import io.reactivex.Single
import jp.co.stah.githubreposearch.domain.GithubRepositoryId
import jp.co.stah.githubreposearch.domain.repository.GithubRepository

class GithubRepositoryImpl : GithubRepository{
    override fun findById(repositoryId: GithubRepositoryId): Maybe<GithubRepository> {
        return apiClient.getRepositoty("").toMaybe().map{

        }
    }

    /*
            todoApiClient.getTodo(todoId.value).toMaybe().map {
            TodoConverter.convertToModel(it)
        }.doOnSuccess {
            idCache.put(it.id, it)
        }

     */
    override fun findAllByPage(page: Int): Single<GithubRepository> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun store(repo: GithubRepository): Single<GithubRepository> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}