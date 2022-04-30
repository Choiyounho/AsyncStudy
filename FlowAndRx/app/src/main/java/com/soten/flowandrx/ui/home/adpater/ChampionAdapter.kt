package com.soten.flowandrx.ui.home.adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.soten.flowandrx.data.db.entity.LolChampionInfo
import com.soten.flowandrx.databinding.ItemChampionBinding

class ChampionAdapter : ListAdapter<LolChampionInfo, ChampionInfoViewHolder>(diffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ChampionInfoViewHolder(
            ItemChampionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: ChampionInfoViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object  : DiffUtil.ItemCallback<LolChampionInfo>() {
            override fun areItemsTheSame(
                oldItem: LolChampionInfo,
                newItem: LolChampionInfo
            ) = oldItem.name == newItem.name

            override fun areContentsTheSame(
                oldItem: LolChampionInfo,
                newItem: LolChampionInfo
            ) = oldItem == newItem
        }
    }

}

