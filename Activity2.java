package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button Feed= (Button) findViewById(R.id.Feed);
        Button Gallery= (Button) findViewById(R.id.Gallery);

        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                   openGalleryActivity2();
                }


        });
        Feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openFeedActivity2();
            }


        });


    }
    public void openGalleryActivity2() {
        Intent intent = new Intent(this, GalleryActivity2.class);
        startActivity(intent);
    }
    public void openFeedActivity2() {
        Intent intent = new Intent(this, FeedActivity2.class);
        startActivity(intent);
    }



    }
