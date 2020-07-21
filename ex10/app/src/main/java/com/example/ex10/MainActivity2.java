package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 출력할 데이터 생성
        ArrayList<String> data=new ArrayList<>(); //데이터를 저장할 바구니(배열)가 만들어짐

        // data 배열에 값 넣기
        data.add("김유신");
        data.add("이순신");
        data.add("맥아더");
        data.add("태권브이");


        //어뎁터 생성
        ArrayAdapter ad=new ArrayAdapter(this, R.layout.item, data);
        //어디에, 어떤 모양으로, 어느 데이터를 생성할지...

        //어뎁터를 리스트뷰에 끼워주기
        ListView list = findViewById(R.id.list);//id 찾기
        list.setAdapter(ad);




        //과일이름 리스트 생성

        ArrayList<String> data1 =new ArrayList<>();

        data1.add("포도");
        data1.add("복숭아");
        data1.add("수박");
        data1.add("딸기");
        data1.add("자두");
        data1.add("구아바");
        data1.add("체리");
        data1.add("망고");
        data1.add("바나나");

        //어댑터 생성

        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_1, data1);

        ListView fruit=findViewById(R.id.fruit);
        fruit.setAdapter(ad1);
    }
}