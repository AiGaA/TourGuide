package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by AiGa on 2017.06.28..
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        int imageId = extras.getInt("image");
        ImageView image = (ImageView) findViewById(R.id.detail_image);
        image.setImageResource(imageId);


        final String name = intent.getStringExtra("name");
        TextView placeName = (TextView) findViewById(R.id.place_name);
        placeName.setText(name);


        final String about = intent.getStringExtra("about");
        TextView aboutDetail = (TextView) findViewById(R.id.detail_about);
        aboutDetail.setText(about);

    }
}
