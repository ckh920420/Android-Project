package com.example.ex16;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText edit;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edit=findViewById(R.id.edit);
        editName=findViewById(R.id.editName);

        Intent intent=getIntent();
        String strText=intent.getStringExtra("text");
        String strName=intent.getStringExtra("name");

        edit.setText(strText);
        editName.setText(strName);

        Button btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder box=new AlertDialog.Builder(MainActivity2.this);
                box.setTitle("Question");
                box.setMessage("Are You Sure?");
                box.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String strEdit=edit.getText().toString();
                        String strEditName=editName.getText().toString();

                        Intent intent=new Intent();
                        intent.putExtra("text",strEdit);
                        intent.putExtra("name", strEditName);
                        setResult(1,intent);
                        finish();
                    }
                });
                box.setNegativeButton("no",null);
                box.show();
            }
        });


    }


}