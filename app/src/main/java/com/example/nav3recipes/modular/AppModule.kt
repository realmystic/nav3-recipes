package com.example.nav3recipes.modular

import androidx.compose.runtime.snapshots.SnapshotStateList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Singleton

@Module
@InstallIn(ActivityRetainedComponent::class)
object AppModule {

    @Provides
    @ActivityRetainedScoped
    fun provideBackStack(backStackFactory: BackStackFactory) : SnapshotStateList<Any> =
        backStackFactory.create(startDestination = ConversationList)

}
