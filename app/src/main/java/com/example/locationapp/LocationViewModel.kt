package com.example.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LocationViewModel: ViewModel() {

    private val _location = mutableStateOf<LocationDetails?>(null)
    val location: State<LocationDetails?> = _location


    fun updateLocation(newLocation: LocationDetails){
        _location.value = newLocation
    }

}