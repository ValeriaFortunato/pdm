package com.example.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText Altura, Peso;
    TextView tvIMC;
    Button bntcalc;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Peso=findViewById(R.id.Peso);
        Altura=findViewById(R.id.Altura);
        tvIMC=findViewById(R.id.tvIMC);
        img=findViewById(R.id.img);
        bntcalc = findViewById(R.id.Calcular);


        bntcalc.setOnClickListener(v -> {
            String strAltura = Altura.getText().toString();
            Double alt = Double.parseDouble(strAltura);

            String strPeso = Peso.getText().toString();
            Double peso = Double.parseDouble(strPeso);

            Double conta = peso/(alt * alt);
            DecimalFormat dc = new DecimalFormat("##.##");

            tvIMC.setText(dc.format(conta));

        });
    }
}