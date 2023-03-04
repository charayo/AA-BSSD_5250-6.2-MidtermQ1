package com.example.aa_animation

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView
import androidx.appcompat.widget.LinearLayoutCompat

 class MyImageView(private val context: Context) {
    lateinit var imgView: ImageView

    @SuppressLint("ClickableViewAccessibility")
    fun init(anim:AnimationDrawable?): ImageView {
        imgView = ImageView(context).apply {
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                .1f
            )
            setImageResource(R.drawable.smoke_animation) // set image resource
//            if (anim != null) {
                Log.d("imgV", "image $anim")
//                setOnTouchListener { _, motionEvent ->
//                    val act = motionEvent?.action
//                    Log.d("imgV", "image $act")
//                    when (motionEvent?.action) {
//                        MotionEvent.ACTION_DOWN -> {
//                            if (anim!!.isRunning) {
//                                anim.stop()
//                                true
//                            } else {
//                                false
//                            }
//                        }
//                        else -> {
//                            false
//                        }
//                    }
//                }
//            }
        }
        return imgView
    }

}



