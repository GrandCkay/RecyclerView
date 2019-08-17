package com.example.android.recyclerview;

/* Создаем класс RecyclerViewItem и поля CardView для каждого елементов RecyclerView */

public class RecyclerViewItem {

    private int imageResource;
    private String text1;
    private String text2;

    /* Создаем конструктор для елемента CardView и передаем в него параметры значения ресурса*/

    public RecyclerViewItem(int imageResource, String text1, String text2) {
        this.imageResource = imageResource;
        this.text1 = text1;
        this.text2 = text2;
    }

    /* Создаем публичные методы для возможности присваивать значения private параметрам */

    public int getImageResource() {
        return imageResource;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
