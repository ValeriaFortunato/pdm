package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText);
        btn = findViewById(R.id.btnFechar);

        btn.setOnClickListener(v -> {
            String msg = et.getText().toString();

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("msg", msg);

            startActivity(intent);
        });
    }
}