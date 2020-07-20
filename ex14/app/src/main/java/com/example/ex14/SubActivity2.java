package com.example.ex14;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity2 extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        Button btn=findViewById(R.id.btnFix);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SubActivity2.this,SubActivity3.class);
                text = findViewById(R.id.text);
                String strText=text.getText().toString();
                intent.putExtra("text",strText);

                startActivityForResult(intent, 0); //
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        String strText=data.getStringExtra("text");
        text.setText(strText);

        super.onActivityResult(requestCode, resultCode, data);
    }
}