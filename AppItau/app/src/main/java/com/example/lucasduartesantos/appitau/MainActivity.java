package com.example.lucasduartesantos.appitau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView valor;
    private Integer valortotal = 0;
    private EditText saldo;
    private TextView error;
    private boolean validate = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.valor);
        saldo = findViewById(R.id.saldo);
        error = findViewById(R.id.erro);

    }

    public void erro (){
        int saldoDigitado = Integer.valueOf(saldo.getText().toString());
        if(valortotal > saldoDigitado){
            error.setText("Saldo insuficiente");
            validate = false;
        }
        validate = true;
    }


    public void somar1 (View v){
        if (validate) {
            valortotal += 1;
            valor.setText(valortotal + "");
        }
    }

    public void somar10 (View v){
        valortotal += 10;
        valor.setText(valortotal+"");
       // erro();
    }


    public void somar50 (View v){
        valortotal += 50;
        valor.setText(valortotal+"");
       // erro();
    }


    public void somar100 (View v){
        valortotal += 100;
        valor.setText(valortotal+"");
       // erro();
    }

}
