package com.example.aa_animation

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.animation.ValueAnimator.REVERSE
import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginLeft
import java.util.*
import kotlin.math.round
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var anim1: AnimationDrawable? = null
    var anim2: AnimationDrawable? = null
    var anim3: AnimationDrawable? = null
    var anim4: AnimationDrawable? = null
    var anim5: AnimationDrawable? = null
    var anim6: AnimationDrawable? = null
    var anim7: AnimationDrawable? = null
    var anim8: AnimationDrawable? = null
    private lateinit var smokeMover1: ObjectAnimator
    private lateinit var smokeMover2: ObjectAnimator
    private lateinit var smokeMover3: ObjectAnimator
    private lateinit var smokeMover4: ObjectAnimator
    private lateinit var smokeMover5: ObjectAnimator
    private lateinit var smokeMover6: ObjectAnimator
    private lateinit var smokeMover7: ObjectAnimator
    private lateinit var smokeMover8: ObjectAnimator
    private var smashed: Int = 0

    private var time = 0
    private lateinit var message: TextView
    private lateinit var task: TimerTask
    private val timer = Timer()
    private var counting = false

    @SuppressLint("ClickableViewAccessibility", "SetTextI18n", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
Log.d("smashed", smashed.toString())
        val vg = findViewById<ViewGroup>(android.R.id.content)
            .getChildAt(0) as ConstraintLayout

        val imgView1 = MyImageView(this).init(anim1)
        val imgView2 = MyImageView(this).init(anim2)
        val imgView3 = MyImageView(this).init(anim3)
        val imgView4 = MyImageView(this).init(anim4)
        val imgView5 = MyImageView(this).init(anim5)
        val imgView6 = MyImageView(this).init(anim6)
        val imgView7 = MyImageView(this).init(anim7)
        val imgView8 = MyImageView(this).init(anim8)

        val imageViews =
            arrayOf(imgView1, imgView2, imgView3, imgView4, imgView5, imgView6, imgView7, imgView8)


        fun evalWin() {
            if (smashed == 8) {
                this@MainActivity.runOnUiThread(java.lang.Runnable {
                    Toast.makeText(applicationContext, "You Won", Toast.LENGTH_LONG)
                        .show()
                })
                smashed = 0
            }
//
        }



        fun checkGame() {
            Log.d("smashed", smashed.toString())
            if (message.text == "5" && smashed != 8) {
                this@MainActivity.runOnUiThread(java.lang.Runnable {
                    Toast.makeText(applicationContext, "You Lost", Toast.LENGTH_LONG)
                        .show()
                })
//                smashed = 0
            }
//            if(smashed == 8){
//             this@MainActivity.runOnUiThread(java.lang.Runnable {
//                    Toast.makeText(applicationContext, "You Won", Toast.LENGTH_LONG)
//                        .show()
//                })
////                smashed = 0
//            }


        }


        imgView1.setOnTouchListener { _, motionEvent ->
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim1!!.isRunning) {
                        anim1?.stop()
                        smokeMover1.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }

        imgView2.setOnTouchListener { _, motionEvent ->
//                  val act = motionEvent?.action
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim2!!.isRunning) {
                        anim2?.stop()
                        smokeMover2.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }
        imgView3.setOnTouchListener { _, motionEvent ->
//                  val act = motionEvent?.action
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim3!!.isRunning) {
                        anim3?.stop()
                        smokeMover3.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }
        imgView4.setOnTouchListener { _, motionEvent ->
//                  val act = motionEvent?.action
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim4!!.isRunning) {
                        anim4?.stop()
                        smokeMover4.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }
        imgView5.setOnTouchListener { _, motionEvent ->
//                  val act = motionEvent?.action
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim5!!.isRunning) {
                        anim5?.stop()
                        smokeMover5.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }
        imgView6.setOnTouchListener { _, motionEvent ->
//                  val act = motionEvent?.action
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim6!!.isRunning) {
                        anim6?.stop()
                        smokeMover6.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }
        imgView7.setOnTouchListener { _, motionEvent ->
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim7!!.isRunning) {
                        anim7?.stop()
                        smokeMover7.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }
        imgView8.setOnTouchListener { _, motionEvent ->
            when (motionEvent?.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (anim8!!.isRunning) {
                        anim8?.stop()
                        smokeMover8.pause()
                        smashed++
                        Log.d("Smashed", smashed.toString())
                        evalWin()
                        true
                    } else {
                        false
                    }
                }
                else -> {
                    false
                }
            }
        }


        anim1 = imgView1.drawable as AnimationDrawable
        anim2 = imgView2.drawable as AnimationDrawable
        anim3 = imgView3.drawable as AnimationDrawable
        anim4 = imgView4.drawable as AnimationDrawable
        anim5 = imgView5.drawable as AnimationDrawable
        anim6 = imgView6.drawable as AnimationDrawable
        anim7 = imgView7.drawable as AnimationDrawable
        anim8 = imgView8.drawable as AnimationDrawable


        message = TextView(this).apply {
            text = "0"
            textSize = 24f
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                .5f
            )
        }
        val startButton = Button(this).apply {

            text = "Start Game"
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                .5f
            )
            id = View.generateViewId()
            val valAnimator = ValueAnimator.ofInt(0,30)
            valAnimator.duration = 30000
            valAnimator.addUpdateListener {
                Log.d("End", it.animatedValue.toString())
                if(it.animatedValue.toString() == "30"){
                    this@MainActivity.runOnUiThread(java.lang.Runnable {
                        Toast.makeText(applicationContext, "You Lost", Toast.LENGTH_LONG)
                            .show()
                    })
                }

                message.text = it.animatedValue.toString()
            }

//            val smokeMovers = arrayOf(smokeMover1,smokeMover2,smokeMover3,smokeMover4,smokeMover5,smokeMover6,smokeMover7,smokeMover8 )
            setOnClickListener {
                      valAnimator.start()
                val h = baseContext.resources.displayMetrics.heightPixels

                smokeMover1 = ObjectAnimator.ofFloat(
                    imgView1,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    start()
                }
                smokeMover2 = ObjectAnimator.ofFloat(
                    imgView2,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    repeatMode = REVERSE
                    start()
                }
                smokeMover3 = ObjectAnimator.ofFloat(
                    imgView3,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    start()
                }
                smokeMover4 = ObjectAnimator.ofFloat(
                    imgView4,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    start()
                }
                smokeMover5 = ObjectAnimator.ofFloat(
                    imgView5,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    start()
                }
                smokeMover6 = ObjectAnimator.ofFloat(
                    imgView6,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    start()
                }
                smokeMover7 = ObjectAnimator.ofFloat(
                    imgView7,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    start()
                }
                smokeMover8 = ObjectAnimator.ofFloat(
                    imgView8,
                    "translationY", 0.toFloat(), h.toFloat()
                ).apply {
                    val range = 3000L..5000L
                    val value = range.random()
                    duration = value
                    repeatCount = ObjectAnimator.INFINITE
                    repeatMode = REVERSE
                    start()
                }


                anim1?.start()
                anim2?.start()
                anim3?.start()
                anim4?.start()
                anim5?.start()
                anim6?.start()
                anim7?.start()
                anim8?.start()
            }
        }
        val animLayout = LinearLayoutCompat(this).apply {
//            orientation = LinearLayoutCompat.HORIZONTAL
            layoutParams = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
            )
            weightSum = 0.8f
            addView(imgView1)
            addView(imgView2)
            addView(imgView3)
            addView(imgView4)
            addView(imgView5)
            addView(imgView6)
            addView(imgView7)
            addView(imgView8)
        }

        val linearLayout = LinearLayoutCompat(this).apply {
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT
            )
            weightSum = 1f

            addView(message)
            addView(startButton)
        }
        vg.addView(linearLayout)
        vg.addView(animLayout)

    }

}