package com.example.nav3recipes.modular

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation3.runtime.EntryProviderBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject


typealias EntryProviderInstaller = EntryProviderBuilder<Any>.() -> Unit

@ActivityRetainedScoped
class BackStackFactory @Inject constructor() {
    fun create(startDestination: Any) : SnapshotStateList<Any> = mutableStateListOf(startDestination)
}
