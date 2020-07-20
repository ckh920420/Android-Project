package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    /*TextView name;
    TextView tel;
    TextView add;
    ImageView img;*/

    ListView list;
    ArrayList<Address> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //데이터 생성
        data = new ArrayList<Address>();
        Address address1=new Address(R.drawable.car, "김 제네시스", "010-0000-0000", "충남 아산");
        data.add(address1);

        address1=new Address(R.drawable.dog,"김 강아지", "010-0001-0001","경기 수원");
        data.add(address1);

        address1=new Address(R.drawable.cat,"김 고양이", "010-0002-0002","경북 대구");
        data.add(address1);

        address1=new Address(R.drawable.chi,"김 치킨", "010-0003-0003","강원 원주");
        data.add(address1);

        address1=new Address(R.drawable.chi,"김 치킨", "010-0003-0003","전북 장수");
        data.add(address1);

        //어댑터 생성
        AddAdapter addAdapter=new AddAdapter();

        //ListView 에 Adapter Set
        list=findViewById(R.id.list);
        list.setAdapter(addAdapter);

    }

    //어댑터 정의
    class AddAdapter extends BaseAdapter{

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
            view=getLayoutInflater().inflate(R.layout.item_add,viewGroup,false);

            ImageView img=view.findViewById(R.id.img);
            img.setImageResource(data.get(i).img);

            TextView name=view.findViewById(R.id.name);
            name.setText(data.get(i).name);

            TextView tel=view.findViewById(R.id.tel);
            tel.setText(data.get(i).tel);

            TextView add=view.findViewById(R.id.add);
            add.setText(data.get(i).add);


            return view;
        }
    }
}