package br.com.bandtec.projeto03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // métodos públicos e com um argumento do tipo View
    // podem ser associados a eventos de componentes
    public void exibirMensagem(View v) {
        // exibindo uma mensagem simples com Toast
        // Toast.makeText(this, "Boa noite", Toast.LENGTH_SHORT).show();

        // recuperamos o elemento de id "editNome" do XML
        EditText editNome = findViewById(R.id.editNome);

        // ex: recuperando o texto do componente
        String nomeDigitado = editNome.getText().toString();

//        Toast.makeText(this, "Você digitou "+ nomeDigitado,
//                Toast.LENGTH_SHORT).show();

        // ex: recuperando a TextView para alterar seu texto
        TextView texto1 = findViewById(R.id.texto1);
        texto1.setText("Você digitou "+nomeDigitado);

    }

}





