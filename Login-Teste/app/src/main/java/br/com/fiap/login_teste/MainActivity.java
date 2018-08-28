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
        chkSalvar = findViewById(R.id.chkSalvar);

        sp = getSharedPreferences("login", MODE_PRIVATE);

        boolean salvar = sp.getBoolean("salvar",false);
        String usuario = sp.getString("usuario", null);
        String senha = sp.getString("senha",null);

        getSupportActionBar().setTitle("lOGIN");

        chkSalvar.setChecked(salvar);
        edtUsuario.setText(usuario);
        edtSenha.setText(senha);

    }

    public void logar(View view) {

        String nome =  edtUsuario.getText().toString();
        String vsenha = edtSenha.getText().toString();

        if(nome.equalsIgnoreCase("FIAP") && vsenha.equals("123456") ){
            SharedPreferences.Editor editor =  sp.edit();

            if(chkSalvar.isChecked()){
                boolean salvar = chkSalvar.isChecked();
                String usuario = edtUsuario.getText().toString();
                String senha = edtSenha.getText().toString();

                editor.putBoolean("salvar",true);
                editor.putString("usuario", usuario);
                editor.putString("senha", senha);
                editor.commit();

            }else{
                editor.putBoolean("salvar",false);
                editor.putString("usuario", null);
                editor.putString("senha",null);
                editor.commit();
            }

            Toast.makeText(this, R.string.sucesso, Toast.LENGTH_SHORT).show();
            Intent it = new Intent(this ,PreferenciasActivity.class);
            startActivity(it);

        }else {
            Toast.makeText(this, R.string.errou, Toast.LENGTH_SHORT).show();
        }
    }
}
