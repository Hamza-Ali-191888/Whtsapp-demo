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

import java.util.ArrayList;
import java.util.List;


public class ChatFragment extends Fragment {
    Button btnSubmit;
    EditText edName;
    private RecyclerView recyclerView;
    List<Person1> person1List=new ArrayList<>();
    RecyclerViewAdapter recyclerViewAdapter;


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        // Add the following lines to create RecyclerView
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

        person1List.add(new Person1("Hamza","Hello",getResources().getDrawable(R.drawable.image2),"11:10"));
        person1List.add(new Person1("Wasif","Hi",getResources().getDrawable(R.drawable.image3),"12:10"));
        person1List.add(new Person1("Ali","Pathan",getResources().getDrawable(R.drawable.image4),"1:10"));
        person1List.add(new Person1("Kamran","Hi!join me on whtsapp",getResources().getDrawable(R.drawable.image5),"9:15"));
        person1List.add(new Person1("Danish","Hello I am freelancer",getResources().getDrawable(R.drawable.image6),"3:20"));
        person1List.add(new Person1("Waleed","Hello I am a gamer",getResources().getDrawable(R.drawable.image7),"4:10"));
        person1List.add(new Person1("Saadat","I am a pro Coder",getResources().getDrawable(R.drawable.image8),"5:30"));
        person1List.add(new Person1("Kamran","I am a pro Gamer",getResources().getDrawable(R.drawable.image9),"6:10"));
        person1List.add(new Person1("Salman","I am a Scientist",getResources().getDrawable(R.drawable.image4),"8:00"));
        person1List.add(new Person1("Daniyal","I am a Manager",getResources().getDrawable(R.drawable.image2),"9:40"));
        recyclerViewAdapter= new RecyclerViewAdapter(person1List,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getContext()));
        recyclerView.setAdapter(recyclerViewAdapter);


        return view;
    }


}