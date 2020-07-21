package com.example.ex17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void mClick(View v){

        switch (v.getId()){
            case R.id. btnMenu1 :

                Intent intent=new Intent(this,MainActivity.class);
                startActivity(intent);
                break;

            case R.id. btnMenu2 :

                intent=new Intent(this,MainActivity2.class);
                startActivity(intent);

                break;

            case R.id. btnMenu3 :

                intent=new Intent(this, MainActivity3.class);
                startActivity(intent);

                break;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mainmenu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.item1 :
            Intent intent=new Intent(this, MainActivity2.class);
            startActivity(intent);
            break;

            case R.id.item2 :
                intent=new Intent(this, MenuActivity.class);
                startActivity(intent);
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}