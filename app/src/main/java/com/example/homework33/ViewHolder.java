package com.example.homework33;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder extends RecyclerView.ViewHolder {
    final ImageView imageView;
    final TextView textView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.language_tv);
        imageView=itemView.findViewById(R.id.image);

    }
    
   /* public void onBind(String languages, int image){
        textView.setText(languages);
        imageView.setImageResource(image);

    }*/


}
