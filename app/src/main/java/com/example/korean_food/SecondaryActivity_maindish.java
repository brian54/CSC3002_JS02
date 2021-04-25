package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/** Main dish recipe list with photos */
public class SecondaryActivity_maindish extends AppCompatActivity {

    GridView gv_maindish;

    String[] maindish_names = {"Rice Roll",
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
            "Noodles Soup",
            "Chicken Noodle",
            "Fish Tray",
            "Seafood Noodle",
            "Bibim Noodles",
            "Spicy Buckwheat Noodles",
            "Cold Raw Fish Noodles",
            "Cold Noodles With Cold Buckwheat Noodles",
            "Pine Nut Noodles",
            "Cold Bean Noodles",
            "Dumpling Soup",
            "Dumpling Noodles",
            "Pork Tteokguk",
            "Rice-Cake Soup",
            "Sujebi",
            "Fresh Furnace",
            "Steamed Pork Ribs",
            "Steamed Situation",
            "Braised Beef Ribs",
            "Steamed Chicken",
            "Steamed Large Fish",
            "Squid Sundae",
            "Steamed Monkfish",
            "Jeyuk Bokkeum",
            "Stir-Fried Chicken Ribs",
            "Stir-Fried Octopus",
            "Neoviani",
            "Grilled Short Rib Patties",
            "Grilled Beef Ribs",
            "Bulgogi",
            "Grilled Spicy Pork",
            "Grilled Chicken",
            "Grilled Oysters",
            "Grilled Mackerel",
            "Grilled Dried Pollack",
            "Grilled Hairtail",
            "Grilled Early Seasoning",
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
            "Jangtteok",
            "Sub-San-Jeok",
            "Songi-San-Jeok",
            "Korean Style Raw Beef",
            "Raw Skate",
            "Raw Octopus",
            "Raw Dureup",
            "Green Onion Bundles",
            "Water Parsley And Beef Ties",
            "Boiled Beef Shank Slices",
            "Pyeonyuk",
            "Jokpyeon",
            "Beef Jerky",
            "Chives Pancake",
            "Grilled Beef Brisket",
            "Stir-Fried Octopus And Thin Noodles",
            "Andong Steamed Chicken",
            "Squid And Pork Belly Bulgogi",
            "Grilled Eggplant Seasoning",
            "Grilled Tofu Seasoning",
            "Grilled Braised Spice With Spicy Sauce",
            "Grilled Kodari Seasoning",
            "Cheongpo Mukjeon",
            "Corn Pancake",
            "Green Bean Pancake",
            "Bingtteok",
            "Bulgogi Stew",
            "Fish Cake Stew",
            "Bulgogi Webfoot Octopus Stew",
            "Thermal Movie Beam Surface",
            "Steamed Tofu Shrimp",
            "Steamed Spicy Ribs",
            "Buckwheat Noodles",
            "Rice With Tuna Sashimi",
            "Grilled Samchigo Chili Sauce",
            "Braised Mackerel Kimchi",
            "Green Laver Pancake",
            "Grilled Pork Belly",
            "Seafood Soybean Paste Pot",
            "Steamed Kodari",
            "Assorted Ssambap",
            "Enoki Mushroom Vegetable Pancake",
            "Ham Tofu Pancake",
            "Wheat Wrap",
            "Seafood Salad",
            "Grilled Oyster Skewers",
            "Grilled Burdock Beef",
            "Manila Clam Kalguksu",
            "Seasoned Webfoot Octopus Sashimi",
            "Grilled Clam Butter",
            "Grilled Webfoot Octopus Seasoning",
            "Steamed Sea Squirt Bean Sprouts",
            "Mungge Bibimbap",
            "Eel Nutrition Rice",
            "Strong Doenjang Yeol Movie Bibimbap",
            "Yeolmu Kimchi Bibim Noodle",
            "Sweet And Sour Mushrooms",
            "Grilled Shrimp Skewers",
            "Grilled Gizzard",
            "Raw Onion Octopus",
            "Beef Bulgogi",
            "Kimchi Fried Rice",
            "Spam Mayo Rice With Rice",
            "Yeolmu Bibimbap",
            "A Rice Topped With Tonkatsu",
            "Kkomak Bibimbap",
            "Squid Spicy Seafood Noodles",
            "Noodles For The Feast",
            "Bibimdangmyeon",
            "Stir-Fried Seafood Udon",
            "Stir-Fried Beef Rice Noodles",
            "Seafood Pasta",
            "Mille-Feuille-Nabe",
            "Back Rib Barbecue",
            "Steamed Pork Belly Kimchi Roll",
            "Pan-Fried Pork Belly Host Food",
            "Sweet And Sour Pork",
            "Smoked Salmon",
            "Seasoned Duck",
            "Grilled Abalone Butter",
            "Grilled Eel",
            "Sweet Pumpkin Porridge",
            "Salmon Steak",
            "Beef Rice Balls",
            "Cramey Fried Tofu Rice Balls",
            "Green Algae Guljeon",
            "Frozen Pollack Pancake",
            "Grilled Mackerel Soy Sauce",
            "Grilled Eel Yangyeom",
            "Stir-Fried Pork With Soy Sauce",
            "Stir Fried Beef Bok Chung Oyster",
            "Bang-A-Po-Y",
            "Abalone Dolsotbap",
            "Abalone Earthen Pot",
            "Albap",
            "Banquet Noodles",
            "Bean Meat",
            "Bean Sprout Konjac Bibimmyeon",
            "Bean-Soup Noodles",
            "Beef Pancake",
            "Bibimguks",
            "Black-Bean-Sauce Noodles",
            "Black-Bean-Sauce Rice",
            "Boiled Pork",
            "Boiled Rice Porridge",
            "Bossam",
            "Braised Abalone",
            "Braised Beef Brisket",
            "Braised Cutlassfish",
            "Braised Mackerel And Kimchi",
            "Braised Mackerel",
            "Braised Old Kimchi",
            "Braised Pollack",
            "Braised Pork Garlic",
            "Braised Pork Neck",
            "Braised Short Ribs",
            "Braised Skate",
            "Braised Spicy Chicken",
            "Broccoli Tuna Warfare",
            "Buckwheat Warrior",
            "Buldak Stir-Fried Noodles",
            "Bulgogi With Rice",
            "Bulnakjeongol",
            "Cabbage Tuna Over Rice",
            "Charcoal Spicy Stir-Fried Chicken",
            "Cheese Back Ribs",
            "Chicken Curry Rice",
            "Chungmu Gimbap",
            "Clam Kalguksu",
            "Cold Buckwheat Noodles",
            "Cold Noodles With Pollack",
            "Cup Rice",
            "Deep-Fried Chicken In Hot Pepper Sauce",
            "Dongpa Yuk",
            "Dongtaejeon",
            "Doribangbangi",
            "Dulchigi",
            "Dumpling Hot Pot",
            "Egg Rice",
            "Fish Cake Kimchi Jeongol",
            "Fish Cake Pancake",
            "Five-Spiced Pork",
            "Fried Chicken",
            "Fried Rice",
            "Fried Tofu Sushi",
            "Gazamijorim",
            "Grilled Deodeok",
            "Grilled Herring",
            "Grilled Perilla Leaf Tofu",
            "Grilled Pork Ginger",
            "Grilled Pork Ribs",
            "Grilled Saesongi Mushroom Soy Sauce",
            "Grilled Short Ribs",
            "Grilled Shrimp",
            "Grilled Tofu",
            "Grilled Tripe Soy Sauce",
            "Grilled Tripe",
            "Hot Pepper Paste Tuna Fried Rice",
            "Hwe Guksu",
            "Japchae Rice",
            "Jjambbong",
            "Jjimdak",
            "Jjolmyeon",
            "Kalguksu",
            "Kimchi Pancake",
            "Kimchi Sujebi",
            "La Galbi Jjim",
            "Leek Pancake",
            "Mak Noodle",
            "Mung Bean Samgyetang",
            "Mushroom Hot Pot",
            "Nakjigui",
            "Neubiani",
            "Nose-Backed Noodles",
            "Omelet Rice",
            "Onion Egg Rice",
            "Ox Head Gukbap",
            "Oyster Rice Soup",
            "Palbochae",
            "Paprika Tuna Warfare",
            "Pearl Bibimbap",
            "Perilla Leaf Jeon",
            "Pork And Rice Soup",
            "Pork Cutlet",
            "Pumpkin Pancake",
            "Pyeongyang Hot Pot",
            "Rajoy",
            "Ramen Rice",
            "Raw Beef Mixed With Rice",
            "Red Bean Noodle Soup",
            "Red Pepper Paste Pork Belly",
            "Rice Topped With Eggs",
            "Rice Topped With Octopus",
            "Rice With Enoki Mushroom",
            "Rice With Grilled Pancake",
            "Rice With Squid",
            "Roast Duck",
            "Roasted Abalone",
            "Salmon Soy Sauce Braised",
            "Samhap",
            "Sanchae Bibimbap",
            "Seafood Nurungji Soup",
            "Seasoned Spicy Chicken",
            "Seaweed Bibimbap",
            "Separate Rice Soup",
            "Shiitake Pancake",
            "Shin Sun Ro",
            "Shrimp Sweet Noodles Rice With Rice",
            "Soy Sauce Pork Bulgogi",
            "Spicy Braised Short Ribs",
            "Spicy Chicken Soup With Rice",
            "Spicy Cold Noodles",
            "Spicy Grilled Chicken",
            "Spicy Stir-Fried Chicken With Cheese",
            "Spring Roll",
            "Sprout Bibimbap",
            "Squid Bulgogi",
            "Squid Duruchigi",
            "Ssambap",
            "Steamed Dried Corvina",
            "Steamed Sea Squirt Bibimbap",
            "Steamed Snow Crab",
            "Steamed Stingray",
            "Stir-Fried Chicken Feet",
            "Stir-Fried Pork Belly",
            "Stir-Fried Soondae",
            "Stir-Fried Tripe",
            "Stir-Fried Udon",
            "Sweet And Sour Chicken",
            "Sweet Potato Pancake",
            "Sweet Pumpkin Nutrition Rice",
            "Tadpole Noodles",
            "Tofu Pancake",
            "Tofu Rice",
            "Tofu Spam Kimchi Hot Pot",
            "Tray Jjajang",
            "Tray Membrane Noodles",
            "Ttukbaegi Bulgogi",
            "Tuna Bibimbap",
            "Tuna Kimchi Porridge",
            "Udon",
            "Vegetable Porridge",
            "Wheat Noodles",
            "Young Green Pepper Pancake",
            "Yushan Seul",
            "Zelkova Duruchigi",
            "Zucchini Egg Porridge"

    };
    
    int[] maindish_images = {
            R.drawable.rice_roll,
            R.drawable.white_porridge,
            R.drawable.mung_bean_porridge,
            R.drawable.bean_porridge,
            R.drawable.red_bean_porridge,
            R.drawable.pine_nut_porridge,
            R.drawable.jujube_porridge,
            R.drawable.grilled_porridge,
            R.drawable.zucchini_porridge,
            R.drawable.pumpkin_porridge,
            R.drawable.chicken_porridge,
            R.drawable.janggukjuk,
            R.drawable.oyster_porridge,
            R.drawable.abalone_porridge,
            R.drawable.black_sesame_porridge,
            R.drawable.tarak_porridge,
            R.drawable.noodles_soup,
            R.drawable.chicken_noodle,
            R.drawable.fish_tray,
            R.drawable.seafood_noodle,
            R.drawable.bibim_noodles,
            R.drawable.spicy_buckwheat_noodles,
            R.drawable.cold_raw_fish_noodles,
            R.drawable.cold_noodles_with_cold_buckwheat_noodles,
            R.drawable.pine_nut_noodles,
            R.drawable.cold_bean_noodles,
            R.drawable.dumpling_soup,
            R.drawable.dumpling_noodles,
            R.drawable.pork_tteokguk,
            R.drawable.rice_cake_soup,
            R.drawable.sujebi,
            R.drawable.fresh_furnace,
            R.drawable.steamed_pork_ribs,
            R.drawable.steamed_situation,
            R.drawable.braised_beef_ribs,
            R.drawable.steamed_chicken,
            R.drawable.steamed_large_fish,
            R.drawable.squid_sundae,
            R.drawable.steamed_monkfish,
            R.drawable.jeyuk_bokkeum,
            R.drawable.stir_fried_chicken_ribs,
            R.drawable.stir_fried_octopus,
            R.drawable.neoviani,
            R.drawable.grilled_short_rib_patties,
            R.drawable.grilled_beef_ribs,
            R.drawable.bulgogi,
            R.drawable.grilled_spicy_pork,
            R.drawable.grilled_chicken,
            R.drawable.grilled_oysters,
            R.drawable.grilled_mackerel,
            R.drawable.grilled_dried_pollack,
            R.drawable.grilled_hairtail,
            R.drawable.grilled_early_seasoning,
            R.drawable.guljeon,
            R.drawable.pancake_shrimp_pancake,
            R.drawable.seafood_pajeon,
            R.drawable.potato_pancake,
            R.drawable.sesame_leaf_pancake,
            R.drawable.red_pepper_pancake,
            R.drawable.zucchini_pancake,
            R.drawable.before_lotus_root,
            R.drawable.mushroom_pancake,
            R.drawable.bindaetteok,
            R.drawable.jangtteok,
            R.drawable.songi_san_jeok,
            R.drawable.korean_style_raw_beef,
            R.drawable.raw_skate,
            R.drawable.raw_octopus,
            R.drawable.raw_dureup,
            R.drawable.green_onion_bundles,
            R.drawable.water_parsley_and_beef_ties,
            R.drawable.boiled_beef_shank_slices,
            R.drawable.pyeonyuk,
            R.drawable.jokpyeon,
            R.drawable.beef_jerky,
            R.drawable.chives_pancake,
            R.drawable.grilled_beef_brisket,
            R.drawable.stir_fried_octopus_and_thin_noodles,
            R.drawable.andong_steamed_chicken,
            R.drawable.squid_and_pork_belly_bulgogi,
            R.drawable.grilled_eggplant_seasoning,
            R.drawable.grilled_tofu_seasoning,
            R.drawable.grilled_braised_spice_with_spicy_sauce,
            R.drawable.grilled_kodari_seasoning,
            R.drawable.cheongpo_mukjeon,
            R.drawable.corn_pancake,
            R.drawable.green_bean_pancake,
            R.drawable.bingtteok,
            R.drawable.bulgogi_stew,
            R.drawable.fish_cake_stew,
            R.drawable.bulgogi_webfoot_octopus_stew,
            R.drawable.thermal_movie_beam_surface,
            R.drawable.steamed_tofu_shrimp,
            R.drawable.steamed_spicy_ribs,
            R.drawable.buckwheat_noodles,
            R.drawable.rice_with_tuna_sashimi,
            R.drawable.grilled_samchigo_chili_sauce,
            R.drawable.braised_mackerel_kimchi,
            R.drawable.green_laver_pancake,
            R.drawable.grilled_pork_belly,
            R.drawable.seafood_soybean_paste_pot,
            R.drawable.steamed_kodari,
            R.drawable.assorted_ssambap,
            R.drawable.enoki_mushroom_vegetable_pancake,
            R.drawable.ham_tofu_pancake,
            R.drawable.wheat_wrap,
            R.drawable.seafood_salad,
            R.drawable.grilled_oyster_skewers,
            R.drawable.grilled_burdock_beef,
            R.drawable.manila_clam_kalguksu,
            R.drawable.seasoned_webfoot_octopus_sashimi,
            R.drawable.grilled_clam_butter,
            R.drawable.grilled_webfoot_octopus_seasoning,
            R.drawable.steamed_sea_squirt_bean_sprouts,
            R.drawable.mungge_bibimbap,
            R.drawable.eel_nutrition_rice,
            R.drawable.strong_doenjang_yeol_movie_bibimbap,
            R.drawable.yeolmu_kimchi_bibim_noodle,
            R.drawable.sweet_and_sour_mushrooms,
            R.drawable.grilled_shrimp_skewers,
            R.drawable.grilled_gizzard,
            R.drawable.raw_onion_octopus,
            R.drawable.beef_bulgogi,
            R.drawable.kimchi_fried_rice,
            R.drawable.spam_mayo_rice_with_rice,
            R.drawable.yeolmu_bibimbap,
            R.drawable.a_rice_topped_with_tonkatsu,
            R.drawable.kkomak_bibimbap,
            R.drawable.squid_spicy_seafood_noodles,
            R.drawable.noodles_for_the_feast,
            R.drawable.bibimdangmyeon,
            R.drawable.stir_fried_seafood_udon,
            R.drawable.stir_fried_beef_rice_noodles,
            R.drawable.seafood_pasta,
            R.drawable.mille_feuille_nabe,
            R.drawable.back_rib_barbecue,
            R.drawable.steamed_pork_belly_kimchi_roll,
            R.drawable.pan_fried_pork_belly_host_food,
            R.drawable.sweet_and_sour_pork,
            R.drawable.smoked_salmon,
            R.drawable.seasoned_duck,
            R.drawable.grilled_abalone_butter,
            R.drawable.grilled_eel,
            R.drawable.sweet_pumpkin_porridge,
            R.drawable.salmon_steak,
            R.drawable.beef_rice_balls,
            R.drawable.cramey_fried_tofu_rice_balls,
            R.drawable.green_algae_guljeon,
            R.drawable.frozen_pollack_pancake,
            R.drawable.grilled_mackerel_soy_sauce,
            R.drawable.grilled_eel_yangyeom,
            R.drawable.stir_fried_pork_with_soy_sauce,
            R.drawable.stir_fried_beef_bok_chung_oyster,
            R.drawable.bang_a_po_y,
            R.drawable.abalone_dolsotbap,
            R.drawable.abalone_earthen_pot,
            R.drawable.banquet_noodles,
            R.drawable.bean_meat,
            R.drawable.bean_sprout_konjac_bibimmyeon,
            R.drawable.bean_soup_noodles,
            R.drawable.black_bean_sauce_noodles,
            R.drawable.boiled_pork,
            R.drawable.boiled_rice_porridge,
            R.drawable.bossam,
            R.drawable.braised_abalone,
            R.drawable.braised_beef_brisket,
            R.drawable.braised_cutlassfish,
            R.drawable.braised_mackerel,
            R.drawable.braised_old_kimchi,
            R.drawable.braised_pork_garlic,
            R.drawable.braised_pork_neck,
            R.drawable.braised_short_ribs,
            R.drawable.braised_skate,
            R.drawable.braised_spicy_chicken,
            R.drawable.broccoli_tuna_warfare,
            R.drawable.buckwheat_warrior,
            R.drawable.buldak_stir_fried_noodles,
            R.drawable.bulgogi_with_rice,
            R.drawable.bulnakjeongol,
            R.drawable.cabbage_tuna_over_rice,
            R.drawable.charcoal_spicy_stir_fried_chicken,
            R.drawable.cheese_back_ribs,
            R.drawable.chicken_curry_rice,
            R.drawable.chungmu_gimbap,
            R.drawable.clam_kalguksu,
            R.drawable.cold_buckwheat_noodles,
            R.drawable.cold_noodles_with_pollack,
            R.drawable.deep_fried_chicken_in_hot_pepper_sauce,
            R.drawable.dongpa_yuk,
            R.drawable.dongtaejeon,
            R.drawable.doribangbangi,
            R.drawable.dulchigi,
            R.drawable.dumpling_hot_pot,
            R.drawable.fish_cake_kimchi_jeongol,
            R.drawable.fish_cake_pancake,
            R.drawable.five_spiced_pork,
            R.drawable.fried_rice,
            R.drawable.fried_tofu_sushi,
            R.drawable.gazamijorim,
            R.drawable.grilled_deodeok,
            R.drawable.grilled_herring,
            R.drawable.grilled_perilla_leaf_tofu,
            R.drawable.grilled_pork_ginger,
            R.drawable.grilled_pork_ribs,
            R.drawable.grilled_saesongi_mushroom_soy_sauce,
            R.drawable.grilled_short_ribs,
            R.drawable.grilled_shrimp,
            R.drawable.grilled_tofu,
            R.drawable.grilled_tripe_soy_sauce,
            R.drawable.grilled_tripe,
            R.drawable.hot_pepper_paste_tuna_fried_rice,
            R.drawable.hwe_guksu,
            R.drawable.jjambbong,
            R.drawable.jjimdak,
            R.drawable.jjolmyeon,
            R.drawable.kalguksu,
            R.drawable.kimchi_pancake,
            R.drawable.kimchi_sujebi,
            R.drawable.leek_pancake,
            R.drawable.mak_noodle,
            R.drawable.mung_bean_samgyetang,
            R.drawable.mushroom_hot_pot,
            R.drawable.nose_backed_noodles,
            R.drawable.omelet_rice,
            R.drawable.onion_egg_rice,
            R.drawable.palbochae,
            R.drawable.paprika_tuna_warfare,
            R.drawable.perilla_leaf_jeon,
            R.drawable.pyeongyang_hot_pot,
            R.drawable.rajoy,
            R.drawable.raw_beef_mixed_with_rice,
            R.drawable.red_bean_noodle_soup,
            R.drawable.red_pepper_paste_pork_belly,
            R.drawable.rice_topped_with_eggs,
            R.drawable.rice_topped_with_octopus,
            R.drawable.rice_with_enoki_mushroom,
            R.drawable.rice_with_grilled_pancake,
            R.drawable.rice_with_squid,
            R.drawable.roast_duck,
            R.drawable.salmon_soy_sauce_braised,
            R.drawable.samhap,
            R.drawable.sanchae_bibimbap,
            R.drawable.seafood_nurungji_soup,
            R.drawable.seasoned_spicy_chicken,
            R.drawable.seaweed_bibimbap,
            R.drawable.shin_sun_ro,
            R.drawable.shrimp_sweet_noodles_rice_with_rice,
            R.drawable.soy_sauce_pork_bulgogi,
            R.drawable.spicy_braised_short_ribs,
            R.drawable.spicy_chicken_soup_with_rice,
            R.drawable.spicy_cold_noodles,
            R.drawable.spicy_stir_fried_chicken_with_cheese,
            R.drawable.spring_roll,
            R.drawable.sprout_bibimbap,
            R.drawable.squid_bulgogi,
            R.drawable.squid_duruchigi,
            R.drawable.ssambap,
            R.drawable.steamed_dried_corvina,
            R.drawable.steamed_sea_squirt_bibimbap,
            R.drawable.steamed_snow_crab,
            R.drawable.steamed_stingray,
            R.drawable.stir_fried_chicken_feet,
            R.drawable.stir_fried_soondae,
            R.drawable.stir_fried_udon,
            R.drawable.sweet_and_sour_chicken,
            R.drawable.sweet_potato_pancake,
            R.drawable.sweet_pumpkin_nutrition_rice,
            R.drawable.tofu_pancake,
            R.drawable.tofu_spam_kimchi_hot_pot,
            R.drawable.tray_membrane_noodles,
            R.drawable.ttukbaegi_bulgogi,
            R.drawable.tuna_bibimbap,
            R.drawable.tuna_kimchi_porridge,
            R.drawable.udon,
            R.drawable.vegetable_porridge,
            R.drawable.wheat_noodles,
            R.drawable.yushan_seul,
            R.drawable.zelkova_duruchigi,
            R.drawable.zucchini_egg_porridge

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_maindish);

        gv_maindish = findViewById(R.id.gv_maindish);

        CustomAdapter customAdapter = new CustomAdapter(maindish_names, maindish_images,this);

        gv_maindish.setAdapter(customAdapter);

        gv_maindish.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName = maindish_names[i];
                int selectedImage = maindish_images[i];

                startActivity(new Intent(SecondaryActivity_maindish.this, Fooddescription.class).putExtra("name",selectedName).putExtra("image",selectedImage));
            }
        });

    }

    /** Gateway from list of recipes to Fooddescription */
    public class CustomAdapter extends BaseAdapter{
        private String[] imageNames;
        private int[] imagePhotos;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames, int[] imagePhotos, Context context) {
            this.imageNames = imageNames;
            this.imagePhotos = imagePhotos;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return imagePhotos.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null) {
                view = layoutInflater.inflate(R.layout.gv_maindish_rowitems, viewGroup, false);
            }

            TextView tv_maindish = view.findViewById(R.id.tv_maindish);
            ImageView iv_maindish = view.findViewById(R.id.iv_maindish);

            tv_maindish.setText(imageNames[i]);
            iv_maindish.setImageResource(imagePhotos[i]);

            return view;
        }
    }
}