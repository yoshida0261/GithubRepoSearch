package jp.co.stah.githubreposearch.domain

class GithubRepository(
    val id: GithubRepositoryId,
    val name: String,
    val image: String,
    private var star: Boolean
) {


    fun addStar() {
        star = true
    }

    fun deleteStar() {
        star = false
    }
}