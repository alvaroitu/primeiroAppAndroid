package com.alvaroitu.trabalhoa2;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

public class Temperatura extends AppCompatActivity {

    EditText celsiusEntrada;
    TextView celsiusSaida;
    EditText fareheintEntrada;
    TextView fareheintSaida;
    Button btnCalcCelsiusToFareheint;
    Button btnCalcFareheintToCelsius;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        celsiusEntrada = findViewById(R.id.celsiusEntrada);
        celsiusSaida = findViewById(R.id.celsiusSaida);
        fareheintEntrada = findViewById(R.id.fareheintEntrada);
        fareheintSaida = findViewById(R.id.fareheintSaida);
        btnCalcCelsiusToFareheint = (Button) findViewById(R.id.celsiusToFareheint);
        btnCalcFareheintToCelsius = (Button) findViewById(R.id.fareheintToCelsius);
        btnClear = (Button) findViewById(R.id.clearTemp);

        final DecimalFormat df = new DecimalFormat("0.00");

        btnCalcCelsiusToFareheint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fareheintCalc = (Double.parseDouble(celsiusEntrada.getEditableText().toString()) * 1.8 ) + 32 ;
                fareheintSaida.setText(df.format(fareheintCalc)+"°F");
            }
        });

        btnCalcFareheintToCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double celsiusCalc = (Double.parseDouble(fareheintEntrada.getEditableText().toString()) - 32 ) / 1.8 ;
                celsiusSaida.setText(df.format(celsiusCalc)+"°C");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celsiusEntrada.setText("");
                fareheintEntrada.setText("");
                celsiusSaida.setText(R.string.valorInicialTempC);
                fareheintSaida.setText(R.string.valorInicialTempF);
            }
        });


    }
}