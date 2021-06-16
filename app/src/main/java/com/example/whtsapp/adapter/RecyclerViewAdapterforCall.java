package com.example.whtsapp.adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whtsapp.Model.Person1;
import com.example.whtsapp.R;

import java.util.List;

public class RecyclerViewAdapterforCall extends  RecyclerView.Adapter<RecyclerViewAdapterforCall.ViewHolder> {
    List<Person1> personList;
    Context context;

    public RecyclerViewAdapterforCall(List<Person1> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull

    @Override
    public RecyclerViewAdapterforCall.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.callitem,parent,false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person1 person=personList.get(position);
        holder.txtPersonName.setText(person.getName());
        holder.txtMessage.setText(person.getMessage());
        holder.profilepic.setImageDrawable(person.getImage());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        TextView txtPersonName,txtMessage;
        ImageView profilepic;

        TextView Time;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            txtPersonName=itemView.findViewById(R.id.txtPerson_Name);
            txtMessage=itemView.findViewById(R.id.txtmessage);
            profilepic = itemView.findViewById(R.id.p_img);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,personList.get(getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
        }
    }

}


