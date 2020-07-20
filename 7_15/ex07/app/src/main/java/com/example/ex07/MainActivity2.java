package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    LinearLayout page1, page2, page3;
    EditText name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        page1=findViewById(R.id.page1);
        page2=findViewById(R.id.page2);
        page3=findViewById(R.id.page3);

        /*
        1 ~ 100구하기
         */

        Button btnSum=findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = 0;
                for (int i = 0; i <= 100; i = i + 1) {
                    sum = sum + i;

                }
                TextView textsum = findViewById((R.id.sum));
                textsum.setText("합계 = " + sum);
            }
        });

        /*

        이미지
         */

        Button btnNamePrint=findViewById(R.id.btnNamePrint);
        btnNamePrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name=findViewById(R.id.name);
                String strName=name.getText().toString();
                Toast.makeText(MainActivity2.this,strName,Toast.LENGTH_SHORT).show();
            }
        });
    }

    //button click methods
    public void mClick(View v){
        page1.setVisibility(View.INVISIBLE);
        page2.setVisibility(View.INVISIBLE);
        page3.setVisibility(View.INVISIBLE);

        switch (v.getId()){
            case R.id.btn1 :
                page1.setVisibility(View.VISIBLE);
                break;

            case R.id.btn2 :
                page2.setVisibility(View.VISIBLE);
                break;

            case R.id.btn3 :
                page3.setVisibility(View.VISIBLE);
                break;
        }

    }

    //이미지 버튼 클릭 메서드
    public void mImage(View v){

        ImageView img=findViewById(R.id.img);

        switch(v.getId()){
            case R.id.btnPic1:
                img.setImageResource((R.drawable.dog));
                break;
            case R.id.btnPic2:
                img.setImageResource((R.drawable.dog));
                break;
            case R.id.btnPic3:
                img.setImageResource((R.drawable.dog));
                break;
        }
    }
}