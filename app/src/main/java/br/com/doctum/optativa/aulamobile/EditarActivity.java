package br.com.doctum.optativa.aulamobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EditarActivity extends LifeCycle {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        /*public class EditarPessoa extends activity_editar {

            private EditText campoNome;
            private EditText campoEmail;
            private EditText campoTelefone;
            private EditText campoIdade;
            private Long id;

            @Override
            protected void onCreate(Bundle icicle) {
                super.onCreate(icicle);

               setContentView(R.layout.form_editar_pessoa);

                campoNome = (EditText) findViewById(R.id.campoNome);
                campoEmail = (EditText) findViewById(R.id.campoEmail);
                campoTelefone = (EditText) findViewById(R.id.campoTelefone);
                campoIdade = (EditText) findViewById(R.id.campoIdade);

                id = null;

                Bundle extras = getIntent().getExtras();
                // Se for para Editar, recuperar os valores ...
                if (extras != null) {
                    id = extras.getLong(Pessoas._ID);

                    if (id != null) {
                        Pessoa p = buscarPessoa(id);
                        campoNome.setText(p.nome);
                        campoEmail.setText(p.email);
                        campoTelefone.setText(p.telefone);
                        campoIdade.setText(String.valueOf(p.idade));
                    }
                }*/

    }
}
