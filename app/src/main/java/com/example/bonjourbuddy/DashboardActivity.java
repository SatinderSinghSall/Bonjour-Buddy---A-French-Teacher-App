package com.example.bonjourbuddy;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dashboard_main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MaterialCardView cardColors = findViewById(R.id.cardColors);
        MaterialCardView cardFruits = findViewById(R.id.cardFruits);
        MaterialCardView cardAnimals = findViewById(R.id.cardAnimals);
        MaterialCardView cardNumbers = findViewById(R.id.cardNumbers);

        cardColors.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, MainActivity.class)));

        cardFruits.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, FruitsActivity.class)));

        cardAnimals.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, AnimalsActivity.class)));

        cardNumbers.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, NumbersActivity.class)));
    }
}
