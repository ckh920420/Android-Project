package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //전역변수 선언
    ListView list;
    ListView list1;
    //문자열의 배열 변수 선언
    ArrayList<String> data;
    //스피너 선언
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main layout에 있는 id 찾기
        list=findViewById(R.id.list);
        list1=findViewById(R.id.list1);
        spin=findViewById(R.id.spin);

        //데이타 생성
        // String을 저장할 바구니(배열)만 생성
        data=new ArrayList<String>();
        //배열에 각각의 값을 저장
        data.add("바나나");
        data.add("포도");
        data.add("수박");


        //어댑터 생성
        ///어댑터 변수명=새로운 어댑터 (어댑터를 구성할 장소, 어떻게 구성할지 틀, 어떤 값을 넣을건지);
        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, data);

        //listView에 어댑터 세팅하기
        list.setAdapter(ad);
        list.setChoiceMode((ListView.CHOICE_MODE_MULTIPLE));

        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, data);
        list1.setAdapter(ad1);
        list1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        //스피너 생성

        ArrayAdapter ad2=new ArrayAdapter(this,android.R.layout.simple_spinner_item,data);
        ad2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        spin.setAdapter(ad);





    }
}