package com.example.selflearning.hello_android_java.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import kotlin.concurrent.thread

/**
 * Create by Nguyen Van Phuc on 1/22/19
 */
class FirstCanvas(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private var mPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var mRotate = 0F

    init {
        mPaint.color = Color.BLUE
        mPaint.strokeWidth = 20F
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val x = 100F
        val y = 200F
        canvas?.rotate(mRotate, x + 25, y + 25)
        canvas?.drawLine(x, y, x + 150, y + 150, mPaint)
        mRotate %= 360
        Log.e("xxx", "a a a ")
    }


    fun quay() {
        thread{


            mRotate += 5
            invalidate()
        }.start()
    }
}
