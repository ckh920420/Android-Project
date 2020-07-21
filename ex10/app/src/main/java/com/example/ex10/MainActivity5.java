package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    ArrayList<Item> data;
    MyAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //데이터 생성
        data = new ArrayList<Item>();
        Item item = new Item(R.drawable.h1,"그랜저");
        data.add(item);
        item = new Item(R.drawable.h2,"소나타");
        data.add(item);
        item = new Item(R.drawable.h3,"아반테");
        data.add(item);

        //어댑터 생성
        ad = new MyAdapter();

        //리스트뷰에 어댑터를 끼워넣기
        ListView list=findViewById(R.id.list);
        list.setAdapter(ad);


    }
    //어댑터 정의
    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.item1,viewGroup,false);
            ImageView img=view.findViewById(R.id.img);
            img.setImageResource(data.get(i).img);

            TextView name=view.findViewById((R.id.name));
            name.setText(data.get(i).name);
            return view;

        }
    }


    // item을 생성해주는 item 클래스
    class Item{
        int img;
        String name;

        public Item(int img, String name) {
            this.img = img;
            this.name = name;
        }
    }
}