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

/** Snack recipe list with photos */
public class SecondaryActivity_snack extends AppCompatActivity {

    GridView gv_snack;

    String[] snack_names = {"Thick Rice Cake",
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
            "Omija Fruit Salad",
            "Citron Fruit Salad",
            "Onesobyung",
            "Ginger Dry Fruit",
            "Walnut Crackers",
            "A Fish-Shaped Bun",
            "A Plum Crop",
            "Bacon Rice Cake Skewers",
            "Baekseolg",
            "Bar Rice Cake",
            "Chicken Kebabs",
            "Cloud Rice Cake",
            "Crispy Rice Crust",
            "Dorajigwa",
            "Dried Persimmon Walnut Wraps",
            "Gamjazugoroke",
            "Ginger Process",
            "Ginseng Process",
            "Grilled Rice Cake",
            "Honey Bread",
            "Honey Butter Sweet Potato",
            "Honey Rice Cake",
            "Mugwort Rice Cake",
            "Patbings",
            "Potato Songpyeon",
            "Puffed Rice",
            "Red Bean Jelly",
            "Rice Ball",
            "Rice Burger",
            "Rice Tteokbokki",
            "Royal Tteokbokki",
            "Shirutteok",
            "Small Walnut-Flavored Cake",
            "Steamed Buns",
            "Stir-Fried Rice Cake",
            "Triangular Rolled-Rice Gimbap",
            "Yugwa"

    };
    int[] snack_images = {
            R.drawable.thick_rice_cake,
            R.drawable.snow_white,
            R.drawable.rainbow_rice_cake,
            R.drawable.songpyeon,
            R.drawable.cinnamon_rice_cake,
            R.drawable.yak_bap,
            R.drawable.pumpkin_rice_cake,
            R.drawable.patsirutteok,
            R.drawable.injeolmi,
            R.drawable.pounded_rice_cake,
            R.drawable.juak,
            R.drawable.chalsujubukkumi,
            R.drawable.hwajeon,
            R.drawable.gyeongdan,
            R.drawable.danja,
            R.drawable.yakgwa,
            R.drawable.maejakgwa,
            R.drawable.gangjeong,
            R.drawable.tea_confectionery,
            R.drawable.balloon_flower_garden_and,
            R.drawable.lotus_root_pavilion,
            R.drawable.ginger_eggs,
            R.drawable.yulan,
            R.drawable.bamcho,
            R.drawable.jujube_grass,
            R.drawable.omija_jelly,
            R.drawable.omija_fruit_salad,
            R.drawable.citron_fruit_salad,
            R.drawable.onesobyung,
            R.drawable.ginger_dry_fruit,
            R.drawable.walnut_crackers,
            R.drawable.a_fish_shaped_bun,
            R.drawable.a_plum_crop,
            R.drawable.bacon_rice_cake_skewers,
            R.drawable.bar_rice_cake,
            R.drawable.chicken_kebabs,
            R.drawable.cloud_rice_cake,
            R.drawable.crispy_rice_crust,
            R.drawable.dorajigwa,
            R.drawable.gamjazugoroke,
            R.drawable.ginger_process,
            R.drawable.ginseng_process,
            R.drawable.grilled_rice_cake,
            R.drawable.honey_bread,
            R.drawable.honey_butter_sweet_potato,
            R.drawable.honey_rice_cake,
            R.drawable.mugwort_rice_cake,
            R.drawable.potato_songpyeon,
            R.drawable.puffed_rice,
            R.drawable.red_bean_jelly,
            R.drawable.rice_ball,
            R.drawable.rice_burger,
            R.drawable.rice_tteokbokki,
            R.drawable.royal_tteokbokki,
            R.drawable.shirutteok,
            R.drawable.small_walnut_flavored_cake,
            R.drawable.steamed_buns,
            R.drawable.stir_fried_rice_cake

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_snack);

        gv_snack = findViewById(R.id.gv_snack);

        CustomAdapter customAdapter = new CustomAdapter(snack_names, snack_images,this);

        gv_snack.setAdapter(customAdapter);

        gv_snack.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName = snack_names[i];
                int selectedImage = snack_images[i];

                startActivity(new Intent(SecondaryActivity_snack.this, Fooddescription.class).putExtra("name",selectedName).putExtra("image",selectedImage));
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
                view = layoutInflater.inflate(R.layout.gv_snack_rowitems, viewGroup, false);
            }

            TextView tv_snack = view.findViewById(R.id.tv_snack);
            ImageView iv_snack = view.findViewById(R.id.iv_snack);

            tv_snack.setText(imageNames[i]);
            iv_snack.setImageResource(imagePhotos[i]);

            return view;
        }
    }
}