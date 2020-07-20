package com.example.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=findViewById(R.id.image);
        findViewById((R.id.btn1)).setOnLongClickListener(mLong);
        findViewById((R.id.btn2)).setOnLongClickListener(mLong);
        findViewById((R.id.btn3)).setOnLongClickListener(mLong);
        findViewById((R.id.btn4)).setOnLongClickListener(mLong);
        findViewById((R.id.btn5)).setOnLongClickListener(mLong);

        //1 ~ 100까지 합을 토스토로 출력



    }

    //long Click methods
    Button.OnLongClickListener mLong=new View.OnLongClickListener(){
        String str;
        @Override
        public boolean onLongClick(View view) {
            switch (view.getId()) {
                case R.id.btn1 :
                    str="아반떼 이미지입니다";
                    break;

                case R.id.btn2 :
                    str="투싼 이미지입니다";
                    break;

                case R.id.btn3 :
                    str="람보르기니 이미지입니다";
                    break;

                case R.id.btn4 :
                    str="캠리 이미지입니다";
                    break;

                case R.id.btn5 :
                    str="레이 이미지입니다";
                    break;

            }
            Toast.makeText(MainActivity.this,str, Toast.LENGTH_SHORT).show();
            return false;
        }
    };

        public void mClick(View v) {

            switch (v.getId()) {

                case R.id.btn1 :
                    image.setImageResource(R.drawable.car1);
                    break;

                case R.id.btn2 :
                    image.setImageResource(R.drawable.car2);
                    break;

                case R.id.btn3 :
                    image.setImageResource(R.drawable.car3);
                    break;

                case R.id.btn4 :
                    image.setImageResource(R.drawable.car4);
                    break;

                case R.id.btn5 :
                    image.setImageResource(R.drawable.car5);
                    break;


            }


        }

}