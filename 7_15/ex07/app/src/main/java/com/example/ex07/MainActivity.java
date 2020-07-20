package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.text);

        findViewById(R.id.btn1).setOnLongClickListener(mLong);
        findViewById(R.id.btn2).setOnLongClickListener(mLong);
        findViewById(R.id.btn3).setOnLongClickListener(mLong);


    }

    // 클릭 메소드
    public void mClick(View v){

        switch (v.getId()){

            case R.id.btn1 :
                text.setTextColor(Color.WHITE);
                text.setBackgroundColor(Color.RED);
                break;

            case R.id.btn2 :
                text.setTextColor(Color.RED);
                text.setBackgroundColor(Color.BLACK);
                break;

            case R.id.btn3 :
                text.setTextColor(Color.BLUE);
                text.setBackgroundColor(Color.DKGRAY);
        }
    }

    // Long Click 이벤트 처리

    Button.OnLongClickListener mLong=new Button.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v) {

            String str="";

            switch (v.getId()){
                case R.id.btn1 :
                    str="첫번째 버튼";
                    break;
                case R.id.btn2 :
                    str="두번쨰 버튼";
                    break;
                case R.id.btn3 :
                    str="세번째 버튼";
                    break;
            }
            Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
            return false;
        }
    };

    //이미지 버튼 클릭 메서드
    public void mImage(View v){

        ImageView img=findViewById(R.id.img);

        switch(v.getId()){
            case R.id.btnPic1:
                img.setImageResource((R.drawable.hong));
                break;
            case R.id.btnPic2:
                img.setImageResource((R.drawable.cat));
            case R.id.btnPic3:
                img.setImageResource((R.drawable.dog));
        }
    }
}