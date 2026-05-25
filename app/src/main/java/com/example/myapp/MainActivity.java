package com.example.myapp;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    Button btn;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.button);
        et = findViewById(R.id.et);


        btn.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            String msg=et.getText().toString();
            i.putExtra("msg", msg);
            startActivity(i);
        });




    }
}
