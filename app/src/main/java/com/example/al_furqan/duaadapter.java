package com.example.al_furqan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class duaadapter extends RecyclerView.Adapter<duaadapter.duaviewholder>{
    Context context;
    ArrayList<duasdata> list ;
    private duainterface listener;

    public duaadapter(Context context, ArrayList<duasdata> list,duainterface listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public duaviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dua,parent,false);
        return new duaviewholder(view);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(@NonNull duaviewholder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.textView.setText(list.get(position).getText());



    }

    public class duaviewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public duaviewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onDuaClick(position);
                    }
                }
            });
        }
    }
}
