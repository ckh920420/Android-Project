package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class FruitFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fruit, container, false);

        //데이터 생성
        final ArrayList<String> data = new ArrayList<String>();
        data.add("apple");
        data.add("pear");
        data.add("melon");

        ArrayAdapter ap = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, data);

        //리스트뷰

        ListView list=view.findViewById(R.id.list);
        list.setAdapter(ap);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String strFruit=data.get(i);
                Toast.makeText(getActivity(),strFruit,Toast.LENGTH_SHORT).show();
            }
        });




        return view;
    }
}