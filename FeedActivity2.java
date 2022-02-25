package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeedActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed2);

        Button Map1= (Button) findViewById(R.id.Map1);
        Button Gallery= (Button) findViewById(R.id.Gallery);

        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openGalleryActivity2();
            }


        });
        Map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity2();
            }


        });


    }
    public void openGalleryActivity2() {
        Intent intent = new Intent(this, GalleryActivity2.class);
        startActivity(intent);
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}

