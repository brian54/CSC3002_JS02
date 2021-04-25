package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Fooddescription_snack extends AppCompatActivity {

    ImageView foodimageView;
    TextView foodtextView;

    /** A descriptive snack menu with individual menu's photo and name */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddescription_snack);

        foodimageView = findViewById(R.id.iv_snack);
        foodtextView = findViewById(R.id.tv_snack);

        Intent foodintent = getIntent();

        if(foodintent.getExtras() != null){
            String selectedName = foodintent.getStringExtra("name");
            int selectedImage = foodintent.getIntExtra("image",0);

            foodtextView.setText(selectedName);
            foodimageView.setImageResource(selectedImage);
        }
    }
}