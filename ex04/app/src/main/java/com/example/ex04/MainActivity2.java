package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        Button btn3=findViewById(R.id.btn3);

        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override

            // 버튼 1을 누른다면 페이지 1을 보여준다
            // else 페이지 1을 닫는다( 안보여준다 ) 
            public void onClick(View view) {

                Button btn1=findViewById(R.id.btn1);

                if(btn1.getVisibility()==View.VISIBLE){



                }else
            }
        });

    }
}