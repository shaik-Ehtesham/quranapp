package com.example.al_furqan;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class prophetsadapter extends RecyclerView.Adapter<prophetsadapter.prophetviewholder>{
    ArrayList<prophetsdata> list;
    Context context;
    private prophetsinterface listener;

    public prophetsadapter(ArrayList<prophetsdata> list, Context context, prophetsinterface listener) {
        this.list = list;
        this.context = context;
        this.listener = listener;
    }





    @NonNull
    @Override
    public prophetviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.prophets,parent,false);
        return new prophetviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull prophetviewholder holder, int position) {
        holder.prophet.setText(list.get(position).getProphetName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class prophetviewholder extends RecyclerView.ViewHolder{
        TextView prophet;

        public prophetviewholder(@NonNull View itemView) {
            super(itemView);
            prophet = itemView.findViewById(R.id.prophet);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            });
        }
    }
}
