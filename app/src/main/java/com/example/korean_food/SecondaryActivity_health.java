package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/** Photo lists with health related category of recipes to help individual's health concerns*/
public class SecondaryActivity_health extends AppCompatActivity {

    private ImageButton ib_weightloss;
    private ImageButton ib_highprotien;
    private ImageButton ib_lowsugarandsalt;
    private ImageButton ib_richvitamin;
    private ImageButton ib_richfibre;
    private ImageButton ib_EPADHA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_health);

        ib_weightloss = findViewById(R.id.ib_weightloss);
        ib_weightloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_health_weightloss = new Intent(SecondaryActivity_health.this, TertiaryActivity_health_weightloss.class);
                startActivity(intent_health_weightloss); // Transition from SecondaryActivity_health to TertiaryActivity_health_weightloss
            }
        });

        ib_highprotien = findViewById(R.id.ib_highprotien);
        ib_highprotien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_health_highprotein = new Intent(SecondaryActivity_health.this, TertiaryActivity_health_highprotein.class);
                startActivity(intent_health_highprotein); // Transition from SecondaryActivity_health to TertiaryActivity_health_highprotein
            }
        });

        ib_lowsugarandsalt = findViewById(R.id.ib_lowsugerandsalt);
        ib_lowsugarandsalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_health_lowsugarandsalt = new Intent(SecondaryActivity_health.this, TertiaryActivity_health_lowsugarandsalt.class);
                startActivity(intent_health_lowsugarandsalt); // Transition from SecondaryActivity_health to TertiaryActivity_health_lowsugarandsalt
            }
        });

        ib_richvitamin = findViewById(R.id.ib_richvitamin);
        ib_richvitamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_health_richvitamin = new Intent(SecondaryActivity_health.this, TertiaryActivity_health_richvitamin.class);
                startActivity(intent_health_richvitamin); // Transition from SecondaryActivity_health to TertiaryActivity_health_richvitamin
            }
        });

        ib_richfibre = findViewById(R.id.ib_richfibre);
        ib_richfibre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_health_richfibre = new Intent(SecondaryActivity_health.this, TertiaryActivity_health_richfibre.class);
                startActivity(intent_health_richfibre); // Transition from SecondaryActivity_health to TertiaryActivity_health_richfibre
            }
        });

        ib_EPADHA = findViewById(R.id.ib_EPADHA);
        ib_EPADHA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_health_EPADHA = new Intent(SecondaryActivity_health.this, TertiaryActivity_health_EPADHA.class);
                startActivity(intent_health_EPADHA); // Transition from SecondaryActivity_health to TertiaryActivity_health_EPADHA
            }
        });

    }
}