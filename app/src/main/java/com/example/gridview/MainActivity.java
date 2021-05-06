package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grvCat;
    ArrayList<Cat> arrayList;
    CustomAdapter ctAdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grvCat = findViewById(R.id.grvCat);
        arrayList= new ArrayList<>();
        arrayList.add(new Cat("meo  1",3,1245,2,R.drawable.hinh,25));
        arrayList.add(new Cat("meo 2",2,1335,2,R.drawable.hinh_meo,25));
        arrayList.add(new Cat("meo  3",1,1225,2,R.drawable.hinhmeo,25));
        arrayList.add(new Cat("meo  4",3,21245,2,R.drawable.hinh_meoo,50));
        arrayList.add(new Cat("meo 5",5,12645,2,R.drawable.hinhmeo_heo,25));
        arrayList.add(new Cat("meo 6",4,124435,2,R.drawable.hinhmeokhung,25));


        ctAdt = new CustomAdapter(MainActivity.this,R.layout.item_gridview,arrayList);
        grvCat.setAdapter(ctAdt);
    }
}