package br.com.fiap.login_teste;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class PreferenciasActivity extends AppCompatActivity {

    RadioButton rbVermelho;
    RadioButton rbAzul;
    RadioButton rbVerde;

    LinearLayout llPreferencias;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        rbVermelho = findViewById(R.id.rbVermelho);
        rbAzul = findViewById(R.id.rbAzul);
        rbVerde = findViewById(R.id.rbVerde);
        llPreferencias = findViewById(R.id.llPreferencias);

        getSupportActionBar().setTitle("Preferências");

        sp = getSharedPreferences("bgColor", MODE_PRIVATE);
        String color = sp.getString("color", "");

        String cor = color.toString();

        if(cor.equalsIgnoreCase("RED"))
        {
            llPreferencias.setBackgroundColor(Color.RED);
        }

        if(cor.equalsIgnoreCase("GREEN"))
        {
            llPreferencias.setBackgroundColor(Color.GREEN);
        }

        if(cor.equalsIgnoreCase("BLUE"))
        {
            llPreferencias.setBackgroundColor(Color.BLUE);
        }
    }

    public void Salvar(View view) {

        SharedPreferences.Editor editor = sp.edit();

        if(rbVermelho.isChecked())
        {
            String cor = "RED";
            editor.putString("color", cor);
            editor.commit();
            llPreferencias.setBackgroundColor(Color.RED);
        }

        if(rbVerde.isChecked())
        {
            String cor = "GREEN";
            editor.putString("color", cor);
            editor.commit();
            llPreferencias.setBackgroundColor(Color.GREEN);
        }

        if(rbAzul.isChecked())
        {
            String cor = "BLUE";
            editor.putString("color", cor);
            editor.commit();
            llPreferencias.setBackgroundColor(Color.BLUE);
        }

    }
}













