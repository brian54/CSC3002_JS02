package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Fooddescription_maindish extends AppCompatActivity {

    ImageView foodimageView;
    TextView foodtextView;

    /** A descriptive main dish menu with individual menu's photo and name */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddescription_maindish);

        foodimageView = findViewById(R.id.iv_maindish);
        foodtextView = findViewById(R.id.tv_maindish);

        Intent foodintent = getIntent();

        if(foodintent.getExtras() != null){
            String selectedName = foodintent.getStringExtra("name");
            int selectedImage = foodintent.getIntExtra("image",0);

            foodtextView.setText(selectedName);
            foodimageView.setImageResource(selectedImage);
        }
    }
}