package com.example.idade

import android.graphics.Bitmap
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pessoa(val nome: String, val ano: String): Parcelable{
    fun idade(): Int{
        return 2021 - Integer.parseInt(this.ano)
    }
}