package com.alvaroitu.trabalhoa2;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button temperatura;
    Button moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperatura = (Button) findViewById(R.id.temperatura);
        moeda  = (Button) findViewById(R.id.moeda);

        temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Temperatura.class);
                startActivity(intent);
            }
        });

        moeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Moeda.class);
                startActivity(intent);

            }
        });

    }

}
