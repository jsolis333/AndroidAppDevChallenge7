package com.oackcliffsoftworks.sevenimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button displayImage;
    ImageView pictureImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       displayImage = findViewById(R.id.button);

        displayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pictureImage = findViewById(R.id.image_Viewer);
                pictureImage.setVisibility(View.VISIBLE);
                pictureImage.setImageResource(R.drawable.room);

                displayImage.setText(R.string.hide_button);

                displayImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pictureImage.setVisibility(View.INVISIBLE);
                    }
                });


            }
        });
    }
}
