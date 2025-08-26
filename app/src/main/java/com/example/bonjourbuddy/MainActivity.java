package com.example.bonjourbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button Button_Black = findViewById(R.id.Button_Black);
        Button Button_Green = findViewById(R.id.Button_Green);
        Button Button_Purple = findViewById(R.id.Button_Purple);
        Button Button_Red = findViewById(R.id.Button_Red);
        Button Button_Yellow = findViewById(R.id.Button_Yellow);

        Button_Black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "French: Black.", Toast.LENGTH_SHORT).show();
            }
        });

        Button_Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "French: Green.", Toast.LENGTH_SHORT).show();
            }
        });

        Button_Purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "French: Purple.", Toast.LENGTH_SHORT).show();
            }
        });

        Button_Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "French: Red.", Toast.LENGTH_SHORT).show();
            }
        });

        Button_Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "French: Yellow.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
