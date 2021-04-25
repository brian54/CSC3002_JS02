package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which low sugar and salt is the main health benefit gain from the recipe */
public class TertiaryActivity_health_lowsugarandsalt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_health_lowsugarandsalt);

        String[] lowsugarandsaltitems = {"Brown Rice",
                "Barley Rice",
                "Pea Rice",
                "Black Bean Rice",
                "Red Bean Rice",
                "Ogokbap",
                "Chestnut Rice",
                "Nutrition Stone Pot Rice",
                "Sweet Potato Rice",
                "Sliced Rice",
                "Bean Sprout Rice",
                "Oyster Rice",
                "White Porridge",
                "Mung Bean Porridge",
                "Bean Porridge",
                "Red Bean Porridge",
                "Pine Nut Porridge",
                "Jujube Porridge",
                "Grilled Porridge",
                "Zucchini Porridge",
                "Pumpkin Porridge",
                "Chicken Porridge",
                "Janggukjuk",
                "Oyster Porridge",
                "Abalone Porridge",
                "Black Sesame Porridge",
                "Tarak Porridge",
                "Dumpling Noodles",
                "Gyua Statue",
                "Guljeon",
                "Pancake Shrimp Pancake",
                "Seafood Pajeon",
                "Potato Pancake",
                "Sesame Leaf Pancake",
                "Red Pepper Pancake",
                "Zucchini Pancake",
                "Before Lotus Root",
                "Mushroom Pancake",
                "Bindaetteok",
                "Sub-San-Jeok",
                "Songi-San-Jeok",
                "Boiled Beef Shank Slices",
                "Pyeonyuk",
                "Jokpyeon",
                "Beef Jerky",
                "Kim Bu-Gak",
                "Knot Rice Bowl",
                "Chalsujubukkumi",
                "Hwajeon",
                "Gyeongdan",
                "Danja",
                "Yulan",
                "Bamcho",
                "Jujube Grass",
                "Omija Jelly",
                "Chives Pancake",
                "Grilled Beef Brisket",
                "Acorn Pancake",
                "Cheongpo Mukjeon",
                "Corn Pancake",
                "Green Bean Pancake",
                "Bingtteok",
                "Five Grain Rice",
                "Grilled Radish Rice",
                "Rice With Seasoned Thistle",
                "Seaweed Abalone Porridge",
                "Fruit Salad",
                "Green Laver Pancake",
                "Grilled Pork Belly",
                "Wheat Wrap",
                "Eel Nutrition Rice",
                "Steamed Sweet Pumpkin",
                "Spam Mayo Rice With Rice",
                "Frozen Pollack Pancake",
                "Albap",
                "Bamboo Barrel Rice",
                "Bean Rice",
                "Black Rice",
                "Boiled Pork",
                "Bossam",
                "Carrot Rice",
                "Dried Radish Greens",
                "Dried Radish Salad",
                "Gondre Rice",
                "Joebap",
                "Jujube Tea",
                "Lotus Leaf Rice",
                "Mixed Grain Rice",
                "Potato Rice",
                "Powder Made Of Mixed Grains",
                "Puffed Rice",
                "Quince Tea",
                "Spring Roll",
                "Sprout Bibimbap",
                "Ssambap",
                "Tofu Rice",
                "White Rice",
                "Yulmu Bap",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lowsugarandsaltitems);
        ListView listView = (ListView) findViewById(R.id.lowsugarandsaltlist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String lowsugarandsaltitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_health_lowsugarandsalt.this, lowsugarandsaltitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}