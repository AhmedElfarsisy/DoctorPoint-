package com.elfarsisy.doctorpoint.base.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.*
import androidx.viewbinding.ViewBinding

class DPBaseAdapter
abstract class AFBaseAdapter<VH : ViewHolder, T, layout : ViewBinding> :
    ListAdapter<T, VH>(BaseDiffUtil()) {
    private var items: ArrayList<T>? = null
    fun add(item: T) {
        items?.add(item)
    }

    fun addAll(items: ArrayList<T>) {
        this.items = items
    }

    fun updateItem(index: Int, item: T) {
        items?.set(index, item)
    }

    fun removeAt(index: Int) {
        items?.removeAt(index)
    }

    fun remove(item: T) {
        items?.remove(item)
    }

    fun clear() {
        items?.clear()
    }

    class BaseDiffUtil<T> : DiffUtil.ItemCallback<T>() {
        override fun areItemsTheSame(oldItem: T, newItem: T) = oldItem == newItem

        override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }

}