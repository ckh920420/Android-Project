package com.example.ex15;

/*
MainActivity를 수정하는 화면
 */

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText name, add, age, tel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.name);
        add=findViewById(R.id.add);
        age=findViewById(R.id.age);
        tel=findViewById(R.id.tel);

        Intent intent = getIntent();
        String strName=intent.getStringExtra("name");
        String strAdd=intent.getStringExtra("add");
        String strAge=intent.getStringExtra("age");
        String strTel=intent.getStringExtra("tel");

        name.setText(strName);
        add.setText(strAdd);
        age.setText(strAge);
        tel.setText(strTel);


        // 저장버튼
        Button btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 저장 전에 물어보는 알림창
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity2.this);
                alert.setTitle("Notice");
                alert.setMessage("Are You Sure?");
                alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // 저장시 yes를 클릭했을때만 저장
                        String strName = name.getText().toString();
                        String strAdd = add.getText().toString();
                        String strAge = age.getText().toString();
                        String strTel = tel.getText().toString();

                        Intent intent = new Intent();
                        intent.putExtra("name",strName);
                        intent.putExtra("add",strAdd);
                        intent.putExtra("age",strAge);
                        intent.putExtra("tel",strTel);

                        setResult(1, intent);
                        finish();
                    }
                });
                alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity2.this,"저장 취소",Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();

                //


            }
        });



        // 취소
        Button btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) { //취소버튼 클릭

                setResult(0); // 저장은 resultCode 1
                finish();

            }
        });
    }


}