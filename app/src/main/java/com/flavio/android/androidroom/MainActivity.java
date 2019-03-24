package com.flavio.android.androidroom;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Toast;

import com.flavio.android.androidroom.dao.PessoaDao;
import com.flavio.android.androidroom.database.Database;
import com.flavio.android.androidroom.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pessoa> pessoas = new ArrayList <> (  );

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Pessoa flavio = new Pessoa ( 0,30,"Flavio","Desenvolvedor" );
        Pessoa lucas = new Pessoa ( 0,20, "Lucas","Estudante" );
        Pessoa natalia = new Pessoa ( 0,18,"Natalia","Estudante" );
        Pessoa paloma = new Pessoa ( 0,25,"Paloma", "CEO" );

        pessoas.add( flavio );
        pessoas.add ( lucas );
        pessoas.add ( natalia );
        pessoas.add ( paloma );

        salvaPessoa ();
    }

    private void salvaPessoa(){
        PessoaDao dao = Room
                .databaseBuilder ( this,Database.class, "database.db" )
                .allowMainThreadQueries ()
                .build ()
                .getPessoaDao ();

        for(Pessoa pessoa : pessoas) {
            dao.salvar ( pessoa );
        }
        Toast.makeText ( this, "Pessoas Salvas", Toast.LENGTH_SHORT ).show ();
    }
}
