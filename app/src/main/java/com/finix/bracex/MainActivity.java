package com.finix.bracex;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the correct splash screen layout
        setContentView(R.layout.activity_main);

        // Add a delay before navigating to the Login Activity
        new Handler().postDelayed(() -> {
            // Intent to navigate to Login Activity
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);

            // Finish the current activity to prevent returning to splash screen
            finish();
        }, 2000); // 3-second delay
    }
}
