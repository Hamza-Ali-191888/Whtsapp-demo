package com.example.whtsapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.whtsapp.Model.Person1;
import com.example.whtsapp.R;
import com.example.whtsapp.SimpleDividerItemDecoration;
import com.example.whtsapp.adapter.RecyclerViewAdapter;
import com.example.whtsapp.adapter.RecyclerViewAdapterforStatus;

import java.util.ArrayList;
import java.util.List;


public class StatusFragment extends Fragment {
    Button btnSubmit;
    EditText edName;
    private RecyclerView recyclerView;
    List<Person1> person1List=new ArrayList<>();
    RecyclerViewAdapterforStatus recyclerViewAdapterforStatus;


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
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

        person1List.add(new Person1("Hamza","Today, 6:31 PM",getResources().getDrawable(R.drawable.image2)));
        person1List.add(new Person1("Wasif","10 minutes ago",getResources().getDrawable(R.drawable.image3)));
        person1List.add(new Person1("Ali","25 minutes ago",getResources().getDrawable(R.drawable.image4)));
        person1List.add(new Person1("Kamran","1 hour ago",getResources().getDrawable(R.drawable.image5)));
        person1List.add(new Person1("Danish","50 minutes ago",getResources().getDrawable(R.drawable.image6)));
        person1List.add(new Person1("Waleed","2 hours ago",getResources().getDrawable(R.drawable.image7)));
        person1List.add(new Person1("Saadat","3 hours ago",getResources().getDrawable(R.drawable.image8)));
        person1List.add(new Person1("Kamran","1 minute ago",getResources().getDrawable(R.drawable.image9)));
        person1List.add(new Person1("Salman","30 miutes ago",getResources().getDrawable(R.drawable.image4)));
        person1List.add(new Person1("Daniyal","5 hours ago",getResources().getDrawable(R.drawable.image2)));
        recyclerViewAdapterforStatus= new RecyclerViewAdapterforStatus(person1List,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getContext()));
        recyclerView.setAdapter(recyclerViewAdapterforStatus);


        return view;
    }


}