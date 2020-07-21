package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        // 타입 변수명=값을 저장할 id
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name=findViewById(R.id.name);
                String strName=name.getText().toString();
                //EditText type의 name 변수를 String type으로 변환하는 과정

                EditText add=findViewById(R.id.add);
                String strAdd=add.getText().toString();

                String str=strName +"\n" + strAdd;

                Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();

            }
        });




    }
}