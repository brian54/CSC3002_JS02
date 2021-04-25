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

/** Base dish recipe list with photos */
public class SecondaryActivity_basedish extends AppCompatActivity {

    GridView gv_basedish;

    String[] basedish_names = {"Brown Rice",
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
            "Oyster Rice",
            "Chicken Hotbed",
            "Bibimbap",
            "Janggukbap",
            "Five Grain Rice",
            "Grilled Radish Rice",
            "Rice With Seasoned Thistle",
            "Seaweed Abalone Porridge",
            "Bamboo Barrel Rice",
            "Bean Rice",
            "Bijibap",
            "Black Rice",
            "Black Sesame Skin",
            "Buckwheat Rice",
            "Carrot Rice",
            "Corn Rice",
            "Eggplant Rice",
            "Gijangbap",
            "Glutinous Rice",
            "Gondre Rice",
            "Joebap",
            "Lotus Leaf Rice",
            "Mixed Grain Rice",
            "Mukbap",
            "Mung Bean Rice",
            "Oat Rice",
            "Pibab",
            "Potato Rice",
            "Sorghum Rice",
            "White Rice",
            "Yakbap",
            "Yulmu Bap"

    };
    int[] basedish_images = {R.drawable.brown_rice,
            R.drawable.barley_rice,
            R.drawable.pea_rice,
            R.drawable.black_bean_rice,
            R.drawable.red_bean_rice,
            R.drawable.ogokbap,
            R.drawable.chestnut_rice,
            R.drawable.nutrition_stone_pot_rice,
            R.drawable.sweet_potato_rice,
            R.drawable.kimchi_rice,
            R.drawable.sliced_rice,
            R.drawable.bean_sprout_rice,
            R.drawable.oyster_rice,
            R.drawable.chicken_hotbed,
            R.drawable.bibimbap,
            R.drawable.janggukbap,
            R.drawable.five_grain_rice,
            R.drawable.grilled_radish_rice,
            R.drawable.rice_with_seasoned_thistle,
            R.drawable.seaweed_abalone_porridge,
            R.drawable.bamboo_barrel_rice,
            R.drawable.black_sesame_skin,
            R.drawable.gondre_rice,
            R.drawable.lotus_leaf_rice,
            R.drawable.mixed_grain_rice,
            R.drawable.mukbap
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_basedish);

        gv_basedish = findViewById(R.id.gv_basedish);

        CustomAdapter customAdapter = new CustomAdapter(basedish_names, basedish_images,this);

        gv_basedish.setAdapter(customAdapter);

        gv_basedish.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName = basedish_names[i];
                int selectedImage = basedish_images[i];

                startActivity(new Intent(SecondaryActivity_basedish.this, Fooddescription.class).putExtra("name",selectedName).putExtra("image",selectedImage));
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
                view = layoutInflater.inflate(R.layout.gv_basedish_rowitems, viewGroup, false);
            }

            TextView tv_basedish = view.findViewById(R.id.tv_basedish);
            ImageView iv_basedish = view.findViewById(R.id.iv_basedish);

            tv_basedish.setText(imageNames[i]);
            iv_basedish.setImageResource(imagePhotos[i]);

            return view;
        }
    }
}