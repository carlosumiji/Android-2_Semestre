package br.com.fiap.exerciciopersistencia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getSharedPreferences("config", MODE_PRIVATE);

        boolean exibir = sp.getBoolean("exibir", true);
        int tempo      = sp.getInt("tempo", 10000);

        if (exibir) {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    abrirDashboard();
                }
            }, tempo);
        } else {
            abrirDashboard();
        }
    }

    private void abrirDashboard() {
        Intent it = new Intent(MainActivity.this, DashboardActivity.class);
        startActivity(it);
        finish();
    }
}
