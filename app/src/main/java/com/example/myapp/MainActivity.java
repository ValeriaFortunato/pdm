package com.example.myapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView tv;
    EditText edmin, edmax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        tv = findViewById(R.id.tv);
        edmin = findViewById(R.id.edMin);
        edmax = findViewById(R.id.edMax);

        b.setOnClickListener(v -> {

            String minStr = edmin.getText().toString();
            String maxStr = edmax.getText().toString();

            if (minStr.isEmpty()) {
                edmin.setError("Informe um valor mínimo");
                return;
            }

            if (maxStr.isEmpty()) {
                edmax.setError("Informe um valor máximo");
                return;
            }

            int min = Integer.parseInt(minStr);
            int max = Integer.parseInt(maxStr);

            Random random = new Random();

            int r = random.nextInt((max - min) + 1) + min;

            tv.setText(String.valueOf(r));
        });
    }
}