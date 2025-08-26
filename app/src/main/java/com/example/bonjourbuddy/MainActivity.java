package com.example.bonjourbuddy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        Button_Black.setOnClickListener(this);
        Button_Green.setOnClickListener(this);
        Button_Purple.setOnClickListener(this);
        Button_Red.setOnClickListener(this);
        Button_Yellow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int clickButtonId = view.getId();

        if(clickButtonId == R.id.Button_Black) {
            PlaySounds(R.raw.black_color_sound);
        } else if (clickButtonId == R.id.Button_Green) {
            PlaySounds(R.raw.green_color_sound);
        } else if (clickButtonId == R.id.Button_Purple) {
            PlaySounds(R.raw.purple_color_sound);
        } else if (clickButtonId == R.id.Button_Red) {
            PlaySounds(R.raw.red_color_sound);
        } else {
            PlaySounds(R.raw.yellow_color_sound);
        }
    }

    public void PlaySounds(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }
}
