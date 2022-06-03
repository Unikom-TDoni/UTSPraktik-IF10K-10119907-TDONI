package com.tdoni_10119907.utspraktik_if10k_10119907_tdoni

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Data(
    val jenisTest: String,
    val tanggalKonfirmasi: String,
    val nik: String,
    val nama: String,
    val tanggalLahir: String,
    val jenisKelamin: String,
    val hubungan: String,
) : Parcelable