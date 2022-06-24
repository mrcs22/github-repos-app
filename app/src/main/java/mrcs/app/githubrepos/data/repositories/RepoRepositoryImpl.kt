package mrcs.app.githubrepos.data.repositories

import kotlinx.coroutines.flow.flow
import mrcs.app.githubrepos.data.services.GitHubService

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}