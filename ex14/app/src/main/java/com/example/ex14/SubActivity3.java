package com.example.ex14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity3 extends AppCompatActivity {

    EditText edit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        intent=getIntent();
        String strText=intent.getStringExtra("text");

        edit=findViewById(R.id.edit);
        edit.setText(strText);
    }

    public void mClick(View v){

        switch (v.getId()){
            case R.id.btnSave :
                String strEdit=edit.getText().toString();
               intent.putExtra("text",strEdit);

               setResult(RESULT_OK,intent);
               break;

            case R.id.btnCancel :
                finish();
                break;
        }

    }
}