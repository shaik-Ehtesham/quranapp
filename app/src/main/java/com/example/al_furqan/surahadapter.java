package com.example.al_furqan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class surahadapter  extends RecyclerView.Adapter<surahadapter.surahviewholder>{
    Context context;
    ArrayList<surahdata> list;
    private ArrayList<surahdata> filterList;

    public surahadapter(Context context, ArrayList<surahdata> list) {
        this.context = context;
        this.list = list;
    }
    public void setFilterList(ArrayList<surahdata> filterlist)
    {
        this.list = filterlist;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public surahviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.surah,parent,false);
        return new surahviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull surahviewholder holder, int position) {
        holder.surahname.setText(list.get(position).getSurahname());
        holder.suraharbic.setText(list.get(position).getSuraharabic());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void filterList(ArrayList<surahdata> filterList)
    {
        list = filterList;
        notifyDataSetChanged();

    }

    public class surahviewholder extends RecyclerView.ViewHolder{
        TextView surahname;
        TextView suraharbic;
        public surahviewholder(@NonNull View itemView) {
            super(itemView);
            surahname = itemView.findViewById(R.id.surahname);
            suraharbic = itemView.findViewById(R.id.suraharabic);
        }
    }
}

