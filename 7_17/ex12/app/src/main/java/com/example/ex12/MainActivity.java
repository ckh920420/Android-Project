package com.example.ex12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Address> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이타 생성
        data = new ArrayList<Address>();
        Address address = new Address("홍길동", "율도국");
        data.add(address);

        address = new Address("이순신", "충남 아산");
        data.add(address);

        address = new Address("신사임당", "신사동");
        data.add(address);

        address = new Address("흰둥이", "짱구네 마당");
        data.add(address);



        // 어댑터 생성
        AddAdapter ad = new AddAdapter();

        //리스트뷰에 어댑터 세팅
        list=findViewById(R.id.list);
        list.setAdapter(ad);
    }

    //어댑터 정의
    public class  AddAdapter extends BaseAdapter{
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
        public View getView(int i, View v, ViewGroup viewGroup) {

            v=getLayoutInflater().inflate(R.layout.item,viewGroup,false);

            final TextView name=v.findViewById(R.id.name);
            name.setText(data.get(i).name);
            TextView add=v.findViewById(R.id.add);
            add.setText(data.get(i).add);

            Button btn=v.findViewById(R.id.btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);

                    alert.setTitle("질의");
                    String strName=name.getText().toString();
                    alert.setMessage(strName + "을(를) 삭제하시겠습니까");
                    alert.setPositiveButton("예",null);
                    alert.setNegativeButton("아니오",null);
                    alert.show();

                }
            });

            return v;
        }
    }


}