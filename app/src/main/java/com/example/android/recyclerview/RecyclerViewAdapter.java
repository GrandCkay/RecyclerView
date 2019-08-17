package com.example.android.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/* Создаем класс RecyclerViewAdapter с суперклассом RecyclerView.Adapter (статичесикй класс). */


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {  // так как RecyclerViewViewHolder статичесикй внутренний класс, он указывается через статичесикй внешний класс - RecyclerViewAdapter.RecyclerViewViewHolder

    private ArrayList<RecyclerViewItem> arrayList; // создаем поле класса ArrayList

    /* Создаем внутренний класс RecyclerViewViewHolder с суперклассом RecyclerView.ViewHolder (статичесикй класс) в классе RecyclerViewAdapter*/

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList) {
        this.arrayList = arrayList;
    }

    /* Передаем данные из arrayList в Adapter при помощи конструктора */

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        /* Передаем разметку CardView в адаптер */

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder recyclerViewViewHolder, int i) {
        RecyclerViewItem recyclerViewItem = arrayList.get(i);


        /* Заполняем елемент RecyclerViewItem данными об изображении и тесте */

        recyclerViewViewHolder.imageView.setImageResource(recyclerViewItem.getImageResource());
        recyclerViewViewHolder.textView1.setText(recyclerViewItem.getText1());
        recyclerViewViewHolder.textView2.setText(recyclerViewItem.getText2());
    }


    /* Передаем значения для полей класса RecyclerViewItem*/

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    /* Возвращаем количество елементов которые содержатся в arrayList */

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

        /* создаем переменные при помощи которых будем обращатся к елементам */

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;


        /* Конструктор по умолчанию для класса RecyclerViewViewHolder */

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);


            /* Связуем переменные с разметкой */

            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}
