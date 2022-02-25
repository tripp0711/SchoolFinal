package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GalleryActivity2 extends AppCompatActivity {
    ImageView imageView3;
    ScaleGestureDetector objScaleGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery2);
        Button Feed = (Button) findViewById(R.id.Feed);
        Button Map1 = (Button) findViewById(R.id.Map1);
        imageView3 = (ImageView) findViewById(R.id.imageView3);


        Map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity2();
            }


        });
        Feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openFeedActivity2();
            }


        });


    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openFeedActivity2() {
        Intent intent = new Intent(this, FeedActivity2.class);
        startActivity(intent);
    }


    }

