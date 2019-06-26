package jp.co.stah.githubreposearch.infra.repository

import com.stah.api.GithubRepositoryJson
import jp.co.stah.githubreposearch.domain.GithubRepository
import jp.co.stah.githubreposearch.domain.GithubRepositoryId


object GithubRepositoryConverter {

    fun convertToModel(repoisitoryList: List<GithubRepositoryJson>) : List<GithubRepository> =
            repoisitoryList.map{ convertToModel(it)}

    fun convertToModel(repository: GithubRepositoryJson): GithubRepository =
            GithubRepository(id = GithubRepositoryId(repository.name), name = repository.name, image = repository.image, star =  false)
}



/*
object TodoConverter {

    fun convertToModel(todoList: List<TodoJson>): List<Todo> =
            todoList.map { convertToModel(it) }

    fun convertToModel(todoJson: TodoJson): Todo =
            Todo(
                    id = TodoId(todoJson.id),
                    name = todoJson.name,
                    description = todoJson.description,
                    done = todoJson.done
            )

    fun convertToJson(todo: Todo): TodoJson =
            TodoJson(
                    id = todo.id.value,
                    name = todo.name,
                    description = todo.description,
                    done = todo.hasDone()
            )

 */