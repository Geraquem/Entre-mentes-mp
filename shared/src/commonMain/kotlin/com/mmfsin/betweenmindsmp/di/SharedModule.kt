package com.mmfsin.betweenmindsmp.di

import com.mmfsin.betweenmindsmp.data.bbdd.CreateDatabase
import com.mmfsin.betweenmindsmp.data.bbdd.RoomConfiguration
import org.koin.dsl.module

val sharedModule = module {
    single<RoomConfiguration> { CreateDatabase(get()).getDatabase() }

    //Repositories

    //Use cases

    //ViewModels
}