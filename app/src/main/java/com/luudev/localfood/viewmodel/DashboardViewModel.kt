package com.luudev.localfood.viewmodel

import androidx.lifecycle.LiveData
import com.luudev.localfood.domain.CategoryModel

class DashboardViewModel {
    private val repository = DashboardViewModel()
    fun loadCategory(): LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }
}