package com.example.prodrawer

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LiveViewModel : ViewModel() {
    private var _currentScreen : MutableState<Screen> = mutableStateOf(Screen.DrawerItems.Home)

    val currentScreen : MutableState<Screen>
        get() = _currentScreen

    fun setCurrentScreen(screen: Screen) {
        _currentScreen.value = screen
    }




}