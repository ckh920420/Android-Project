package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    EditText edit;
    ListView list;
    Button btnInsert,btnDelete;
    ArrayList<String> data;

    //어댑터 생성
    ArrayAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edit=findViewById(R.id.edit);
        list=findViewById(R.id.list);
        btnInsert=findViewById(R.id.btnInsert);
        btnDelete=findViewById(R.id.btnDelete);

        //데이터 생성
        data=new ArrayList<>();

        data.add("포도");
        data.add("수박");
        data.add("딸기");

        //어댑터 생성
        ad=new ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,data);

        //ListView에 어댑터 넣어주기
        list.setAdapter(ad);
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        // 리스트 항목 체크 시 토스트 출력
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str=data.get(i);
                Toast.makeText(MainActivity4.this, str, Toast.LENGTH_SHORT).show();
            }
        });

        //입력버튼 활성화
        btnInsert.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit.getText().toString();
                data.add(str);
                ad.notifyDataSetChanged();
                edit.setText("");

            }
        });


//        btnInsert.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if
//            }
//        });



        // 삭제버튼 이벤트
        btnDelete.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = list.getCheckedItemPosition();
                data.remove(position);
                ad.notifyDataSetChanged();
            }
        });


        //리스트 체크시 토스트 출력


    }






}