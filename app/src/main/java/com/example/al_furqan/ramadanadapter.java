package com.example.al_furqan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ramadanadapter extends RecyclerView.Adapter<ramadanadapter.ramadanviewholder> {
    public ramadanadapter(Context context, ArrayList<ramadanduas> list) {
        this.context = context;
        this.list = list;
    }

    Context context;
    ArrayList<ramadanduas> list;


    @NonNull
    @Override
    public ramadanviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food,parent,false);
        return new ramadanviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ramadanviewholder holder, int position) {
        holder.rheading.setText(list.get(position).getRheading());
        holder.rarabic.setText(list.get(position).getRinarabic());
        holder.renglish.setText(list.get(position).getRinenglish());
        holder.rtranslate.setText(list.get(position).getRtranslate());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ramadanviewholder extends RecyclerView.ViewHolder{
        TextView rheading,rarabic,renglish,rtranslate;

        public ramadanviewholder(@NonNull View itemView) {
            super(itemView);
            rheading = itemView.findViewById(R.id.duaheading);
            rarabic = itemView.findViewById(R.id.duaar);
            renglish = itemView.findViewById(R.id.duaeng);
            rtranslate = itemView.findViewById(R.id.tra);
        }
    }



}
