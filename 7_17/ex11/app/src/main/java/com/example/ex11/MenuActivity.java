package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



    }

    // 클릭 methods인 mClick 메소드 만들기
    public void mClick(View v){
        Intent intent=null;
        //이동을 줄때

        switch (v.getId()){

            case R.id.btn1 :
                intent=new Intent(MenuActivity.this,MainActivity.class);//어디에서 어디로 이동할지
                break;

            case R.id.btn2 :
                intent=new Intent(MenuActivity.this,MainActivity2.class);//어디에서 어디로 이동할지
                break;

            case R.id.btn3 :
                intent=new Intent(MenuActivity.this,MainActivity3.class);//어디에서 어디로 이동할지
                break;

            case R.id.btn4 :
                intent=new Intent(MenuActivity.this,MainActivity4.class);//어디에서 어디로 이동할지
                break;

            case R.id.btn5 :
                intent=new Intent(MenuActivity.this,MainActivity5.class);//어디에서 어디로 이동할지
                break;
        }

        startActivity(intent);

    }
}