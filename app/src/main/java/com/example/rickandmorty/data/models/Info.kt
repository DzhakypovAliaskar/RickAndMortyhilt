package com.example.rickandmorty.data.models

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class Info {

    @SerializedName("count")
    @Expose
    private var count: Int? = null

    @SerializedName("pages")
    @Expose
    private var pages: Int? = null

    @SerializedName("next")
    @Expose
    private var next: String? = null

    @SerializedName("prev")
    @Expose
    private var prev: Any? = null

    fun getCount(): Int? {
        return count
    }

    fun setCount(count: Int?) {
        this.count = count
    }

    fun getPages(): Int? {
        return pages
    }

    fun setPages(pages: Int?) {
        this.pages = pages
    }

    fun getNext(): String? {
        return next
    }

    fun setNext(next: String?) {
        this.next = next
    }

    fun getPrev(): Any? {
        return prev
    }

    fun setPrev(prev: Any?) {
        this.prev = prev
    }

}