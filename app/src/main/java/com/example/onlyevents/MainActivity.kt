package com.example.onlyevents
import com.clevertap.android.sdk.CleverTapAPI //added by CleverTap Assistant
import android.app.NotificationManager        //added by CleverTap Assistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var clevertapDefaultInstance: CleverTapAPI? = null
		clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(applicationContext)   //Initializing the CleverTap SDK
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CleverTapAPI.setDebugLevel(3)

		CleverTapAPI.createNotificationChannel(getApplicationContext(),"generic","mychannel","lDescription",NotificationManager.IMPORTANCE_MAX,true)        //added by CleverTap Assistant
    }
}
