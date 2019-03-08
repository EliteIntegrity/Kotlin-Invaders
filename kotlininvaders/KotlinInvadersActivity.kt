package com.gamecodeschool.kotlininvaders

import android.app.Activity
import android.graphics.Point
import android.os.Bundle

class KotlinInvadersActivity : Activity() {

    // kotlinInvadersView will be the view of the game
    // It will also hold the logic of the game
    // and respond to screen touches as well
    private var kotlinInvadersView: KotlinInvadersView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Get a Display object to access screen details
        val display = windowManager.defaultDisplay
        // Load the resolution into a Point object
        val size = Point()
        display.getSize(size)

        // Initialize gameView and set it as the view
        kotlinInvadersView = KotlinInvadersView(this, size)
        setContentView(kotlinInvadersView)
    }

    // This method executes when the player starts the game
    override fun onResume() {
        super.onResume()

        // Tell the gameView resume method to execute
        kotlinInvadersView?.resume()
    }

    // This method executes when the player quits the game
    override fun onPause() {
        super.onPause()

        // Tell the gameView pause method to execute
        kotlinInvadersView?.pause()
    }
}
