package com.banzo.romil.halfpiechart

import android.graphics.Color
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.util.DisplayMetrics
import android.view.View
import android.widget.RelativeLayout
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.PercentFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import java.util.ArrayList

class HalfPieChart : AppCompatActivity() {

    private var mChart: PieChart? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_half_pie_chart)
        mChart = findViewById<View>(R.id.chart1) as PieChart
        mChart!!.setBackgroundColor(Color.WHITE)

        moveOffScreen()

        mChart!!.centerText = generateCenterSpannableText()

        mChart!!.setUsePercentValues(true)
        mChart!!.description.isEnabled = false
        mChart!!.isDrawHoleEnabled = true
        mChart!!.maxAngle = 180f
        mChart!!.rotationAngle = 180f
        mChart!!.setCenterTextOffset(0f, -20f)
        mChart!!.isRotationEnabled = false

        setData(5, 100f)
        mChart!!.animateY(1000, Easing.EasingOption.EaseInOutQuad)
        val l = mChart!!.legend
        l.verticalAlignment = Legend.LegendVerticalAlignment.TOP
        l.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        l.orientation = Legend.LegendOrientation.HORIZONTAL
        l.setDrawInside(false)
        l.xEntrySpace = 7f
        l.yEntrySpace = 0f
        l.yOffset = 0f
        mChart!!.setEntryLabelColor(Color.WHITE)
        mChart!!.setEntryLabelTextSize(12f)
    }

    internal var countries = arrayOf("India", "USA", "UK", "LIBIA", "CUBA")
    private fun setData(count: Int, range: Float) {
        val values = ArrayList<PieEntry>()

        for (i in 0 until count) {
            val `val` = (Math.random() * range + range / 5).toFloat()
            values.add(PieEntry(`val`, countries[i]))
        }

        val dataSet = PieDataSet(values, "Partner")
        dataSet.selectionShift = 5f
        dataSet.sliceSpace = 3f
        dataSet.setColors(*ColorTemplate.MATERIAL_COLORS)

        val data = PieData(dataSet)
        data.setValueFormatter(PercentFormatter())
        data.setValueTextSize(15f)
        data.setValueTextColor(Color.WHITE)
        mChart!!.data = data
    }

    private fun generateCenterSpannableText(): SpannableString {

        val s = SpannableString("UFRPE\ndeveloped by Romilson Barros")
        s.setSpan(RelativeSizeSpan(1.7f), 0, 14, 0)
        s.setSpan(StyleSpan(Typeface.NORMAL), 14, s.length - 15, 0)
        s.setSpan(ForegroundColorSpan(Color.GRAY), 14, s.length - 15, 0)
        s.setSpan(RelativeSizeSpan(.8f), 14, s.length - 15, 0)
        s.setSpan(StyleSpan(Typeface.ITALIC), s.length - 14, s.length, 0)
        s.setSpan(ForegroundColorSpan(ColorTemplate.getHoloBlue()), s.length - 14, s.length, 0)
        return s
    }

    private fun moveOffScreen() {
//        val display = windowManager.defaultDisplay
        //        int height = display.getHeight();

        val metrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(metrics)
        val height = metrics.heightPixels


        val offset = (height * 0.65).toInt()

        val params = mChart!!.layoutParams as RelativeLayout.LayoutParams
        params.setMargins(0, 0, 0, -offset)
        mChart!!.layoutParams = params
    }


}
