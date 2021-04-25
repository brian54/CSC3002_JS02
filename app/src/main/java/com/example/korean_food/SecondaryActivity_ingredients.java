package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/** Photo lists with a recipe's category of ingredients to let user to choose preferred ingredients*/
public class SecondaryActivity_ingredients extends AppCompatActivity {

    private ImageButton ib_ingredients_rice;
    private ImageButton ib_ingredients_grains;
    private ImageButton ib_ingredients_beef;
    private ImageButton ib_ingredients_pork;
    private ImageButton ib_ingredients_fish;
    private ImageButton ib_ingredients_vegetables;
    private ImageButton ib_ingredients_fruits;
    private ImageButton ib_ingredients_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_ingredients);

        ib_ingredients_rice = findViewById(R.id.ib_ingredients_rice);
        ib_ingredients_rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_rice = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_rice.class);
                startActivity(intent_ingredients_rice); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_rice
            }
        });

        ib_ingredients_grains = findViewById(R.id.ib_ingredients_grains);
        ib_ingredients_grains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_grains = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_grains.class);
                startActivity(intent_ingredients_grains); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_grains
            }
        });

        ib_ingredients_beef = findViewById(R.id.ib_ingredients_beef);
        ib_ingredients_beef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_beef = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_beef.class);
                startActivity(intent_ingredients_beef); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_beef
            }
        });

        ib_ingredients_pork = findViewById(R.id.ib_ingredients_pork);
        ib_ingredients_pork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_pork = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_pork.class);
                startActivity(intent_ingredients_pork); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_pork
            }
        });

        ib_ingredients_fish = findViewById(R.id.ib_ingredients_fish);
        ib_ingredients_fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_fish = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_fish.class);
                startActivity(intent_ingredients_fish); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_fish
            }
        });

        ib_ingredients_vegetables = findViewById(R.id.ib_ingredients_vegetables);
        ib_ingredients_vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_vegetables = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_vegetables.class);
                startActivity(intent_ingredients_vegetables); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_vegetables
            }
        });

        ib_ingredients_fruits = findViewById(R.id.ib_ingredients_fruits);
        ib_ingredients_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_fruits = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_fruits.class);
                startActivity(intent_ingredients_fruits); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_fruits
            }
        });

        ib_ingredients_others = findViewById(R.id.ib_ingredients_others);
        ib_ingredients_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ingredients_others = new Intent(SecondaryActivity_ingredients.this, TertiaryActivity_ingredients_others.class);
                startActivity(intent_ingredients_others); // Transition from SecondaryActivity_ingredients to TertiaryActivity_ingredients_others
            }
        });
    }
}