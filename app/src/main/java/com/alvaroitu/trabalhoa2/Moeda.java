package com.alvaroitu.trabalhoa2;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

public class Moeda extends AppCompatActivity {

    EditText valorEntrada;

    RadioGroup radioGroup;
    RadioButton rbPesosMex;
    RadioButton rbDolares;
    RadioButton rbIenes;
    RadioButton rbSolsPeru;

    TextView tvPesosMex;
    TextView tvDolares;
    TextView tvIenes;
    TextView tvSolsPeru;

    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda);

        valorEntrada = findViewById(R.id.valorEntrada);

        radioGroup = findViewById(R.id.radioGroup);
        rbPesosMex = (RadioButton) findViewById(R.id.rbPesosMex);
        rbDolares = (RadioButton) findViewById(R.id.rbDolares);
        rbIenes = (RadioButton) findViewById(R.id.rbIenes);
        rbSolsPeru = (RadioButton) findViewById(R.id.rbSolsPeru);

        tvPesosMex = findViewById(R.id.tvPesosMex);
        tvDolares = findViewById(R.id.tvDolares);
        tvIenes = findViewById(R.id.tvIenes);
        tvSolsPeru = findViewById(R.id.tvSolsPeru);

        btnClear = (Button) findViewById(R.id.clearMoeda);

        final DecimalFormat df = new DecimalFormat("0.00");

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                try {
                    if (rbPesosMex.isChecked()) {
                        double valorEmPesosMex = Double.parseDouble(valorEntrada.getEditableText().toString()) * 6.06025315;
                        tvPesosMex.setText("$ " + df.format(valorEmPesosMex));
                    } else{
                        tvPesosMex.setText(R.string.valorInicial);
                    }
                    if (rbDolares.isChecked()) {
                        double valorEmDolares = Double.parseDouble(valorEntrada.getEditableText().toString()) * 0.491232;
                        tvDolares.setText("$ " + df.format(valorEmDolares));
                    }else{
                        tvDolares.setText(R.string.valorInicial);
                    }
                    if (rbIenes.isChecked()) {
                        double valorEmIenes = Double.parseDouble(valorEntrada.getEditableText().toString()) * 50.2899263;
                        tvIenes.setText("$ " + df.format(valorEmIenes));
                    }else{
                        tvIenes.setText(R.string.valorInicial);
                    }
                    if (rbSolsPeru.isChecked()) {
                        double valorEmSolsPeru = Double.parseDouble(valorEntrada.getEditableText().toString()) * 1.2997997;
                        tvSolsPeru.setText("$ " + df.format(valorEmSolsPeru));
                    }else{
                        tvSolsPeru.setText(R.string.valorInicial);
                    }
                } catch (Exception e){
                    Toast.makeText(Moeda.this, "entre com valores...", Toast.LENGTH_SHORT).show();
                    radioGroup.clearCheck();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    valorEntrada.setText("");
                    tvPesosMex.setText(R.string.valorInicial);
                    tvDolares.setText(R.string.valorInicial);
                    tvIenes.setText(R.string.valorInicial);
                    tvSolsPeru.setText(R.string.valorInicial);
                    radioGroup.clearCheck();
            }
        });
    }
}