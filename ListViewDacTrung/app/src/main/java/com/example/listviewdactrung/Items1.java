package com.example.listviewdactrung;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Items1 extends AppCompatActivity {
    ListView lv;
    ArrayList<Truyen> ArrayTruyen;
    AdapterTruyen adapter;
    Button back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items1);
        lv = (ListView) findViewById(R.id.listview);
        ArrayTruyen = new ArrayList<>();
        getSelect();
        adapter = new AdapterTruyen(Items1.this, R.layout.activity_items, ArrayTruyen);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ToList(i);
            }
        });
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Items1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    void ToList(int i){
        Intent intent;
        switch (i){
            default: intent = new Intent(this,LastItems1.class);
        }
        startActivity(intent);
    }
    void getSelect(){
        int i = Select.nhanVan;
        switch (i){
            case 0:{
                get0();
                break;
            }
            case 1:{
                get1();
                break;
            }
            case 2:{
                get2();
                break;
            }
            case 3:{
                get3();
                break;
            }
            default: get4();
        }
    }
    void get0(){
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch?? Ph??o","1941","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"2 ?????a tr???","1942","4 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"l??o h???c","1948","2 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"?????i th???a.","1942","5 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch???n l???c","1940","3 sao"));
    }
    void get1(){
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch?? Ph??o","1941","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"2 ?????a tr???","1942","4 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"l??o h???c","1948","2 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"?????i th???a.","1942","5 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch???n l???c","1940","3 sao"));
    }
    void get2(){
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch?? Ph??o","1941","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"2 ?????a tr???","1942","4 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"l??o h???c","1948","2 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"?????i th???a.","1942","5 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch???n l???c","1940","3 sao"));
    }
    void get3(){
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch?? Ph??o","1941","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"2 ?????a tr???","1942","4 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"l??o h???c","1948","2 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"?????i th???a.","1942","5 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch???n l???c","1940","3 sao"));
    }
    void get4(){
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch?? Ph??o","1941","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"2 ?????a tr???","1942","4 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"l??o h???c","1948","2 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"?????i th???a.","1942","5 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Ch???n l???c","1940","3 sao"));
    }
}