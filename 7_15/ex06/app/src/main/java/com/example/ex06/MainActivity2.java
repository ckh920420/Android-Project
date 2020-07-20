package com.example.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 ~ 100까지 합을 토스트로 출력



        for(int num=0; num<=100; num++){
            System.out.println(num);
        }


    }
}