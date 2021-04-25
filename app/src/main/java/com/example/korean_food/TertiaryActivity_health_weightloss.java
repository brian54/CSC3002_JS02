package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which weight loss is the main health benefit gain from the recipe */
public class TertiaryActivity_health_weightloss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_health_weightloss);

        String[] weightlossitems = {"Brown Rice",
                "Barley Rice",
                "White Porridge",
                "Sea Mustard Soup",
                "Cold Cucumber Soup",
                "Seasoned Acorns",
                "Seasoned Buckwheat Cake",
                "Braised Beans",
                "Pickled Garlic Pickles",
                "Ginger Tea",
                "Acorn Pancake",
                "Braised Konjac",
                "Pickled Onions",
                "Seasoned Cabbage",
                "Soybean Paste Soup With Vegetables",
                "Seaweed Cucumber Cold Soup",
                "Fruit Salad",
                "Seaweed Vinegar Sashimi",
                "Stir-Fried Eggplant",
                "Seasoned Green Laver",
                "Burdock Japchae",
                "Stir-Fried Onions",
                "Seasoned Seaweed With Vinegar",
                "Seasoned Onion Cucumbers",
                "Chives Semi Kimchi",
                "Acorn Jelly",
                "Acorn Jelly Salad",
                "Barley Tea",
                "Boiled Rice Porridge",
                "Chinese Cabbage Soup",
                "Corn Tea",
                "Cucumber Pickle",
                "Cucumber Salad",
                "Dried Radish Greens",
                "Oiseon",
                "Onion Pickle",
                "Perilla Leaf Kimchi",
                "Pickled Onion",
                "Radish Ssammari",
                "Seaweed Cold Soup",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, weightlossitems);
        ListView listView = (ListView) findViewById(R.id.weightlosslist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String weightlossitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_health_weightloss.this, weightlossitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}