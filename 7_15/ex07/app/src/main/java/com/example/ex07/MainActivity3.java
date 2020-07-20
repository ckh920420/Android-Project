package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    ImageView imgCat=findViewById(R.id.imgCat);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.costom1);

        // 버튼 클릭 메서드

        /*public void mClick(View v){
            switch (v.getId())
                case R.id btn1:
                case R.id btn2:
                case R.id btn3:
                    count++;
                    Toast.makeText(MainActivity3.this,"현재 카우트 : " + count, Toast.LENGTH_SHORT).show();
                case R.id.btn4:
                    LinearLayout linear=(LinearLayout)View.inflate(MainActivity3.this,R.layout.custom,root null);
                    Toast toast=new Toast(MainActivity3.this);
                    toast.setView(linear);
                    toast.show();

        }*/




    }
    public void mClick(View view) {

        Button btnCat=findViewById(R.id.btnCat);

        switch (view.getId()){

            case R.id.btnCat:
                Toast.makeText(MainActivity3.this, "고양이", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}