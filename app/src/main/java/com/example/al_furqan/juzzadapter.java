package com.example.al_furqan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class juzzadapter  extends RecyclerView.Adapter<juzzadapter.juzzviewholder>{
    Context context;

    public juzzadapter(Context context, ArrayList<juzzdata> list) {
        this.context = context;
        this.list = list;
    }

    ArrayList<juzzdata> list;
    @NonNull
    @Override
    public juzzviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.juzz,parent,false);
        return new juzzviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull juzzviewholder holder, int position) {
        holder.juzzname.setText(list.get(position).getJuzzname());
        holder.juzzarbic.setText(list.get(position).getJuzzarabic());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class juzzviewholder extends RecyclerView.ViewHolder{
        TextView juzzname;
        TextView juzzarbic;
        public juzzviewholder(@NonNull View itemView) {
            super(itemView);
            juzzname = itemView.findViewById(R.id.juzzname);
            juzzarbic = itemView.findViewById(R.id.juzzarabic);
        }
    }
}

