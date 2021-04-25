package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which rice is the main ingredient of the recipe */
public class TertiaryActivity_ingredients_rice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_ingredients_rice);

        String[] riceitems = {"Brown Rice",
                "Barley Rice",
                "Pea Rice",
                "Black Bean Rice",
                "Red Bean Rice",
                "Ogokbap",
                "Chestnut Rice",
                "Nutrition Stone Pot Rice",
                "Sweet Potato Rice",
                "Kimchi Rice",
                "Sliced Rice",
                "Oyster Rice",
                "Chicken Hotbed",
                "Bibimbap",
                "Janggukbap",
                "Rice Roll",
                "White Porridge",
                "Red Bean Porridge",
                "Grilled Porridge",
                "Chicken Porridge",
                "Janggukjuk",
                "Oyster Porridge",
                "Abalone Porridge",
                "Black Sesame Porridge",
                "Songpyeon",
                "Boiled Pear",
                "Sikhye",
                "Onesobyung",
                "Five Grain Rice",
                "Grilled Radish Rice",
                "Rice With Seasoned Thistle",
                "Seaweed Abalone Porridge",
                "Sweet Rice Pancake",
                "Soybean Sauce",
                "Rice With Tuna Sashimi",
                "Assorted Ssambap",
                "Sea Cucumber Nurungji Soup",
                "Mungge Bibimbap",
                "Eel Nutrition Rice",
                "Kimchi Fried Rice",
                "Spam Mayo Rice With Rice",
                "Yeolmu Bibimbap",
                "Kkomak Bibimbap",
                "Stir-Fried Beef Rice Noodles",
                "Sweet And Sour Pork",
                "Beef Rice Balls",
                "Cramey Fried Tofu Rice Balls",
                "Abalone Dolsotbap",
                "Albap",
                "Bacon Rice Cake Skewers",
                "Bamboo Barrel Rice",
                "Bean Rice",
                "Bijibap",
                "Black-Bean-Sauce Rice",
                "Boiled Rice Porridge",
                "Buckwheat Rice",
                "Bulgogi With Rice",
                "Carrot Rice",
                "Chicken Curry Rice",
                "Chungmu Gimbap",
                "Corn Rice",
                "Crispy Rice Crust",
                "Cup Rice",
                "Egg Rice",
                "Eggplant Rice",
                "Fried Rice",
                "Fried Tofu Sushi",
                "Gijangbap",
                "Glutinous Rice",
                "Gondre Rice",
                "Grilled Rice Cake",
                "Honey Rice Cake",
                "Hot Pepper Paste Tuna Fried Rice",
                "Japchae Rice",
                "Joebap",
                "Jorangi Tteokguk",
                "Lotus Leaf Rice",
                "Mixed Grain Rice",
                "Mugwort Rice Cake",
                "Mukbap",
                "Mung Bean Rice",
                "Nurungji Chicken Soup",
                "Nurungjitang",
                "Oat Rice",
                "Omelet Rice",
                "Onion Egg Rice",
                "Ox Head Gukbap",
                "Oyster Rice Soup",
                "Pearl Bibimbap",
                "Pibab",
                "Pork And Rice Soup",
                "Potato Rice",
                "Ramen Rice",
                "Raw Beef Mixed With Rice",
                "Rice Ball",
                "Rice Burger",
                "Rice Cake Dumpling Soup",
                "Rice Topped With Eggs",
                "Rice Topped With Octopus",
                "Rice Tteokbokki",
                "Rice With Enoki Mushroom",
                "Rice With Grilled Pancake",
                "Rice With Squid",
                "Royal Tteokbokki",
                "Sanchae Bibimbap",
                "Seafood Nurungji Soup",
                "Seaweed Bibimbap",
                "Separate Rice Soup",
                "Shirutteok",
                "Shrimp Sweet Noodles Rice With Rice",
                "Sorghum Rice",
                "Sprout Bibimbap",
                "Ssambap",
                "Steamed Sea Squirt Bibimbap",
                "Stir-Fried Rice Cake",
                "Sweet Pumpkin Nutrition Rice",
                "Sweet Pumpkin Sikhye",
                "Tofu Rice",
                "Triangular Rolled-Rice Gimbap",
                "Vegetable Porridge",
                "White Rice",
                "Yakbap",
                "Yulmu Bap",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, riceitems);
        ListView listView = (ListView) findViewById(R.id.ricelist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String riceitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_ingredients_rice.this, riceitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}