package com.harshadachavan.todo;

/**
 * Created by Harshada Chavan on 10/11/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    //Creating final variables.
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "todo.application";

    //Constructor.
    public DBHelper(Context context )
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    //onCreate method.
    public void onCreate(SQLiteDatabase db)
    {
        //Query
        String CREATE_TABLE_STUDENT = "CREATE TABLE " + Entry.TABLE  + "("
                + Entry.KEY_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + Entry.KEY_TITLE + " TEXT, "
                +Entry.KEY_DESCRIPTION+" TEXT, "
                + Entry.KEY_DATE +" TEXT, "
                + Entry.KEY_STATUS + " INTEGER )";

        //Executing query by db.
        db.execSQL(CREATE_TABLE_STUDENT);
    }

    @Override
    //Method to upgrade the database, But here we left it empty because we don't need to upgrade the db in this app.
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
