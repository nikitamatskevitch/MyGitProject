package com.example.mygitproject.presentation

import androidx.recyclerview.widget.DiffUtil
import com.example.mygitproject.domain.ShopItem

class ShopItemDiffCallback: DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        //должны сравнить два объекта по полям, но поскольку это data-классы здесь в отличии от Java можно неявно вызывать метод equals
        return oldItem == newItem
    }

}