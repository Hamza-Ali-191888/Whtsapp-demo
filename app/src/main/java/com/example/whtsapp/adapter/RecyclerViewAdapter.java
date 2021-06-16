package com.example.whtsapp.adapter;

import android.app.Person;
import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
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

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<Person1> personList;
    Context context;

    public RecyclerViewAdapter(List<Person1> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chatitem,parent,false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person1 person=personList.get(position);
        holder.txtPersonName.setText(person.getName());
        holder.txtMessage.setText(person.getMessage());
        holder.profilePic.setImageDrawable(person.getImage());
        holder.Time.setText(person.getTime());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        TextView txtPersonName,txtMessage;
        ImageView profilePic;
        TextView Time;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            txtPersonName=itemView.findViewById(R.id.txtPerson_Name);
            txtMessage=itemView.findViewById(R.id.txtmessage);
            Time=itemView.findViewById(R.id.Time);
            profilePic = itemView.findViewById(R.id.p_img);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,personList.get(getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
        }
    }

}


