package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which fruits are the main ingredients of the recipe */
public class TertiaryActivity_ingredients_fruits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_ingredients_fruits);

        String[] fruitsitems = {"Omija Jelly",
                "Plum Tea",
                "Boiled Pear",
                "Omija Fruit Salad",
                "Citron Fruit Salad",
                "Onesobyung",
                "Fruit Water Kimchi",
                "Korean Melon Kkakdugi",
                "A Plum Crop",
                "Citron Tea",
                "Dried Persimmon Walnut Wraps",
                "Gu Gi-Cha",
                "Jujube Tea",
                "Omija Hwachae",
                "Quince Tea",
                "Rajoy",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruitsitems);
        ListView listView = (ListView) findViewById(R.id.fruitslist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String fruitsitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_ingredients_fruits.this, fruitsitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}