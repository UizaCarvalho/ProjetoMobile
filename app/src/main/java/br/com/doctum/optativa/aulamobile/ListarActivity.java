package br.com.doctum.optativa.aulamobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListarActivity extends LifeCycle{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        Toast.makeText(getApplicationContext(), Integer.toString(Aluno.GetIstance().getAlunos().size()), Toast.LENGTH_LONG);
        int i;
        for(i = 0; i < Aluno.GetIstance().getAlunos().size(); i++) {
            mostrarNoLog("ID:", Integer.toString(Aluno.GetIstance().getAlunos().get(i).id));
            mostrarNoLog("Nome:", Aluno.GetIstance().getAlunos().get(i).nome);
            mostrarNoLog("Email:", Aluno.GetIstance().getAlunos().get(i).email);
            mostrarNoLog("Telefone:", Aluno.GetIstance().getAlunos().get(i).telefone);
            mostrarNoLog("Idade:", Integer.toString(Aluno.GetIstance().getAlunos().get(i).idade));
            mostrarNoLog("", "========");


        }


    }

    public void mostrarNoLog(String tag, String msg) {
        Log.i(tag, msg);
    }
}
