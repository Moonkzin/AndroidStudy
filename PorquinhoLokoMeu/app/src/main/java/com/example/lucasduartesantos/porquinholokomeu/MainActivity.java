package com.example.lucasduartesantos.porquinholokomeu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView msg;
    private EditText deposito;
    private TextView valor;
    private Integer valortotal = 0;
    private EditText valor1;
    private TextView msgAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = findViewById(R.id.menssage);
        deposito = findViewById(R.id.deposito);
        valor = findViewById(R.id.valor);
        valor1 = findViewById(R.id.valor1);
        msgAtual = findViewById(R.id.msgAtual);
    }

    public void msg (View v){
        int saldoDigitado = Integer.valueOf(deposito.getText().toString());

        if(msgAtual.length() == 0){
            valortotal += saldoDigitado;
            valor.setText("Total depositado no porquinho "+ valortotal + "");
            msgAtual.setText("Não vamos cololocar meta,Vamos deixar a meta aberta, mas quado" +
                    "atingirmo a meta, vamos dobrar a meta");
        } else {

        int valorInformado = Integer.valueOf(valor1.getText().toString());
        valortotal += saldoDigitado;
        valor.setText("Total depositado no porquinho "+ valortotal + "");
        if(valortotal < valorInformado){
            msgAtual.setText("Faltam " + (valorInformado-valortotal) +" Para atingir sua meta de "+ valorInformado +"");
        } else if (valortotal == valorInformado){
            msgAtual.setText("Parabéns, você atingiu sua meta!");
        } else if (valortotal > valorInformado){
            valortotal -= saldoDigitado;
            valor.setText("Total depositado no porquinho "+ valortotal + "");
        }
        }





    }

}
