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

/** Beverage recipe list with photos */
public class SecondaryActivity_beverage extends AppCompatActivity {

    GridView gv_beverage;

    String[] beverage_names = {"Plum Tea",
            "Ginseng Tea",
            "Ginger Tea",
            "Boiled Pear",
            "Persimmon Punch",
            "Sikhye",
            "Barley Tea",
            "Citron Tea",
            "Corn Tea",
            "Gu Gi-Cha",
            "Jujube Tea",
            "Powder Made Of Mixed Grains",
            "Quince Tea",
            "Ssanghwa-Cha",
            "Sweet Pumpkin Sikhye"

    };
    int[] beverage_images = {
            R.drawable.plum_tea,
            R.drawable.ginseng_tea,
            R.drawable.ginger_tea,
            R.drawable.boiled_pear,
            R.drawable.persimmon_punch,
            R.drawable.sikhye,
            R.drawable.barley_tea,
            R.drawable.citron_tea,
            R.drawable.gu_gi_cha,
            R.drawable.jujube_tea,
            R.drawable.powder_made_of_mixed_grains,
            R.drawable.quince_tea,
            R.drawable.ssanghwa_cha

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_beverage);

        gv_beverage = findViewById(R.id.gv_beverage);

        CustomAdapter customAdapter = new CustomAdapter(beverage_names, beverage_images,this);

        gv_beverage.setAdapter(customAdapter);

        gv_beverage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName = beverage_names[i];
                int selectedImage = beverage_images[i];

                startActivity(new Intent(SecondaryActivity_beverage.this, Fooddescription.class).putExtra("name",selectedName).putExtra("image",selectedImage));
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
                view = layoutInflater.inflate(R.layout.gv_beverage_rowitems, viewGroup, false);
            }

            TextView tv_beverage = view.findViewById(R.id.tv_beverage);
            ImageView iv_beverage = view.findViewById(R.id.iv_beverage);

            tv_beverage.setText(imageNames[i]);
            iv_beverage.setImageResource(imagePhotos[i]);

            return view;
        }
    }
}