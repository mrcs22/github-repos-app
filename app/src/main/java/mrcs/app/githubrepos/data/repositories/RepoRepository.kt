package mrcs.app.githubrepos.data.repositories

import kotlinx.coroutines.flow.Flow
import mrcs.app.githubrepos.data.model.Repo


interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}