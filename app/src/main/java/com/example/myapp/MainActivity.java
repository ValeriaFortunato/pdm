package com.example.myapp;

import ...

public class MainActivity extends AppCompatActivity {

    Button b;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        TextView tv = findViewById(R.id.tv);

        b.setOnClickListener( View v -> {
            contador++;
            Random random = new Random();
            int r = random.nextInt(100);
            tv.setText(Integer.toString(r));
            b.setText("Plin");
        });

    }

}