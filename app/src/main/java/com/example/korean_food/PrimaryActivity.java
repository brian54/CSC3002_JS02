package com.example.korean_food;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimaryActivity extends AppCompatActivity {
    private List<String> items = Arrays.asList("Bibimbap", "Kimchi");

    private TextView tv_primary_name;
    private ImageButton ib_basedish;
    private ImageButton ib_maindish;
    private ImageButton ib_sidedish;
    private ImageButton ib_soup;
    private ImageButton ib_snack;
    private ImageButton ib_beverage;
    private ImageButton ib_vegan;
    private ImageButton ib_settings;
    private BottomNavigationView bottomNavigationView; //Bottom Navigation View
    private FragmentManager fm;
    private FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);


        tv_primary_name = findViewById(R.id.tv_primary_name);

        Intent intent = getIntent();
        String str_name = intent.getStringExtra("str_name");

        tv_primary_name.setText(str_name);

        ib_basedish = findViewById(R.id.ib_basedish);
        ib_basedish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_basedish = new Intent(PrimaryActivity.this, SecondaryActivity_basedish.class);
                startActivity(intent_basedish); // Transition from PrimaryActivity to SecondaryActivity_basedish
            }
        });

        ib_maindish = findViewById(R.id.ib_maindish);
        ib_maindish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_maindish = new Intent(PrimaryActivity.this, SecondaryActivity_maindish.class);
                startActivity(intent_maindish); // Transition from PrimaryActivity to SecondaryActivity_maindish
            }
        });

        ib_sidedish = findViewById(R.id.ib_sidedish);
        ib_sidedish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_sidedish = new Intent(PrimaryActivity.this, SecondaryActivity_sidedish.class);
                startActivity(intent_sidedish); // Transition from PrimaryActivity to SecondaryActivity_sidedish
            }
        });

        ib_soup = findViewById(R.id.ib_soup);
        ib_soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_soup = new Intent(PrimaryActivity.this, SecondaryActivity_soup.class);
                startActivity(intent_soup); // Transition from PrimaryActivity to SecondaryActivity_soup
            }
        });

        ib_soup = findViewById(R.id.ib_soup);
        ib_soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_soup = new Intent(PrimaryActivity.this, SecondaryActivity_soup.class);
                startActivity(intent_soup); // Transition from PrimaryActivity to SecondaryActivity_soup
            }
        });

        ib_snack = findViewById(R.id.ib_snack);
        ib_snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_snack = new Intent(PrimaryActivity.this, SecondaryActivity_snack.class);
                startActivity(intent_snack); // Transition from PrimaryActivity to SecondaryActivity_snack
            }
        });

        ib_beverage = findViewById(R.id.ib_beverage);
        ib_beverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_beverage = new Intent(PrimaryActivity.this, SecondaryActivity_beverage.class);
                startActivity(intent_beverage); // Transition from PrimaryActivity to SecondaryActivity_beverage
            }
        });

        ib_vegan = findViewById(R.id.ib_vegan);
        ib_vegan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_vegan = new Intent(PrimaryActivity.this, SecondaryActivity_vegan.class);
                startActivity(intent_vegan); // Transition from PrimaryActivity to SecondaryActivity_vegan
            }
        });

        ib_settings = findViewById(R.id.ib_settings);
        ib_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_settings = new Intent(PrimaryActivity.this, SecondaryActivity_settings.class);
                startActivity(intent_settings); // Transition from PrimaryActivity to SecondaryActivity_settings
            }
        });


    }


    private String getresult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            sb.append(item);
            if (i != items.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }


}