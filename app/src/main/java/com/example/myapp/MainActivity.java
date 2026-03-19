package com.example.myapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText edMin, edMax;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        TextView tv = findViewById(R.id.tv);
        edMin=findViewById(R.id.edMin);
        edMax=findViewById(R.id.edMax);

        b.setOnClickListener(  v -> {
            int min = Integer.parseInt(edMin.getText().toString());
            int max = Integer.parseInt(edMax.getText().toString());
            Random random = new Random();
            int r = random.nextInt(100);
            tv.setText(Integer.toString(r));
            b.setText("Plin");
        });

    }

}