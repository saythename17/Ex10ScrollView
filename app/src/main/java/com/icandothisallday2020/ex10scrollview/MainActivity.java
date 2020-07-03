package com.icandothisallday2020.ex10scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v){
        //스크롤 뷰 참조
        ScrollView scroll=findViewById(R.id.scroll);
        //스크롤뷰의 스크롤위치를 가장 아래로 이동(세로)
        scroll.fullScroll(ScrollView.FOCUS_DOWN);
        //스크롤뷰의 스크롤위치를 가장 오른쪽으로 이동(가로)
        HorizontalScrollView hs=findViewById(R.id.scrollh);
        hs.fullScroll(ScrollView.FOCUS_RIGHT);
    }
}
