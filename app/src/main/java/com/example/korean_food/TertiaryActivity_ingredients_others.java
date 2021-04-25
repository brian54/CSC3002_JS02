package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which other category of ingredients are the main ingredients of the recipe */
public class TertiaryActivity_ingredients_others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_ingredients_others);

        String[] othersitems = {"Chicken Hotbed",
                "Chicken Porridge",
                "Chicken Noodle",
                "Samgyetang",
                "Yongbongtang",
                "Heat Chicken Stew",
                "Imja Water Soup",
                "Cold Chicken Stew",
                "Steamed Chicken",
                "Stir-Fried Chicken Ribs",
                "Grilled Chicken",
                "Persimmon Punch",
                "Andong Steamed Chicken",
                "Seasoned Chicken Breasts With Pine Nut Sauce",
                "Tricolored Egg Roll",
                "Steamed Earthenware Egg",
                "Seafood Egg Soup",
                "Chicken Stew",
                "Pollack Egg Roll",
                "Seasoned Duck",
                "Chicken Breast Mustard Salad",
                "Braised Quarigo Chili Eggs",
                "Braised Egg",
                "Braised Quail Eggs",
                "Braised Spicy Chicken",
                "Charcoal Spicy Stir-Fried Chicken",
                "Chicken Curry Rice",
                "Chicken Kebabs",
                "Chicken Soup",
                "Deep-Fried Chicken In Hot Pepper Sauce",
                "Egg Dumpling",
                "Egg Rice",
                "Egg Soup",
                "Fried Chicken",
                "Jjimdak",
                "Mung Bean Samgyetang",
                "Nurungji Chicken Soup",
                "Omelet Rice",
                "Pheasant Soup",
                "Rice Topped With Eggs",
                "Roast Duck",
                "Rolled Omelet",
                "Seasoned Duck-Buchu",
                "Seasoned Spicy Chicken",
                "Shark's Dome Exhaust",
                "Shrimp Soft Tofu Egg Soup",
                "Spicy Chicken Soup With Rice",
                "Spicy Grilled Chicken",
                "Spicy Stir-Fried Chicken With Cheese",
                "Ssanghwa-Cha",
                "Steamed Eggs",
                "Stir-Fried Bean Sprouts And Eggs",
                "Stir-Fried Chicken Breast Mushroom",
                "Stir-Fried Chicken Breast Perilla Leaves",
                "Stir-Fried Chicken Feet",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, othersitems);
        ListView listView = (ListView) findViewById(R.id.otherslist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String othersitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_ingredients_others.this, othersitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}