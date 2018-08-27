package br.com.bandtec.projeto05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editN1;
    private EditText editN2;
    private TextView txtResultado;
    private TextView txtContador;

    private Integer contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instanciando os componentes desejados
        editN1 = findViewById(R.id.editN1);
        editN2 = findViewById(R.id.editN2);
        txtResultado = findViewById(R.id.txtResultado);
        txtContador = findViewById(R.id.txtContador);
    }

    public void calcular(View botao) {
        double n1 = Double.valueOf(editN1.getText().toString());
        double n2 = Double.valueOf(editN2.getText().toString());

        double resultado = 0;
        // como descobrir qual elemento foi clicado
//        if (botao.getId() == R.id.botaoSomar) {
//            resultado = (n1+n2);
//        } else {
//            resultado = (n1-n2);
//        }
        switch (botao.getId()) {
            case R.id.botaoSomar:
                resultado = (n1+n2);
                break;
            case R.id.botaoSubtrair:
                resultado = (n1-n2);
                break;
        }

        txtResultado.setText("Resultado: "+resultado);
        aumentarContador();
    }

    public void somar(View v) {
        double n1 = Double.valueOf(editN1.getText().toString());
        double n2 = Double.valueOf(editN2.getText().toString());

        txtResultado.setText("Resultado: "+(n1+n2));
        aumentarContador();
    }

    public void subtrair(View v) {
        double n1 = Double.valueOf(editN1.getText().toString());
        double n2 = Double.valueOf(editN2.getText().toString());

        txtResultado.setText("Resultado: "+(n1-n2));
        aumentarContador();
    }

    private void aumentarContador() {
        contador++;
        txtContador.setText("Operações: " + contador);
    }
}



