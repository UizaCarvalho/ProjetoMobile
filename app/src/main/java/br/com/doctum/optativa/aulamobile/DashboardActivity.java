package br.com.doctum.optativa.aulamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DashboardActivity extends LifeCycle {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView TextCadastrar = findViewById(R.id.Cadastrar);
        TextCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityPraAbrir = new Intent(getApplicationContext(), CadastrarActivity.class);
                startActivity(activityPraAbrir);
            }
        });
        TextView TextListar = findViewById(R.id.iconListar);
        TextListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityPraAbrir = new Intent(getApplicationContext(), ListarActivity.class);
                startActivity(activityPraAbrir);
            }
        });
        TextView TextEditar = findViewById(R.id.iconEditar);
        TextEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityPraAbrir = new Intent(getApplicationContext(), EditarActivity.class);
                startActivity(activityPraAbrir);
            }
        });
        TextView TextConfigurações = findViewById(R.id.iconConfig);
        TextConfigurações.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityPraAbrir = new Intent(getApplicationContext(), ConfiguracoesActivity.class);
                startActivity(activityPraAbrir);
            }
        });
    }
}
