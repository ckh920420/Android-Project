package com.example.myapplication;
/*
과일목록을 출력하는 fragment
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 프레그먼트 매니저 생성
        final FragmentManager fm=getSupportFragmentManager();

        // button을 눌러 음식목록이 출력
        Button btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoodFragment food=new FoodFragment();
                FragmentTransaction tr=fm.beginTransaction();

                tr.replace(R.id.frame, food, "food");
                tr.commit();
            }
        });

        Button btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                FruitFragment fruit=new FruitFragment();
                FragmentTransaction tr1=fm.beginTransaction();

                tr1.replace(R.id.frame,fruit,"fruit");
                tr1.commit();
            }
        });




    }
}