package com.example.homework33;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaterLanguage extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Information> info;

    public AdaterLanguage(ArrayList<Information> languages) {
        this.info = languages;

    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      Information information = info.get(position);
        holder.imageView.setImageResource(information.getImage());
        holder.textView.setText(information.getLanguage());




    }

    @Override
    public int getItemCount() {
        return info.size();
    }
}
