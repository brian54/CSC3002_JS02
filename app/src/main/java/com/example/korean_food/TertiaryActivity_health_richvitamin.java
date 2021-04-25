package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/** List of recipes which rich in vitamin is the main health benefit gain from the recipe */
public class TertiaryActivity_health_richvitamin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary_health_richvitamin);

        String[] richvitaminitems = {"Brown Rice",
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
                "Bean Sprout Rice",
                "Bibimbap",
                "Rice Roll",
                "Jujube Porridge",
                "Grilled Porridge",
                "Zucchini Porridge",
                "Pumpkin Porridge",
                "Black Sesame Porridge",
                "Tarak Porridge",
                "Bibim Noodles",
                "Spicy Buckwheat Noodles",
                "Cold Noodles With Cold Buckwheat Noodles",
                "Dumpling Soup",
                "Sujebi",
                "Ae Stew",
                "Seaweed Soup",
                "Sea Mustard Soup",
                "Radish Paste Soup",
                "Bean Sprout Soup",
                "Toran Stew",
                "Opening Soup",
                "Hot Spicy Meat Stew",
                "Cod Soup",
                "Naengi Soup",
                "Cabbage Soup",
                "Spinach Soup",
                "Aukguk",
                "Cold Cucumber Soup",
                "Umu Cold Soup",
                "Soy Bean Paste Stew",
                "Wild Chive Soy Bean Paste Stew",
                "Bean Paste Stew",
                "Raw Beef Stew",
                "Cheonggukjang Stew",
                "Ecological Stew",
                "Soft Tofu Stew",
                "Oyster Tofu Stew",
                "Salted Pollack Roe Stew",
                "Salted Zucchini Soup Stew",
                "Kimchi Stew",
                "Soybean Soup",
                "Beef Stew",
                "Mushroom Stew",
                "Seafood Stew",
                "Octopus Stew",
                "Tofu Stew",
                "Fresh Furnace",
                "Squid Sundae",
                "Steamed Monkfish",
                "Fishing Sone",
                "Pumpkin Sone",
                "Cucumber",
                "Branched",
                "Eggplant Greens",
                "Gujeolpan",
                "Bracken Greens",
                "Canine Leaf Vegetables",
                "Cold Greens",
                "Balloon Flower",
                "Water Parsley",
                "Radish Greens",
                "Knee Greens",
                "Mewi Greens",
                "Pogo Mushroom Vegetables",
                "Mungbean Sprouts",
                "Spinach Greens",
                "Dried Radish Leaves",
                "Zucchini Greens",
                "Chwinamul",
                "Bean Sprouts",
                "Japchae",
                "Bamboo Shoots",
                "Tangpyeongchae",
                "Salted Salad",
                "Deodeok Saengchae",
                "Spicy Spring Salted Vegetables",
                "Raw Radish Salad",
                "Raw Cucumbers",
                "Chamul Raw Salted Salad",
                "Seasoned Seaweed",
                "Mustard Vegetables",
                "Seasoned Acorns",
                "Seasoned Buckwheat Cake",
                "Braised Hairtail Radish",
                "Braised Radish Mackerel",
                "Braised Potatoes",
                "Braised Lotus Root",
                "Jeyuk Bokkeum",
                "Stir-Fried Chicken Ribs",
                "Royal Stir-Fried Rice Cake",
                "Seafood Pajeon",
                "Potato Pancake",
                "Sesame Leaf Pancake",
                "Red Pepper Pancake",
                "Zucchini Pancake",
                "Before Lotus Root",
                "Mushroom Pancake",
                "Bindaetteok",
                "Jangtteok",
                "Sub-San-Jeok",
                "Songi-San-Jeok",
                "Raw Dureup",
                "Green Onion Bundles",
                "Water Parsley And Beef Ties",
                "Kim Bu-Gak",
                "Knot Rice Bowl",
                "Pickled Red Pepper",
                "Pickled Sesame Leaves",
                "Pickled Garlic",
                "Pickled Garlic Pickles",
                "Pickled Radish",
                "Cucumber And Beef",
                "Cabbage Kimchi",
                "Bossam Kimchi",
                "White Kimchi",
                "Cubed Radish Kimchi",
                "Chonggak Kimchi",
                "Nabak Kimchi",
                "Dongchimi",
                "Pomegranate Kimchi",
                "Fresh Kimchi",
                "Long Kimchi",
                "Godeulgi Kimchi",
                "Young Radish Kimchi",
                "Cucumber Gourd",
                "Green Onion Kimchi",
                "Thick Rice Cake",
                "Snow White",
                "Rainbow Rice Cake",
                "Songpyeon",
                "Cinnamon Rice Cake",
                "Yak-Bap",
                "Pumpkin Rice Cake",
                "Patsirutteok",
                "Injeolmi",
                "Pounded Rice Cake",
                "Juak",
                "Chalsujubukkumi",
                "Hwajeon",
                "Gyeongdan",
                "Danja",
                "Yakgwa",
                "Maejakgwa",
                "Gangjeong",
                "Tea Confectionery",
                "Balloon Flower Garden And",
                "Lotus Root Pavilion",
                "Ginger Eggs",
                "Yulan",
                "Bamcho",
                "Jujube Grass",
                "Omija Jelly",
                "Plum Tea",
                "Ginseng Tea",
                "Ginger Tea",
                "Boiled Pear",
                "Persimmon Punch",
                "Sikhye",
                "Omija Fruit Salad",
                "Citron Fruit Salad",
                "Onesobyung",
                "Potato Chili Paste Stew",
                "Beef Pyeony Salad",
                "Chives Pancake",
                "Acorn Pancake",
                "Perilla Soup",
                "Braised Anchovies And White Beans",
                "Braised Dried Anchovies",
                "Braised Burdock Pork Roll",
                "Braised Konjac",
                "Braised Potato Fish Cake",
                "Braised Radish Kodari",
                "Steamed Perilla Leaves",
                "Andong Steamed Chicken",
                "Stir-Fried Garlic Dried Shrimp",
                "Stir-Fried Burdock Salad",
                "Stir-Fried Seaweed Stem",
                "Dry Green Algae Dish",
                "Grilled Eggplant Seasoning",
                "Leaf Greens",
                "Dried Eggplant Greens",
                "Seasoned With Water Blue",
                "Seasoned Sea Snails",
                "Seasoned With Garlic Bell Pepper Paste",
                "Seasoned With Green Pepper Paste",
                "Pickled Soy Radish",
                "Pickled Mushrooms",
                "Pickled Green Pepper Soy Sauce",
                "Pickled Pollack",
                "Pickled Cucumbers",
                "Pickled Bean Leaves With Soybean Paste",
                "Pickled Kimchi",
                "Pickled Onions",
                "Cucumber Pickles",
                "Cabbage Pickles",
                "Paprika Pickles",
                "Seasoned Cabbage",
                "Chives Kimchi",
                "Green Pepper Kimchi",
                "Cucumber Kimchi",
                "Fruit Water Kimchi",
                "Instant Water Kimchi",
                "Cheongpo Mukjeon",
                "Corn Pancake",
                "Green Bean Pancake",
                "Bingtteok",
                "Mussel Seaweed Soup",
                "Clear Soup With Cod",
                "Burdock Perilla Soup",
                "Soybean Paste Soup With Vegetables",
                "Thick Soybean Paste Soup",
                "Soybean Paste Soup With Ramie Clam",
                "Spicy Seafood Soup",
                "Bulgogi Stew",
                "Fish Cake Stew",
                "Seaweed Cucumber Cold Soup",
                "Five Grain Rice",
                "Grilled Radish Rice",
                "Rice With Seasoned Thistle",
                "Seaweed Abalone Porridge",
                "Fruit Salad",
                "Lotus Root Salad",
                "Bulgogi Cold Salad",
                "Jellyfish Cold Salad",
                "Tricolored Egg Roll",
                "Seasoned Green Onion Salad With Meat",
                "Seaweed Vinegar Sashimi",
                "Sweet Rice Pancake",
                "Ginger Dry Fruit",
                "Walnut Crackers",
                "Salted Greens",
                "Stir-Fried Laver",
                "Seasoned With Chubby Balloon Flower",
                "Bulgogi Webfoot Octopus Stew",
                "Cold Salad With Seafood",
                "Stir-Fried Spinach Shrimp",
                "Steamed Back Ribs",
                "Red Pepper Kimchi",
                "Braised Saury",
                "Thermal Movie Beam Surface",
                "Seasoned With Dried Pollack",
                "Braised Quarigo Chives",
                "Seasoned Cucumbers",
                "Chicken Stew",
                "Fresh Fish Soup",
                "Buckwheat Noodles",
                "Braised Nuts",
                "Pickled Deodeok",
                "Rice With Tuna Sashimi",
                "Braised Kelp",
                "Stir-Fried Eggplant",
                "Seaweed Soup With New Egg Mussels",
                "Green Laver Pancake",
                "Seasoned Green Laver",
                "Oyster Soup",
                "Beef Vegetable Roll",
                "Pork Back-Bone Stew",
                "Seafood Soybean Paste Pot",
                "Sweet Potato Sweet Pumpkin Salad",
                "Windproof Vegetable Seasoning",
                "Chamulmuul Radish",
                "Korean Melon Kkakdugi",
                "Cold Buckwheat Buckwheat Noodles",
                "Seasoned Coriander",
                "Burdock Pickles",
                "Chwinamul Soy Bean Paste Soup",
                "Seasoned Cheongpo Muk",
                "Braised Sweet Pumpkin",
                "Assorted Ssambap",
                "Burdock Japchae",
                "Mushroom Soft Tofu Perilla Soup",
                "Mushroom Mustard Cold Salad",
                "Sesame Leaf Stir-Fry",
                "Stir-Fried Onions",
                "Enoki Mushroom Vegetable Pancake",
                "Lettuce Fresh Kimchi",
                "Seasoned Seaweed With Vinegar",
                "Braised Radish",
                "Broccoli Tofu Salad",
                "Seasoned Wild Vegetables",
                "Seasoned Salad",
                "Seasoned Onion Cucumbers",
                "Stir-Fried Perilla Sprouts",
                "Braised Burdock",
                "Oyster Kimchi Soup And Rice",
                "Salted Pollack Roe Tofu Stew",
                "Dongtae Spicy Soup",
                "Wheat Wrap",
                "Sea Cucumber Nurungji Soup",
                "Seafood Salad",
                "Grilled Oyster Skewers",
                "Oyster Salad",
                "Seasoned With Soothing",
                "Grilled Burdock Beef",
                "Manila Clam Kalguksu",
                "Spicy Rockfish Soup",
                "The Durbbakan Wrap",
                "Stir-Fried Bamboo Shoots",
                "Chwinamul Doenjang Salad",
                "Blue Crab Stew",
                "Steamed Sea Squirt Bean Sprouts",
                "Squid Spicy Soup",
                "Chives Semi Kimchi",
                "Stir-Fried Squid",
                "Mungge Bibimbap",
                "Young Radish Greens",
                "Eel Nutrition Rice",
                "Strong Doenjang Yeol Movie Bibimbap",
                "Yeolmu Kimchi Bibim Noodle",
                "Eel Chives Soup",
                "Toran Soup",
                "Octopus Yeonpo Soup",
                "Toenmi Soy Bean Paste Soup",
                "Shiitake Beef Brisket Doenjang Stew",
                "Mussel Clear Soup",
                "Sweet And Sour Mushrooms",
                "Raw Onion Octopus",
                "Steamed Sweet Pumpkin",
                "Steamed Kimchi With Seasoned Mackerel",
                "Radish Bean Sprout Soup",
                "Beef Bulgogi",
                "Kimchi Fried Rice",
                "Yeolmu Bibimbap",
                "A Rice Topped With Tonkatsu",
                "Kkomak Bibimbap",
                "Spicy Sausage Stew",
                "Pork Kimchi Stew",
                "Beef Radish Soup",
                "Squid Radish Soup",
                "Squid Spicy Seafood Noodles",
                "Noodles For The Feast",
                "Bibimdangmyeon",
                "Stir-Fried Seafood Udon",
                "Stir-Fried Beef Rice Noodles",
                "Mille-Feuille-Nabe",
                "Steamed Pork Belly Kimchi Roll",
                "Pan-Fried Pork Belly Host Food",
                "Sweet And Sour Pork",
                "Squid Minari Ganghoe",
                "Seasoned Duck",
                "Seaweed Oyster Soup",
                "Sweet Pumpkin Porridge",
                "Black Bean Noodles Tteokbokki",
                "Sweet Potato Mattang",
                "Beef Rice Balls",
                "Cramey Fried Tofu Rice Balls",
                "Seasoned Chives And Cucumbers",
                "Kimjaban",
                "Grilled Tofu Salad",
                "Green Algae Guljeon",
                "Seasoned Buckwheat Muk Kimchi",
                "Chicken Breast Mustard Salad",
                "Stir-Fried Pork With Soy Sauce",
                "Stir Fried Beef Bok Chung Oyster",
                "Braised Beef Wan",
                "Braised Quarigo Chili Eggs",
                "Braised King Oyster Mushroom",
                "Splashing Kelp",
                "A Fish-Shaped Bun",
                "Abalone Earthen Pot",
                "Abalone Kimchi",
                "Acorn Jelly Salad",
                "Ah Wook Guk",
                "Albap",
                "Baekseolg",
                "Bamboo Barrel Rice",
                "Banquet Noodles",
                "Bar Rice Cake",
                "Bean Leaf Kimchi",
                "Bean Paste Cabbage Soup",
                "Bean Sprout Hangover Soup",
                "Bean Sprout Konjac Bibimmyeon",
                "Bean Sprout Mushroom Stew",
                "Bean-Soup Noodles",
                "Beef Cabbage Soup",
                "Bibimguks",
                "Black Rice",
                "Black-Bean-Sauce Noodles",
                "Black-Bean-Sauce Rice",
                "Blue Crab Soup",
                "Boiled Rice Porridge",
                "Bossam",
                "Braised Back Rib Kimchi",
                "Braised Chestnut",
                "Braised Garlic Almonds",
                "Braised Mackerel And Kimchi",
                "Braised Old Kimchi",
                "Braised Pork Garlic",
                "Braised Red Pepper",
                "Braised Short Ribs",
                "Braised Spicy Chicken",
                "Braised Tuna Potatoes",
                "Broccoli Tuna Warfare",
                "Bulgogi With Rice",
                "Bulnakjeongol",
                "Bungnamul",
                "Cabbage Tuna Over Rice",
                "Carrot Rice",
                "Cheonggukjang Jjigae",
                "Chicken Curry Rice",
                "Chinese Cabbage Soup",
                "Chives Japchae",
                "Chungmu Gimbap",
                "Citron Tea",
                "Clam Kalguksu",
                "Cloud Rice Cake",
                "Cockle-Minarimuchim",
                "Cold Bean Sprout Salad",
                "Cold Buckwheat Noodles",
                "Cold Jellyfish Salad",
                "Cold Noodles With Pollack",
                "Corn Tea",
                "Cucumber Pickle",
                "Cucumber Salad",
                "Cup Rice",
                "Deep-Fried Chicken In Hot Pepper Sauce",
                "Deep-Fried Sweet Pumpkin",
                "Deodeok Jangaji",
                "Deodeok Kimchi",
                "Doraji Saengchae",
                "Dorajigwa",
                "Dorajimuchim",
                "Dried Persimmon Walnut Wraps",
                "Dried Pollack Hangover Soup",
                "Dried Pollack Salad",
                "Dried Radish Greens",
                "Dried Radish Kimchi",
                "Dried Radish Salad",
                "Dried Soybean Paste Seasoned With Dried Radish Leaves",
                "Dumpling Hot Pot",
                "Dumpling",
                "Egg Rice",
                "Eggplant Rice",
                "Eggplant Tangsu",
                "Eolchutang",
                "Fish Cake Kimchi Jeongol",
                "Flat Dumpling",
                "Fried Cheese Potato",
                "Fried Eggplant",
                "Fried Onion",
                "Fried Rice",
                "Fried Sweet Potatoes",
                "Fried Tofu Sushi",
                "Fried Vegetables",
                "Fried Walnut Garlic",
                "Galchi Pumpkin Soup",
                "Gamjazugoroke",
                "Garlic Pickle",
                "Ge Gukji",
                "Godeulpaegi Kimchi",
                "Golbaengi Fire Noodle Salad",
                "Gondre Rice",
                "Gondrenamul",
                "Green Pepper Salad",
                "Grilled Deodeok",
                "Grilled Perilla Leaf Tofu",
                "Grilled Rice Cake",
                "Grilled Saesongi Mushroom Soy Sauce",
                "Gu Gi-Cha",
                "Hangover Soup",
                "Honey Bread",
                "Honey Butter Sweet Potato",
                "Honey Rice Cake",
                "Hwe Guksu",
                "Jjambbong",
                "Jjimdak",
                "Jjolmyeon",
                "Joebap",
                "Jorangi Tteokguk",
                "Jujube Tea",
                "Kalguksu",
                "Kim Moo-Chim",
                "Kimchi Pancake",
                "Kimchi Sujebi",
                "Kkakdugi",
                "Kongbiji",
                "Korean Style Meatball",
                "Leek Kimchi",
                "Leek Pancake",
                "Lettuce Leaf Salad",
                "Lotus Leaf Rice",
                "Mixed Grain Rice",
                "Mugwort Rice Cake",
                "Mung Bean Samgyetang",
                "Mushroom Hot Pot",
                "Mushroom Jangjorim",
                "Mushroom Perilla Soup",
                "Oisobak",
                "Omija Hwachae",
                "Onion Kimchi",
                "Palbochae",
                "Paprika Beef Horse",
                "Patbings",
                "Perilla Leaf Jeon",
                "Perilla Leaf Kimchi",
                "Perilla Leaf Pickle",
                "Perilla Taro Soup",
                "Pickled Garlic Leaves",
                "Pollack Tofu Stew",
                "Pork And Rice Soup",
                "Potato Ongshimi",
                "Potato Rice",
                "Potato Songpyeon",
                "Powder Made Of Mixed Grains",
                "Puffed Rice",
                "Pumpkin Beombeok",
                "Pumpkin Pancake",
                "Pumpkin Soup",
                "Pyeongyang Hot Pot",
                "Quince Tea",
                "Radish Ssammari",
                "Rajoy",
                "Red Bean Jelly",
                "Red Bean Noodle Soup",
                "Red Pepper Paste Stew",
                "Rice Ball",
                "Rice Burger",
                "Rice Cake Dumpling Soup",
                "Rice With Enoki Mushroom",
                "Royal Tteokbokki",
                "Sanchae Bibimbap",
                "Sancho Pickled Vegetables",
                "Sea Snails Salad",
                "Sea Urchin Seaweed Soup",
                "Seasoned Bean Sprouts",
                "Seasoned Bracken",
                "Seasoned Cucumber",
                "Seasoned Duck-Buchu",
                "Seasoned Leek",
                "Seasoned Perilla Leaves",
                "Seasoned Radish",
                "Seasoned Spinach",
                "Seaweed Cold Soup",
                "Shiitake Pancake",
                "Shin Sun Ro",
                "Shirutteok",
                "Sorghum Rice",
                "Spicy Chicken Soup With Rice",
                "Spicy Cold Noodles",
                "Spicy Fish Stew",
                "Spicy Grilled Chicken",
                "Spring Roll",
                "Sprout Bibimbap",
                "Squid Kimchi",
                "Ssambap",
                "Steamed Buns",
                "Steamed Sausage Bean Sprouts",
                "Steamed Sea Squirt Bibimbap",
                "Steamed Soybean Paste Perilla Leaves",
                "Stew Made With Frozen Pollack",
                "Stir-Fried Bean Sprouts And Eggs",
                "Stir-Fried Beef Cheonggyeongchae",
                "Stir-Fried Beef Cucumber",
                "Stir-Fried Chicken Breast Mushroom",
                "Stir-Fried Chicken Breast Perilla Leaves",
                "Stir-Fried Cucumber",
                "Stir-Fried Garlic Species",
                "Stir-Fried Potatoes",
                "Stir-Fried Pumpkin Tuna",
                "Stir-Fried Rice Cake",
                "Stir-Fried Shrimp Cheonggyeongchae",
                "Stir-Fried Soondae",
                "Stir-Fried Spam Potato",
                "Stir-Fried Spicy Stir-Fried Chili Pepper Ham",
                "Stir-Fried Zucchini Shrimp",
                "Sweet Potato Pancake",
                "Sweet Potato Soup",
                "Sweet Pumpkin Nutrition Rice",
                "Sweet Pumpkin Sikhye",
                "Tadpole Noodles",
                "Tofu Kimchi Egg Soup",
                "Tofu Kimchi",
                "Tofu Spam Kimchi Hot Pot",
                "Tofu Spinach Salad",
                "Tray Jjajang",
                "Tray Membrane Noodles",
                "Triangular Rolled-Rice Gimbap",
                "Ttukbaegi Bulgogi",
                "Tuna Bibimbap",
                "Tuna Kimchi Porridge",
                "Turnip Kimchi",
                "Udon",
                "Vegetable Porridge",
                "Wanjatang",
                "Water Parsley Kimchi",
                "Webfoot Octopus Salad",
                "Wheat Noodles",
                "White Rice",
                "Yakbap",
                "Yeolmu Kimchi",
                "Yeon Geun Jeon",
                "Yeonpo-Tang",
                "Young Green Pepper Pancake",
                "Yugwa",
                "Yulmu Bap",
                "Yushan Seul",
        };
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, richvitaminitems);
        ListView listView = (ListView) findViewById(R.id.richvitaminlist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String richvitaminitems = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(TertiaryActivity_health_richvitamin.this, richvitaminitems, Toast.LENGTH_SHORT);
                    }
                }
        );
    }
}