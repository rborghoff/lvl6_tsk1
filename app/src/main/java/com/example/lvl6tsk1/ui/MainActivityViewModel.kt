package com.example.lvl6tsk1.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lvl6tsk1.database.ColorRepository
import com.example.lvl6tsk1.model.ColorItem

class MainActivityViewModel : ViewModel() {
    private val colorRepository = ColorRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}