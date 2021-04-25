package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which beef is the main ingredient of the recipe */
public class TertiaryActivity_ingredients_beef extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_ingredients_beef);

        String[] beefitems = {"Janggukbap",
                "Fish Tray",
                "Rice-Cake Soup",
                "Hot Spicy Meat Stew",
                "Short Rib Soup",
                "Beef-Bone Soup",
                "Tails Soup",
                "Seolleongtang",
                "Heat Chicken Stew",
                "Beef Stew",
                "Steamed Situation",
                "Braised Beef Ribs",
                "Braised Beef",
                "Grilled Short Rib Patties",
                "Grilled Beef Ribs",
                "Bulgogi",
                "Sub-San-Jeok",
                "Songi-San-Jeok",
                "Korean Style Raw Beef",
                "Boiled Beef Shank Slices",
                "Beef Jerky",
                "Beef Pyeony Salad",
                "Grilled Beef Brisket",
                "Bulgogi Stew",
                "Bulgogi Cold Salad",
                "Seasoned Green Onion Salad With Meat",
                "Bulgogi Webfoot Octopus Stew",
                "Steamed Back Ribs",
                "Steamed Spicy Ribs",
                "Beef Vegetable Roll",
                "Grilled Burdock Beef",
                "Shiitake Beef Brisket Doenjang Stew",
                "Beef Bulgogi",
                "Beef Radish Soup",
                "Stir-Fried Beef Rice Noodles",
                "Mille-Feuille-Nabe",
                "Back Rib Barbecue",
                "Beef Rice Balls",
                "Stir Fried Beef Bok Chung Oyster",
                "Braised Beef Wan",
                "Beef Cabbage Soup",
                "Beef Pancake",
                "Bomalguk",
                "Bone Soup",
                "Braised Beef Brisket",
                "Braised Short Ribs",
                "Bulgogi With Rice",
                "Bulnakjeongol",
                "Chupotang",
                "Crucible Bath",
                "Knee Cartilage Soup",
                "Ko Ji-Guk",
                "Korean Style Meatball",
                "La Galbi Jjim",
                "Liquor Soup",
                "Neubiani",
                "Ox Head Gukbap",
                "Paprika Beef Horse",
                "Perilla Taro Soup",
                "Pyeongyang Hot Pot",
                "Raw Beef Mixed With Rice",
                "Royal Tteokbokki",
                "Sagolguk",
                "Seonji Haejangguk",
                "Seonjitguk",
                "Spicy Braised Short Ribs",
                "Squid Bulgogi",
                "Stir-Fried Beef Cheonggyeongchae",
                "Stir-Fried Beef Cucumber",
                "Ttukbaegi Bulgogi",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, beefitems);
        ListView listView = (ListView) findViewById(R.id.beeflist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String beefitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_ingredients_beef.this, beefitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}