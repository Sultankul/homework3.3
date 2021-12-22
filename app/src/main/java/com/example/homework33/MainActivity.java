package com.example.homework33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private AdaterLanguage adaterLanguage;
ArrayList<Information> information = new ArrayList<Information>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        adaterLanguage = new AdaterLanguage(information);
        recyclerView.setAdapter(adaterLanguage);
        loadData();

    }

    private void loadData() {
        information.add(new Information("C++",R.drawable.cplus));
        information.add(new Information("Android",R.drawable.java));
        information.add(new Information("Python",R.drawable.python));
        information.add(new Information("HTML",R.drawable.html));
        information.add(new Information("Kotlin",R.drawable.kotlin));
        information.add(new Information("Java",R.drawable.java));


    }
}