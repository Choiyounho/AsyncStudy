package com.soten.flowandrx.ui.home

import androidx.lifecycle.ViewModel
import com.soten.flowandrx.data.db.dao.LolDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val lolDao: LolDao
) : ViewModel() {

    val allChampions = lolDao.getAllLolChampions()

    fun searchChampions(query: String) = lolDao.search(query)

}