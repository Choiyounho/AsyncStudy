package com.soten.flowandrx.ui.home.adpater

import androidx.recyclerview.widget.RecyclerView
import com.soten.flowandrx.data.db.entity.LolChampionInfo
import com.soten.flowandrx.databinding.ItemChampionBinding

class ChampionInfoViewHolder(
    private val binding: ItemChampionBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(championInfo: LolChampionInfo) {
        binding.nameTextView.text = championInfo.name
    }

}