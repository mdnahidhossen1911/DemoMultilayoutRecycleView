package com.nahid.demorecyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleview);


        //Array
        ArrayList<Datamodel> arrayList = new ArrayList<>();

        arrayList.add(new Datamodel("a","search"));
        arrayList.add(new Datamodel("b","banner"));
        arrayList.add(new Datamodel("b","banner"));
        arrayList.add(new Datamodel("c","product"));
        arrayList.add(new Datamodel("d","product"));
        arrayList.add(new Datamodel("e","product"));
        arrayList.add(new Datamodel("f","product"));
        arrayList.add(new Datamodel("g","product"));
        arrayList.add(new Datamodel("h","product"));
        arrayList.add(new Datamodel("i","banner"));
        arrayList.add(new Datamodel("j","product"));
        arrayList.add(new Datamodel("k","product"));
        arrayList.add(new Datamodel("l","product"));
        arrayList.add(new Datamodel("l","product"));
        arrayList.add(new Datamodel("b","banner"));


        GridLayoutManager layoutManager = new GridLayoutManager(
                this,2);

       layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
           @Override
           public int getSpanSize(int position) {
               if(arrayList.get(position).getLayoutType() == "search"){
                   return 2;
               }else if(arrayList.get(position).getLayoutType() == "banner"){
                   return 2;
               } else {
                   return 1;
               }
           }
       });

       recyclerView.setLayoutManager(layoutManager);
       recyclerView.setAdapter(new ReAdapter(arrayList));

    }
}