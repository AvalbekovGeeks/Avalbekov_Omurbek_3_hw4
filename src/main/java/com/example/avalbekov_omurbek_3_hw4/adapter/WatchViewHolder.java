package com.example.avalbekov_omurbek_3_hw4.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avalbekov_omurbek_3_hw4.R;
import com.example.avalbekov_omurbek_3_hw4.Watch;

public class WatchViewHolder extends RecyclerView.ViewHolder {
    TextView textViewName, textViewDescription, textViewPrice;
    ImageView image, imageViewZvezda;

    public WatchViewHolder(@NonNull View itemView) {
        super(itemView);
        findById();
    }

    private void findById(){
        textViewName = itemView.findViewById(R.id.text_view_name);
        textViewDescription = itemView.findViewById(R.id.text_view_description);
        textViewPrice = itemView.findViewById(R.id.text_view_price);
        image = itemView.findViewById(R.id.image_view);
        imageViewZvezda = itemView.findViewById(R.id.image_view_zvezda);
    }

    public void onBind(Watch watch){
        textViewName.setText(watch.getName());
        textViewDescription.setText(watch.getDescription());
        textViewPrice.setText(watch.getPrice());
        image.setImageResource(watch.getImage());
        imageViewZvezda.setImageResource(watch.getZvezda());
    }

}
