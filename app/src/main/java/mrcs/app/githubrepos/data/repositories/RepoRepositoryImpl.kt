package mrcs.app.githubrepos.data.repositories

import kotlinx.coroutines.flow.flow
import mrcs.app.githubrepos.core.RemoteException
import mrcs.app.githubrepos.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {

        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        }catch (ex: HttpException){
            throw RemoteException(ex.message ?: "Request Failed")
        }

    }
}