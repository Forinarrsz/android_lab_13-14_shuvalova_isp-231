package com.shuvalova.android_lab_13_14_shuvalova.ui_model

import androidx.lifecycle.ViewModel
import com.shuvalova.android_lab_13_14_shuvalova.data.GameUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(GameUiState())
    val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

    init {
        resetGame()
    }
    fun resetGame() {

    }
}