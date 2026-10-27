package com.luudev.localfood.ViewModel

import androidx.lifecycle.LiveData
import com.luudev.localfood.Domain.CategoryModel

class DashboardViewModel {
    private val repository = DashboardViewModel()
    fun loadCategory(): LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }
}