package com.example.aa_animation

import android.graphics.drawable.AnimationDrawable
import android.util.Log
import android.widget.ImageView


class AnimationManager(private val name: String, private val imgView: ImageView) {
    var anim: AnimationDrawable? = null

    fun setupAnimation() {
        anim = imgView.drawable as? AnimationDrawable
        if (anim == null) {
            Log.e(name, "Invalid drawable for animation.")
        }
    }
}