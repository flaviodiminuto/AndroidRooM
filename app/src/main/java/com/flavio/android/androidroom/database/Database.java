package com.flavio.android.androidroom.database;

import com.flavio.android.androidroom.dao.PessoaDao;
import com.flavio.android.androidroom.model.Pessoa;

import androidx.room.RoomDatabase;

@androidx.room.Database ( entities = {Pessoa.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {
    public abstract PessoaDao getPessoaDao();
}
