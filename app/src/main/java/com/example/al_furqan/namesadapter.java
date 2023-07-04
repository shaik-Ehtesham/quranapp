package com.example.al_furqan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class namesadapter extends RecyclerView.Adapter<namesadapter.nameviewholder>{
    Context context;
    ArrayList<namesdata> list;

    public namesadapter(Context context, ArrayList<namesdata> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public nameviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.names,parent,false);

        return new nameviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull nameviewholder holder, int position) {
        holder.arname.setText(list.get(position).getArabicName());
        holder.engname.setText(list.get(position).getEnglishName());
        holder.trans.setText(list.get(position).getTranslation());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class nameviewholder extends RecyclerView.ViewHolder{
        TextView arname,engname,trans;

        public nameviewholder(@NonNull View itemView) {
            super(itemView);
            arname = itemView.findViewById(R.id.arname);
            engname = itemView.findViewById(R.id.engname);
            trans = itemView.findViewById(R.id.trans);
        }
    }
}
