package br.com.fiap.login_teste;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtSenha;
    CheckBox chkSalvar;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

    }

    public void logar(View view) {

        String nome =  edtUsuario.getText().toString();
        String senha = edtSenha.getText().toString();

        if(nome.equals("FIAP") && senha.equals("123456") ){
            Toast.makeText(this, R.string.sucesso, Toast.LENGTH_SHORT).show();
            Intent it = new Intent(this ,PreferenciasActivity.class);
            startActivity(it);

        }else {
            Toast.makeText(this, R.string.errou, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, edtUsuario.getText().toString(), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, edtSenha.getText().toString(), Toast.LENGTH_SHORT).show();
        }

    }
}
