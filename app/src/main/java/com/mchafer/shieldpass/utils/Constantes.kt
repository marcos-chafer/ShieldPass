package com.mchafer.shieldpass.utils

object Constantes {

    const val TAG = "tagmarcos";
    const val AppTag = TAG;

    const val SERVICE_MODE_DATA_ACQUISITION = "Data acquisiton"
    const val SERVICE_MODE_SIMPLE_SCANNING = "Simple RSS Scanning"
    const val SERVICE_MODE_CONNECT = "Connect to device"

    // Bluetooth

    const val BLE_FREQUENCY_BALANCE = "Balanced" // ScanSettings.SCAN_MODE_BALANCED
    const val BLE_FREQUENCY_LOW_LATENCY = "Low latency" // ScanSettings.SCAN_MODE_LOW_LATENCY
    const val BLE_FREQUENCY_LOW_POWER = "Low Power" // ScanSettings.SCAN_MODE_LOW_POWER
    const val BLE_FREQUENCY_OPPORTUNISTIC = "Opportunistic" // ScanSettings.SCAN_MODE_OPPORTUNISTIC

    // SERVICES

    val FOREGROUND_SERVICE_BROADCAST = "Foreground_Service_Broadcast"
    val BACKGROUND_SERVICE_BROADCAST = "Background_Service_Broadcast"
    val BIND_SERVICE_BROADCAST       = "Bind_Service_Broadcast"
    val CLOCK       = "Clock"
    val ORDER       = "order"
    
}