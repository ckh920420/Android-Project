package com.example.ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    // 증감하는 값을 저장하는 변수 선언 및 초기화
    int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 증가하는 이벤트
        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);

        // 증가버튼 클릭 이벤트
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView count=findViewById(R.id.count);
                cnt=cnt + 1;
                count.setText(cnt + "");

            }
        });

        // 감소버튼 클릭 이벤트
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView count1=findViewById(R.id.count);
                cnt=cnt - 1;
                count1.setText(cnt + ""); //integer + String = String 의 의미 '문자열로 출력하라'
            }
        });

        // 증가버튼 롱클릭
        btn1.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                TextView count2=findViewById(R.id.count);
                cnt=100;
                count2.setText(cnt +"");
                return true;

            }

        });

        //감소버튼을 롱클릭
        btn2.setOnLongClickListener((new Button.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        TextView count3 = findViewById(R.id.count);
                        cnt = 0;
                        count3.setText(cnt + "");
                        return true;
                    }
        }));


    }
}