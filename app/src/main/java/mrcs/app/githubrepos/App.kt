package mrcs.app.githubrepos

import android.app.Application
import mrcs.app.githubrepos.data.di.DataModule
import mrcs.app.githubrepos.domain.di.DomainModule
import mrcs.app.githubrepos.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}