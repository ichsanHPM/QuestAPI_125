package com.example.pampertemuan12.ui.viewmodel

import com.example.pampertemuan12.model.Mahasiswa

data class InsertUiState(
    val insertUiEvent : InsertUiEvent = InsertUiEvent()
)

data class InsertUiEvent(
    val nim: String = "",
    val nama: String = "",
    val alamat: String = "",
    val jeniskelamin: String = "",
    val kelas: String = "",
    val angkatan: String = ""
)

fun InsertUiEvent.toMhs(): Mahasiswa = Mahasiswa(
    nim = nim,
    nama = nama,
    alamat = alamat,
    jeniskelamin = jeniskelamin,
    kelas = kelas,
    angkatan = angkatan
)

fun Mahasiswa.toUiStateMhs(): InsertUiState = InsertUiState(
    insertUiEvent = toInsertUiEvent()
)

fun Mahasiswa.toInsertUiEvent(): InsertUiEvent = InsertUiEvent(
    nim = nim,
    nama = nama,
    alamat = alamat,
    jeniskelamin = jeniskelamin,
    kelas = kelas,
    angkatan = angkatan
)