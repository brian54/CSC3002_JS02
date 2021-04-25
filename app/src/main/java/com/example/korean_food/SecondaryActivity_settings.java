package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.ImageButton;

public class SecondaryActivity_settings extends AppCompatActivity {

    EditText et_settings_name;
    String shared_name = "file_name";
    private ImageButton ib_foodrecommendation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_settings);

        et_settings_name = (EditText)findViewById(R.id.et_settings_name);
        SharedPreferences sharedsettings_name = getSharedPreferences(shared_name, 0);
        String value_name = sharedsettings_name.getString("settings_name", "");
        et_settings_name.setText(value_name);

        ib_foodrecommendation = findViewById(R.id.ib_foodrecommendation);
        ib_foodrecommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_foodrecommendation = new Intent();
                intent_foodrecommendation.setClassName("org.tensorflow.lite.examples.recommendation", "org.tensorflow.lite.examples.recommendation.MainActivity");
                startActivity(intent_foodrecommendation);
            }
        });
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedsettings_name = getSharedPreferences(shared_name, 0);
        SharedPreferences.Editor editor_name = sharedsettings_name.edit();
        String value_name = et_settings_name.getText().toString();
        editor_name.putString("settings_name", value_name);
        editor_name.commit();

    };


}