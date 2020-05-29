package com.blogging.recycler_view_ex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstBook = new ArrayList<>();
        lstBook.add(new Book("Science","Category Book","Description Book", R.drawable.r1));
        lstBook.add(new Book("Maths","Category Book","Description Book", R.drawable.p2));
        lstBook.add(new Book("Biology","Category Book","Description Book", R.drawable.p3));
        lstBook.add(new Book("Social Science","Category Book","Description Book", R.drawable.p4));
        lstBook.add(new Book("Art Book","Category Book","Description Book", R.drawable.p5));
        lstBook.add(new Book("General Knowledge 2020","Category Book","Description Book", R.drawable.p6));

        lstBook.add(new Book("Science","Category Book","Description Book", R.drawable.r1));
        lstBook.add(new Book("Maths","Category Book","Description Book", R.drawable.p2));
        lstBook.add(new Book("Biology","Category Book","Description Book", R.drawable.p3));
        lstBook.add(new Book("Social Science","Category Book","Description Book", R.drawable.p4));
        lstBook.add(new Book("Art Book","Category Book","Description Book", R.drawable.p5));
        lstBook.add(new Book("General Knowledge 2020","Category Book","Description Book", R.drawable.p6));

        lstBook.add(new Book("Science","Category Book","Description Book", R.drawable.r1));
        lstBook.add(new Book("Maths","Category Book","Description Book", R.drawable.p2));
        lstBook.add(new Book("Biology","Category Book","Description Book", R.drawable.p3));
        lstBook.add(new Book("Social Science","Category Book","Description Book", R.drawable.p4));
        lstBook.add(new Book("Art Book","Category Book","Description Book", R.drawable.p5));
        lstBook.add(new Book("General Knowledge 2020","Category Book","Description Book", R.drawable.p6));

        RecyclerView myrv= (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
