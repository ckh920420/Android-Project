package com.example.ex08;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);


        registerForContextMenu(btn);
        registerForContextMenu(btn1);
    }
// 메뉴를 등록
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sub,menu);
        return super.onCreateOptionsMenu(menu);
    }
//메뉴를 작성
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.bigFont :
                if(item.isChecked()){
                    btn.setTextSize(TypedValue.COMPLEX_UNIT_PX,100);
                } else {
                    btn.setTextSize(TypedValue.COMPLEX_UNIT_PX,200);
                }
                break;

            case R.id.red :
                btn.setBackgroundColor(Color.BLACK);
                btn.setTextColor(Color.RED);
                break;
            case R.id.green :
                btn.setBackgroundColor(Color.DKGRAY);
                btn.setTextColor(Color.GREEN);
                break;
            case R.id.blue :
                btn.setBackgroundColor(Color.YELLOW);
                btn.setTextColor(Color.BLUE);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    // 메뉴가 나오기 전에 체크


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if(btn.getTextSize()==200){
            menu.findItem(R.id.bigFont).setChecked(true);
        }else {
            menu.findItem(R.id.bigFont).setChecked(false);
        }

        int color=btn.getTextColors().getDefaultColor();
        switch (color){
            case Color.RED :
                menu.findItem(R.id.red).setChecked(true);
                break;

            case Color.GREEN :
                menu.findItem(R.id.green).setChecked(true);
                break;

            case Color.BLUE :
                menu.findItem(R.id.blue).setChecked(true);
                break;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        if(v==btn) {


            menu.setHeaderTitle("글자색 변경");
            menu.add(0, 100, 0, "red");
            menu.add(0, 200, 0, "blue");
            menu.add(0, 300, 0, "green");

        }
        if(v==btn1) {

            menu.setHeaderTitle("배경색 변경");
            menu.add(0, 400, 0, "red");
            menu.add(0, 500, 0, "blue");
            menu.add(0, 600, 0, "green");
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()){

            case 100 :
                btn.setTextColor(Color.RED);
                break;

            case 200 :
                btn.setTextColor(Color.BLUE);
                break;

            case 300 :
                btn.setTextColor(Color.GREEN);
                break;

            case 400 :
                btn1.setBackgroundColor(Color.RED);
                break;

            case 500 :
                btn1.setBackgroundColor(Color.BLUE);
                break;

            case 600 :
                btn1.setBackgroundColor(Color.GREEN);
                break;



        }


        return super.onContextItemSelected(item);
    }
}