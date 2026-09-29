package com.mmfsin.betweenmindsmp.presentation.core.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Composable
fun NavigationMain() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Menu,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }
    ) {
        composable<Menu> {
//            MenuScreen(
//                goToGameTypeScreen = { navController.navigate(GameType) },
//                goToConnectionScreen = { gameTypeId -> navController.navigate(Connection(gameTypeId = gameTypeId)) },
//                goToPacksScreen = { navController.navigate(Packs()) }
//            )
        }
    }
}

/** SCREENS */
@Serializable
object Menu

@Serializable
object GameType

@Serializable
data class Connection(val gameTypeId: String)

@Serializable
data class RoomCode(val roomCode: String, val gameTypeId: String)

@Serializable
data class Packs(val tab: Int = 0)

@Serializable
data class PackDetail(val packId: String)