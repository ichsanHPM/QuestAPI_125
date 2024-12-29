package com.example.pampertemuan12

import android.app.Application
import com.example.pampertemuan12.repository.AppContainer
import com.example.pampertemuan12.repository.MahasiswaContainer

class MahasiswaApplications: Application(){
    lateinit var container: AppContainer
    override fun onCreate(){
        super.onCreate()
        container = MahasiswaContainer()

    }
}