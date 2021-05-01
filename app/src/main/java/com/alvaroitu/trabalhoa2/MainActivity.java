package com.alvaroitu.trabalhoa2;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button temperatura = findViewById(R.id.temperatura);
        Button moeda = findViewById(R.id.moeda);


    }
}