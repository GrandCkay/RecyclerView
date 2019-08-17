package com.example.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;      // переменная для связывания RecyclerView созданой разметки с кодом
    private RecyclerView.Adapter adapter;        // адаптер управляем "не полным" заполнением RecyclerView
    private RecyclerView.LayoutManager layoutManager;       // управляем расположением елементов RecyclerView


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Создаем ArrayList из елементов класса RecyclerViewItem*/

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();

        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_very_satisfied_black_24dp, "Happy", "Life is happy!"));

        // Добавляем в ArrayList елемент, создаем новый елемент при помощи конструктора RecyclerViewItem (и передаем параметры)

        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Null", "Life is null!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_very_satisfied_black_24dp, "Happy", "Life is happy!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Null", "Life is null!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_very_satisfied_black_24dp, "Happy", "Life is happy!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Null", "Life is null!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_very_satisfied_black_24dp, "Happy", "Life is happy!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Null", "Life is null!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_very_satisfied_black_24dp, "Happy", "Life is happy!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Null", "Life is null!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_very_satisfied_black_24dp, "Happy", "Life is happy!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Null", "Life is null!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_very_satisfied_black_24dp, "Happy", "Life is happy!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Null", "Life is null!"));


        /* Инициализируем поля */

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);     // устанавливаем фиксированные размер RecyclerView
        adapter = new RecyclerViewAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
