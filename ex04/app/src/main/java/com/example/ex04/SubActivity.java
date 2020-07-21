package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_relative);

        // 이미지, 이름 사라지기
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image=findViewById(R.id.image);
                TextView name=findViewById(R.id.name);

                if(image.getVisibility()==View.VISIBLE) {

                    image.setVisibility(View.INVISIBLE);
                    name.setVisibility(View.INVISIBLE);
                }else{
                    image.setVisibility(View.VISIBLE);
                    name.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}