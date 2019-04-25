package br.com.doctum.optativa.aulamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarActivity extends AppCompatActivity {

    MainActivity activityMain = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        Button salvar = findViewById(R.id.salvarBotao);

        //atribui os campos de texto as variaveis
        final EditText nome = findViewById(R.id.campoNome);
        final EditText email= findViewById(R.id.campoEmail);
        final EditText telefone = findViewById(R.id.campoTelefone);
        final EditText idade = findViewById(R.id.campoIdade);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //pega o texto dos campos de texto
                String nomeAluno = nome.getText().toString();
                String emailAluno = email.getText().toString();
                String telefoneAluno = telefone.getText().toString();
                int idadeAluno = Integer.parseInt(idade.getText().toString());

                //instancia um objeto do tipo aluno e salva os dados do que vamos cadastrar
                Aluno aluno = new Aluno();
                aluno.id = Aluno.GetIstance().getAlunos().size() + 1;
                aluno.nome = nomeAluno;
                aluno.email = emailAluno;
                aluno.telefone = telefoneAluno;
                aluno.idade = idadeAluno;

                //vai tentar salvar, se no conseguir mostra um toast
                try {
                    Aluno.GetIstance().getAlunos().add(aluno);
                    alert(nomeAluno + " Salvo com sucesso. QTDE: " + Integer.toString(Aluno.GetIstance().getAlunos().size()));

                    Log.i("alunos no array:", Integer.toString(Aluno.GetIstance().getAlunos().size()));

                    Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(intent);
                } catch (Exception ex) {
                    alert("Erro ao salvar aluno");
                    Log.i("erro ao salvar", "erro ao salvar aluno");
                }

            }
        });
    }

    //pra mostar os Toast
    public void alert(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
    }
}
