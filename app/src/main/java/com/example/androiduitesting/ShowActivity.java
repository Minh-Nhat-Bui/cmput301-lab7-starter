package com.example.androiduitesting;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    public static final String EXTRA_CITY_NAME = "EXTRA_CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView nameView = findViewById(R.id.show_city_name);
        Button back = findViewById(R.id.button_back);

        String city = getIntent().getStringExtra(EXTRA_CITY_NAME);
        if (city != null) {
            nameView.setText(city);
        }

        // Explicit back button to go back to MainActivity
        back.setOnClickListener(v -> finish());
    }
}