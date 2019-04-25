package br.com.doctum.optativa.aulamobile;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends LifeCycle {

    final ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonEntrar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextUser = (EditText) findViewById(R.id.campoUsuario);
                String user = editTextUser.getText().toString();

                EditText editTextSenha = (EditText) findViewById(R.id.campoSenha);
                String senha = editTextSenha.getText().toString();

                if(user.equals("amaury") && senha.equals("123456")) {
                   Intent intent = new Intent(getContext(), DashboardActivity.class);
                   Bundle params = new Bundle();
                   params.putString("nome", user);
                   intent.putExtras(params);
                   startActivity(intent);
                }
                else{
                    alert("You shall not Pass !! Senha/Usuário incorreto(s)");
                }

            }
        });


    }

    public void alert(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public Context getContext() {
        return this;
    }

}
