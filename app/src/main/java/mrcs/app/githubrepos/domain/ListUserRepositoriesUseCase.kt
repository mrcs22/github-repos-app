package mrcs.app.githubrepos.domain

import kotlinx.coroutines.flow.Flow
import mrcs.app.githubrepos.core.UseCase
import mrcs.app.githubrepos.data.model.Repo
import mrcs.app.githubrepos.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ): UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}