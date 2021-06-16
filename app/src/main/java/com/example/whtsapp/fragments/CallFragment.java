package com.example.whtsapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whtsapp.Model.Person1;
import com.example.whtsapp.R;
import com.example.whtsapp.SimpleDividerItemDecoration;
import com.example.whtsapp.adapter.RecyclerViewAdapter;
import com.example.whtsapp.adapter.RecyclerViewAdapterforCall;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class CallFragment extends Fragment {
    private RecyclerView recyclerView;
    List<Person1> person1List=new ArrayList<>();
    RecyclerViewAdapterforCall recyclerViewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {

        View view = inflater.inflate(R.layout.fragment_call, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return null;
            }

            @Override
            public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        });
        person1List.add(new Person1("Hamza","Today, 11:32 AM",getResources().getDrawable(R.drawable.image2)));
        person1List.add(new Person1("Wasif","Today, 9:52 AM",getResources().getDrawable(R.drawable.image3)));
        person1List.add(new Person1("Ali","Yesterday, 11:35 PM",getResources().getDrawable(R.drawable.image4)));
        person1List.add(new Person1("Kamran","(2) Yesterday, 5:21 PM",getResources().getDrawable(R.drawable.image5)));
        person1List.add(new Person1("Danish","Yesterday, 11:45 PM",getResources().getDrawable(R.drawable.image6)));
        person1List.add(new Person1("Waleed","June 14, 10:50 PM",getResources().getDrawable(R.drawable.image7)));
        person1List.add(new Person1("Saadat","June 13, 12:00 PM",getResources().getDrawable(R.drawable.image8)));
        person1List.add(new Person1("Kamran","(5) June 12, 3:00 AM",getResources().getDrawable(R.drawable.image9)));
        person1List.add(new Person1("Salman","(3) June 1, 12:40 AM",getResources().getDrawable(R.drawable.image4)));
        person1List.add(new Person1("Daniyal","June 1, 1 PM",getResources().getDrawable(R.drawable.image2)));
        recyclerViewAdapter= new RecyclerViewAdapterforCall(person1List,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getContext()));
        recyclerView.setAdapter(recyclerViewAdapter);


        return view;
    }

}