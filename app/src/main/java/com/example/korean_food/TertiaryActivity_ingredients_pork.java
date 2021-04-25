package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which pork is the main ingredient of the recipe */
public class TertiaryActivity_ingredients_pork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_ingredients_pork);

        String[] porkitems = {"Dumpling Soup",
                "Dumpling Noodles",
                "Gyua Statue",
                "Ae Stew",
                "Opening Soup",
                "Steamed Pork Ribs",
                "Jeyuk Bokkeum",
                "Neoviani",
                "Grilled Spicy Pork",
                "Bindaetteok",
                "Pyeonyuk",
                "Jokpyeon",
                "Braised Burdock Pork Roll",
                "Squid And Pork Belly Bulgogi",
                "Pork Back-Bone Stew",
                "Grilled Pork Belly",
                "Ham Tofu Pancake",
                "The Durbbakan Wrap",
                "Spam Mayo Rice With Rice",
                "Spicy Sausage Stew",
                "Pork Kimchi Stew",
                "Steamed Pork Belly Kimchi Roll",
                "Pan-Fried Pork Belly Host Food",
                "Sweet And Sour Pork",
                "Black Bean Noodles Tteokbokki",
                "Stir-Fried Pork With Soy Sauce",
                "Bacon Rice Cake Skewers",
                "Black-Bean-Sauce Noodles",
                "Black-Bean-Sauce Rice",
                "Boiled Pork",
                "Bossam",
                "Braised Back Rib Kimchi",
                "Braised Pork Garlic",
                "Braised Pork Neck",
                "Cheese Back Ribs",
                "Chives Bacon Mallet",
                "Dongpa Yuk",
                "Dulchigi",
                "Dumpling Hot Pot",
                "Dumpling",
                "Five-Spiced Pork",
                "Grilled Pork Ginger",
                "Grilled Pork Ribs",
                "Grilled Short Ribs",
                "Grilled Tripe Soy Sauce",
                "Grilled Tripe",
                "Naejangtang",
                "Pork And Hot Pepper Paste Stew",
                "Pork And Rice Soup",
                "Pork Belly Gangjeong",
                "Pork Cutlet",
                "Red Pepper Paste Pork Belly",
                "Samhap",
                "Sausage Soy Sauce Braised",
                "Separate Rice Soup",
                "Soy Sauce Pork Bulgogi",
                "Squid Duruchigi",
                "Steamed Sausage Bean Sprouts",
                "Stir-Fried Pork Belly",
                "Stir-Fried Soondae",
                "Stir-Fried Spam Potato",
                "Stir-Fried Spicy Stir-Fried Chili Pepper Ham",
                "Stir-Fried Tripe",
                "Sundae Soup",
                "Sweet And Sour Chicken",
                "Wanjatang",
                "Yushan Seul",
                "Zelkova Duruchigi",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, porkitems);
        ListView listView = (ListView) findViewById(R.id.porklist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String porkitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_ingredients_pork.this, porkitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}