package com.example.al_furqan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class foodadapter extends RecyclerView.Adapter<foodadapter.foodviewholder>{
    Context context;
    ArrayList<fooddata> list;
    public foodadapter(Context context, ArrayList<fooddata> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public foodviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food,parent,false);
        return new foodviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodviewholder holder, int position) {
        holder.heading.setText(list.get(position).getHeading());
        holder.duaar.setText(list.get(position).getDuainarabic());
        holder.duaeng.setText(list.get(position).getDuainenglish());
        holder.tra.setText(list.get(position).getTranslation());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class foodviewholder extends RecyclerView.ViewHolder{
        TextView duaar,duaeng,tra,heading;

        public foodviewholder(@NonNull View itemView) {
            super(itemView);
            heading = itemView.findViewById((R.id.duaheading));
            duaar = itemView.findViewById(R.id.duaar);
            duaeng = itemView.findViewById(R.id.duaeng);
            tra = itemView.findViewById(R.id.tra);
        }
    }
}
