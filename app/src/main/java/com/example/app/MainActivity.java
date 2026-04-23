package com.example.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView tv;
    EditText edmin, edmax;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        tv = findViewById(R.id.tv);

        edmin = findViewById(R.id.edMin);
        edmax = findViewById(R.id.edMax);

        b.setOnClickListener(v -> {

            String minStr = edmin.getText().toString();
            String maxStr = edmax.getText().toString();

            if (minStr.isEmpty()) {
                edmin.setError("Informe o valor mínimo");
                return;
            }

            if (maxStr.isEmpty()) {
                edmax.setError("Informe o valor máximo");
                return;
            }

            int min = Integer.parseInt(minStr);
            int max = Integer.parseInt(maxStr);

            if (min >= max) {
                edmax.setError("O máximo deve ser maior que o mínimo");
                return;
            }

            contador++;

            Random random = new Random();
            int r = random.nextInt(max - min) + min;

            tv.setText(String.valueOf(r));
        });
    }
}