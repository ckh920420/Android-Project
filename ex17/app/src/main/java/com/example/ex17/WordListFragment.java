package com.example.ex17;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class WordListFragment extends ListFragment {

    String[] words= {"boy", "girl","school","hello","go"};
    String[] desc= {
            "A boy is a child who will grow up to be a man",
            "A girl is a female child",
            "A school is a place where children are educated",
            "You say'Hello' to someone when you meet them",
            "When you go somewhere. tou move or travel there"};

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,words));



        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        TextView text=getActivity().findViewById(R.id.text);
        text.setText(desc[position]);


    }
}
