package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which EPA, DHA is the main health benefit gain from the recipe */
public class TertiaryActivity_health_EPADHA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_health__e_p_a_d_h);

        String[] EPADHAitems = {"Cold Raw Fish Noodles",
                "Pine Nut Noodles",
                "Fish Dumpling",
                "Dried Pollack Soup",
                "Chochi Soup",
                "Cod Soup",
                "Yongbongtang",
                "Ecological Stew",
                "Salted Pollack Roe Stew",
                "Sea Bream Noodles",
                "Seafood Stew",
                "Steamed Monkfish",
                "Braised Hairtail Radish",
                "Braised Radish Mackerel",
                "Braised Fish",
                "Braised Early",
                "Grilled Oysters",
                "Grilled Mackerel",
                "Grilled Dried Pollack",
                "Grilled Hairtail",
                "Grilled Early Seasoning",
                "Braised Dried Anchovies",
                "Dried Pollack Stick Rice Gangjeong",
                "Stir-Fried Small Anchovy Nuts",
                "Stir-Fried Anchovy And Chili Paste",
                "Grilled Braised Spice With Spicy Sauce",
                "Grilled Kodari Seasoning",
                "Clear Soup With Cod",
                "Burdock Perilla Soup",
                "Braised Saury",
                "Rice With Tuna Sashimi",
                "Samchi Cracker",
                "Steamed Kodari",
                "Braised Bungeoppo",
                "Stir-Fried Perilla Sprouts",
                "Braised Clams",
                "Stir-Fried Red Pepper Paste With Dried Pollack",
                "Fried Yellow Croake",
                "Frozen Pollack Pancake",
                "Grilled Mackerel Soy Sauce",
                "Grilled Eel Yangyeom",
                "Bang-A-Po-Y",
                "Seasoned Dried Pollack",
                "Braised Pollack",
                "Cold Noodles With Pollack",
                "Dongtaejeon",
                "Doribangbangi",
                "Dried Pollack Hangover Soup",
                "Dried Pollack Salad",
                "Eojuk",
                "Galchi Pumpkin Soup",
                "Gazamijorim",
                "Grilled Herring",
                "Guamegi Raw Fish Salad",
                "Hot Pepper Paste Tuna Fried Rice",
                "Hwe Guksu",
                "Mushroom Perilla Soup",
                "Perilla Taro Soup",
                "Pollack Tofu Stew",
                "Spicy Fish Stew",
                "Steamed Dried Corvina",
                "Stir-Fried Anchovies",
                "Stir-Fried Pumpkin Tuna",
                "Tuna Bibimbap",
                "Tuna Kimchi Porridge",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, EPADHAitems);
        ListView listView = (ListView) findViewById(R.id.EPADHAlist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String EPADHAitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_health_EPADHA.this, EPADHAitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}