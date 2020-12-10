package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_toprimary;
    private EditText et_name;
    private String str_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_name);

        btn_toprimary = findViewById(R.id.btn_toprimary);
        btn_toprimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_name = et_name.getText().toString();
                Intent intent_main = new Intent(MainActivity.this , PrimaryActivity.class);
                intent_main.putExtra("str_name", str_name);
                startActivity(intent_main); // Transition from the main menu to primary menu
            }
        });

    }
}