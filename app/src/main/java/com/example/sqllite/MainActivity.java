package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sqllite.helper.MyHelper;

public class MainActivity extends AppCompatActivity {
    private EditText etWord, etMeaning;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWord = findViewById(R.id.etWord);
        etMeaning = findViewById(R.id.etmeaning);
        btnAdd = findViewById(R.id.btnword);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MyHelper myHelper= new MyHelper(MainActivity.this);
                SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();
            }
        });
    }


}
