package com.example.avalbekov_omurbek_3_hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textViewName, textViewDescription, textViewPrice;
    ImageView image, imageViewZvezda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        findById();
        onBind();

    }

    private void findById(){
        textViewName = findViewById(R.id.text_view_name);
        textViewDescription = findViewById(R.id.text_view_description);
        textViewPrice = findViewById(R.id.text_view_price);
        image =findViewById(R.id.image_view);
        imageViewZvezda = findViewById(R.id.image_view_zvezda);
    }

    public void onBind(){
        Watch watch = (Watch) getIntent().getSerializableExtra("watch");
        textViewName.setText(watch.getName());
        textViewDescription.setText(watch.getDescription());
        textViewPrice.setText(watch.getPrice());
        image.setImageResource(watch.getImage());
        imageViewZvezda.setImageResource(watch.getZvezda());
    }

}