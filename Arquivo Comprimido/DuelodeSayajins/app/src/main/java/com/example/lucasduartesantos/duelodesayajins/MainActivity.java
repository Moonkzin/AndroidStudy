package com.example.lucasduartesantos.duelodesayajins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView msgGoku;
    private TextView msgVegeta;
    int gokuVida = 100;
    int vegetaVida = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msgGoku = findViewById(R.id.textGoku);
        msgVegeta = findViewById(R.id.textVegeta);

    }

    public void gokuApanha (View v){
        gokuVida -= 15;
        msgGoku.setText("KI: "+gokuVida);
    }


    public void vegetaApanha (View v){
        vegetaVida -= 15;
        msgVegeta.setText("Vegeta apanhou");
    }

}
