package com.example.myapplication;

/*
어댑터 뷰
리스트 뷰
스피너

1) 데이터 생성
2) 어댑터 생성
3) 리스트뷰--> 어댑터 넣어주기

 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}