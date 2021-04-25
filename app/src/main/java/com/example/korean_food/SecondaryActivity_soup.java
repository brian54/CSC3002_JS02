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

/** Soup recipe list with photos */
public class SecondaryActivity_soup extends AppCompatActivity {

    GridView gv_soup;

    String[] soup_names = {"Ae Stew",
            "Seaweed Soup",
            "Sea Mustard Soup",
            "Dried Pollack Soup",
            "Fish Roe Soup",
            "Clam Soup",
            "Chochi Soup",
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
            "Short Rib Soup",
            "Beef-Bone Soup",
            "Tails Soup",
            "Samgyetang",
            "Seolleongtang",
            "Yongbongtang",
            "Heat Chicken Stew",
            "Chueotang",
            "Imja Water Soup",
            "Cold Chicken Stew",
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
            "Sea Bream Noodles",
            "Seafood Stew",
            "Octopus Stew",
            "Tofu Stew",
            "Potato Chili Paste Stew",
            "Perilla Soup",
            "Mussel Seaweed Soup",
            "Clear Soup With Cod",
            "Burdock Perilla Soup",
            "Soybean Paste Soup With Vegetables",
            "Thick Soybean Paste Soup",
            "Soybean Paste Soup With Ramie Clam",
            "Spicy Seafood Soup",
            "Seaweed Cucumber Cold Soup",
            "Seafood Egg Soup",
            "Chicken Stew",
            "Fresh Fish Soup",
            "Seaweed Soup With New Egg Mussels",
            "Oyster Soup",
            "Pork Back-Bone Stew",
            "Chwinamul Soy Bean Paste Soup",
            "Mushroom Soft Tofu Perilla Soup",
            "Oyster Kimchi Soup And Rice",
            "Salted Pollack Roe Tofu Stew",
            "Dongtae Spicy Soup",
            "Sea Cucumber Nurungji Soup",
            "Spicy Rockfish Soup",
            "Blue Crab Stew",
            "Squid Spicy Soup",
            "Eel Chives Soup",
            "Toran Soup",
            "Octopus Yeonpo Soup",
            "Toenmi Soy Bean Paste Soup",
            "Shiitake Beef Brisket Doenjang Stew",
            "Mussel Clear Soup",
            "Radish Bean Sprout Soup",
            "Spicy Sausage Stew",
            "Pork Kimchi Stew",
            "Beef Radish Soup",
            "Squid Radish Soup",
            "Mussel Fish Cake Soup",
            "Seaweed Oyster Soup",
            "Agwi-Tang",
            "Ah Wook Guk",
            "Bean Paste Cabbage Soup",
            "Bean Soup",
            "Bean Sprout Hangover Soup",
            "Bean Sprout Mushroom Stew",
            "Beef Cabbage Soup",
            "Blue Crab Soup",
            "Bomalguk",
            "Bone Soup",
            "Cheonggukjang Jjigae",
            "Cheonggukjang",
            "Chicken Soup",
            "Chinese Cabbage Soup",
            "Chupotang",
            "Cold Raw Fish Soup",
            "Cold Soup",
            "Cold Soybean Paste Soup",
            "Crucible Bath",
            "Dried Pollack Hangover Soup",
            "Egg Soup",
            "Eojuk",
            "Eolchutang",
            "Fish Cake Soup",
            "Galchi Pumpkin Soup",
            "Galnaktang",
            "Ge Gukji",
            "Gulguk",
            "Hangover Soup",
            "Jjangdung Fish Soup",
            "Joggi-Guk",
            "Jorangi Tteokguk",
            "Kimchi Soup",
            "Knee Cartilage Soup",
            "Ko Ji-Guk",
            "Kongbiji",
            "Kongtang",
            "Liquor Soup",
            "Lotus Root Stewing",
            "Marsh Snail Soup",
            "Mukguk",
            "Mushroom Perilla Soup",
            "Mussel Soup",
            "Naejangtang",
            "Nurungji Chicken Soup",
            "Nurungjitang",
            "Octopus Lotus Pot Stew",
            "Odengguk",
            "Oyster Stew",
            "Perilla Taro Soup",
            "Pheasant Soup",
            "Pollack Soup",
            "Pollack Tofu Stew",
            "Pork And Hot Pepper Paste Stew",
            "Pumpkin Soup",
            "Red Pepper Paste Stew",
            "Rice Cake Dumpling Soup",
            "Sagolguk",
            "Sea Urchin Seaweed Soup",
            "Seaweed Cold Soup",
            "Seonji Haejangguk",
            "Seonjitguk",
            "Shellfish Soup",
            "Shrimp Soft Tofu Egg Soup",
            "Shrimp Soup",
            "Spicy Fish Stew",
            "Spinned Bean Paste Soup",
            "Stew Made With Frozen Pollack",
            "Sundae Soup",
            "Sweet Potato Soup",
            "Tofu Chagle",
            "Tofu Kimchi Egg Soup",
            "Wanjatang",
            "Webfoot Octopus Lotus Pot Soup",
            "Yeonpo-Tang"

    };
    int[] soup_images = {
            R.drawable.ae_stew,
            R.drawable.seaweed_soup,
            R.drawable.sea_mustard_soup,
            R.drawable.dried_pollack_soup,
            R.drawable.fish_roe_soup,
            R.drawable.clam_soup,
            R.drawable.chochi_soup,
            R.drawable.radish_paste_soup,
            R.drawable.bean_sprout_soup,
            R.drawable.toran_stew,
            R.drawable.opening_soup,
            R.drawable.hot_spicy_meat_stew,
            R.drawable.cod_soup,
            R.drawable.naengi_soup,
            R.drawable.cabbage_soup,
            R.drawable.spinach_soup,
            R.drawable.aukguk,
            R.drawable.short_rib_soup,
            R.drawable.beef_bone_soup,
            R.drawable.tails_soup,
            R.drawable.samgyetang,
            R.drawable.seolleongtang,
            R.drawable.yongbongtang,
            R.drawable.heat_chicken_stew,
            R.drawable.chueotang,
            R.drawable.imja_water_soup,
            R.drawable.cold_chicken_stew,
            R.drawable.cold_cucumber_soup,
            R.drawable.umu_cold_soup,
            R.drawable.soy_bean_paste_stew,
            R.drawable.wild_chive_soy_bean_paste_stew,
            R.drawable.bean_paste_stew,
            R.drawable.raw_beef_stew,
            R.drawable.cheonggukjang_stew,
            R.drawable.ecological_stew,
            R.drawable.soft_tofu_stew,
            R.drawable.oyster_tofu_stew,
            R.drawable.salted_pollack_roe_stew,
            R.drawable.salted_zucchini_soup_stew,
            R.drawable.kimchi_stew,
            R.drawable.beef_stew,
            R.drawable.mushroom_stew,
            R.drawable.sea_bream_noodles,
            R.drawable.seafood_stew,
            R.drawable.octopus_stew,
            R.drawable.tofu_stew,
            R.drawable.potato_chili_paste_stew,
            R.drawable.perilla_soup,
            R.drawable.mussel_seaweed_soup,
            R.drawable.clear_soup_with_cod,
            R.drawable.burdock_perilla_soup,
            R.drawable.soybean_paste_soup_with_vegetables,
            R.drawable.thick_soybean_paste_soup,
            R.drawable.soybean_paste_soup_with_ramie_clam,
            R.drawable.spicy_seafood_soup,
            R.drawable.seaweed_cucumber_cold_soup,
            R.drawable.seafood_egg_soup,
            R.drawable.chicken_stew,
            R.drawable.fresh_fish_soup,
            R.drawable.seaweed_soup_with_new_egg_mussels,
            R.drawable.oyster_soup,
            R.drawable.pork_back_bone_stew,
            R.drawable.chwinamul_soy_bean_paste_soup,
            R.drawable.mushroom_soft_tofu_perilla_soup,
            R.drawable.oyster_kimchi_soup_and_rice,
            R.drawable.salted_pollack_roe_tofu_stew,
            R.drawable.dongtae_spicy_soup,
            R.drawable.sea_cucumber_nurungji_soup,
            R.drawable.spicy_rockfish_soup,
            R.drawable.blue_crab_stew,
            R.drawable.eel_chives_soup,
            R.drawable.toran_soup,
            R.drawable.octopus_yeonpo_soup,
            R.drawable.toenmi_soy_bean_paste_soup,
            R.drawable.shiitake_beef_brisket_doenjang_stew,
            R.drawable.mussel_clear_soup,
            R.drawable.radish_bean_sprout_soup,
            R.drawable.spicy_sausage_stew,
            R.drawable.pork_kimchi_stew,
            R.drawable.beef_radish_soup,
            R.drawable.squid_radish_soup,
            R.drawable.mussel_fish_cake_soup,
            R.drawable.seaweed_oyster_soup,
            R.drawable.bean_sprout_hangover_soup,
            R.drawable.bean_sprout_mushroom_stew,
            R.drawable.beef_cabbage_soup,
            R.drawable.blue_crab_soup,
            R.drawable.bone_soup,
            R.drawable.cheonggukjang_jjigae,
            R.drawable.cheonggukjang,
            R.drawable.chicken_soup,
            R.drawable.cold_raw_fish_soup,
            R.drawable.cold_soybean_paste_soup,
            R.drawable.crucible_bath,
            R.drawable.dried_pollack_hangover_soup,
            R.drawable.eojuk,
            R.drawable.fish_cake_soup,
            R.drawable.galnaktang,
            R.drawable.ge_gukji,
            R.drawable.gulguk,
            R.drawable.jorangi_tteokguk,
            R.drawable.kongbiji,
            R.drawable.kongtang,
            R.drawable.mushroom_perilla_soup,
            R.drawable.mussel_soup,
            R.drawable.nurungji_chicken_soup,
            R.drawable.octopus_lotus_pot_stew,
            R.drawable.odengguk,
            R.drawable.perilla_taro_soup,
            R.drawable.pollack_soup,
            R.drawable.pollack_tofu_stew,
            R.drawable.pork_and_hot_pepper_paste_stew,
            R.drawable.rice_cake_dumpling_soup,
            R.drawable.sea_urchin_seaweed_soup,
            R.drawable.seaweed_cold_soup,
            R.drawable.seonji_haejangguk,
            R.drawable.seonjitguk,
            R.drawable.shrimp_soft_tofu_egg_soup,
            R.drawable.spicy_fish_stew,
            R.drawable.spinned_bean_paste_soup,
            R.drawable.stew_made_with_frozen_pollack,
            R.drawable.sweet_potato_soup,
            R.drawable.tofu_chagle,
            R.drawable.tofu_kimchi_egg_soup,
            R.drawable.wanjatang

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_soup);

        gv_soup = findViewById(R.id.gv_soup);

        CustomAdapter customAdapter = new CustomAdapter(soup_names, soup_images,this);

        gv_soup.setAdapter(customAdapter);

        gv_soup.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName = soup_names[i];
                int selectedImage = soup_images[i];

                startActivity(new Intent(SecondaryActivity_soup.this, Fooddescription.class).putExtra("name",selectedName).putExtra("image",selectedImage));
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
                view = layoutInflater.inflate(R.layout.gv_soup_rowitems, viewGroup, false);
            }

            TextView tv_soup = view.findViewById(R.id.tv_soup);
            ImageView iv_soup = view.findViewById(R.id.iv_soup);

            tv_soup.setText(imageNames[i]);
            iv_soup.setImageResource(imagePhotos[i]);

            return view;
        }
    }
}