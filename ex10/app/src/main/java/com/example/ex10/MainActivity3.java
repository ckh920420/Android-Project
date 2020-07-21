package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<String> data =new ArrayList<>();

        data.add("포도");
        data.add("복숭아");
        data.add("수박");
        data.add("딸기");
        data.add("자두");
        data.add("구아바");
        data.add("체리");
        data.add("망고");
        data.add("바나나");

        //어댑터 생성

        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);

        ListView list=findViewById(R.id.fruit);
        list.setAdapter(ad);


    }
}