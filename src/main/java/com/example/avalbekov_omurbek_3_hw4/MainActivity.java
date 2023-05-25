package com.example.avalbekov_omurbek_3_hw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.avalbekov_omurbek_3_hw4.adapter.OnItemClick;
import com.example.avalbekov_omurbek_3_hw4.adapter.WatchAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {
    ArrayList<Watch> arrayListAll = new ArrayList<>();
    WatchAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eddNewWatch();
        adapter = new WatchAdapter(arrayListAll,this);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }

    public void eddNewWatch() {
        arrayListAll.add(new Watch("BBB","Very expensive watch !!!", R.drawable.w1,"999 $",R.drawable.zvezda));
        arrayListAll.add(new Watch("CCC","Very not expensive watch !!", R.drawable.w2,"998 $",R.drawable.zvezda1));
        arrayListAll.add(new Watch("DDD","Not very expensive watch !", R.drawable.w3,"997 $",R.drawable.zvezda2));
        arrayListAll.add(new Watch("EEE","Not very expensive watch !", R.drawable.w4,"9 $",R.drawable.zvezda));
        arrayListAll.add(new Watch("SSS","Not very expensive watch !", R.drawable.w5,"994 $",R.drawable.zvezda1));
        arrayListAll.add(new Watch("AAA","Not very expensive watch !", R.drawable.w6,"94 $",R.drawable.zvezda2));
  }

    @Override
    public void onItemClick(Watch watch) {
        Intent intent= new Intent(this,DetailActivity.class);
        intent.putExtra("watch", watch);
        startActivity(intent);

    }
}