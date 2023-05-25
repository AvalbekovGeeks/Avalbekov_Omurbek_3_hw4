package com.example.avalbekov_omurbek_3_hw4.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avalbekov_omurbek_3_hw4.R;
import com.example.avalbekov_omurbek_3_hw4.Watch;

import java.util.ArrayList;

public class WatchAdapter extends RecyclerView.Adapter<WatchViewHolder> {

    ArrayList<Watch> myArrayList;
    OnItemClick detailClick;

    public WatchAdapter(ArrayList<Watch> arrayList, OnItemClick onItemClick) {
        myArrayList = arrayList;
        detailClick = onItemClick;
    }

    @NonNull
    @Override
    public WatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WatchViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_watch, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WatchViewHolder holder, int position) {
        holder.onBind(myArrayList.get(position));
        holder.itemView.setOnClickListener(view -> {detailClick.onItemClick(myArrayList.get(position));});

    }

    @Override
    public int getItemCount() {
        return myArrayList.size();
    }
}
