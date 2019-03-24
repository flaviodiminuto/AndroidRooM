package com.flavio.android.androidroom.dao;

import com.flavio.android.androidroom.model.Pessoa;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface PessoaDao {

    @Insert
    void salvar(Pessoa pessoa);

    @Query("SELECT * FROM pessoa")
    List<Pessoa> todos();

    @Delete
    void remove(Pessoa pessoa);
}
