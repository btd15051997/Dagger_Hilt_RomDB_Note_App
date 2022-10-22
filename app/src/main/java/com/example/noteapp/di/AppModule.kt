package com.example.noteapp.di

import android.app.Application
import com.example.noteapp.database.NoteDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    subcomponents = [AuthComponent::class]
)
class AppModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Application) = NoteDatabase.getInstance(application)

    @Singleton
    @Provides
    fun provideNoteDao(database: NoteDatabase) = database.getNoteDao()


}