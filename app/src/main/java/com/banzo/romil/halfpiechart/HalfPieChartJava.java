package com.banzo.romil.halfpiechart;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class HalfPieChartJava extends AppCompatActivity {

//    private PieChart mChart;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_half_pie_chart);
//        mChart = (PieChart)findViewById(R.id.chart1);
//        mChart.setBackgroundColor(Color.WHITE);
//
//        moveOffScreen();
//
//        mChart.setCenterText(generateCenterSpannableText());
//
//        mChart.setUsePercentValues(true);
//        mChart.getDescription().setEnabled(false);
//        mChart.setDrawHoleEnabled(true);
//        mChart.setMaxAngle(180);
//        mChart.setRotationAngle(180f);
//        mChart.setCenterTextOffset(0,-20);
//        mChart.setRotationEnabled(false);
//
//        setData(5, 100);
//        mChart.animateY(1000, Easing.EasingOption.EaseInOutQuad);
//        Legend l = mChart.getLegend();
//        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
//        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
//        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
//        l.setDrawInside(false);
//        l.setXEntrySpace(7f);
//        l.setYEntrySpace(0f);
//        l.setYOffset(0f);
//        mChart.setEntryLabelColor(Color.WHITE);
//        mChart.setEntryLabelTextSize(12f);
//    }
//
//    String[] countries = new String[]{"India","USA","UK","LIBIA", "CUBA"};
//    private void setData(int count, float range){
//        ArrayList<PieEntry> values = new ArrayList<>();
//
//        for (int i =0; i < count; i++){
//            float val = (float)((Math.random()*range)+range/5);
//            values.add(new PieEntry(val, countries[i]));
//        }
//
//        PieDataSet dataSet = new PieDataSet(values, "Partner");
//        dataSet.setSelectionShift(5f);
//        dataSet.setSliceSpace(3f);
//        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
//
//        PieData data = new PieData(dataSet);
//        data.setValueFormatter(new PercentFormatter());
//        data.setValueTextSize(15f);
//        data.setValueTextColor(Color.WHITE);
//        mChart.setData(data);
//    }
//
//    private SpannableString generateCenterSpannableText() {
//
//        SpannableString s = new SpannableString("UFRPE\ndeveloped by Romilson Barros");
//        s.setSpan(new RelativeSizeSpan(1.7f), 0, 14, 0);
//        s.setSpan(new StyleSpan(Typeface.NORMAL), 14, s.length() - 15, 0);
//        s.setSpan(new ForegroundColorSpan(Color.GRAY), 14, s.length() - 15, 0);
//        s.setSpan(new RelativeSizeSpan(.8f), 14, s.length() - 15, 0);
//        s.setSpan(new StyleSpan(Typeface.ITALIC), s.length() - 14, s.length(), 0);
//        s.setSpan(new ForegroundColorSpan(ColorTemplate.getHoloBlue()), s.length() - 14, s.length(), 0);
//        return s;
//    }
//    private void moveOffScreen(){
//        Display display = getWindowManager().getDefaultDisplay();
////        int height = display.getHeight();
//
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        int height = metrics.heightPixels;
//
//
//        int offset = (int)(height*0.65);
//
//        RelativeLayout.LayoutParams params =
//                (RelativeLayout.LayoutParams)mChart.getLayoutParams();
//        params.setMargins(0,0,0, -offset);
//        mChart.setLayoutParams(params);
//    }
}
