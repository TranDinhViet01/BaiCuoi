package com.example.listviewdactrung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Truyen> ArrayTruyen;
    AdapterTruyen adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        ArrayTruyen = new ArrayList<>();
        ArrayTruyen.add(new Truyen( R.drawable.imagesuser,"Cù Huy Cận","Cù Huy Cận, bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam như Bộ trưởng Bộ Canh nông, Thứ trưởng Bộ Văn hóa Nghệ thuật, Bộ trưởng Bộ Văn hóa Giáo dục, Thứ trưởng Bộ Nội vụ,","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.imagesuser,"Mạc Ngôn","Mạc Ngôn là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ đã được đạo diễn nổi tiếng Trương Nghệ Mưu chuyển thể thành phim.","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.imagesuser,"Shakespeare","William Shakespeare là một nhà văn và nhà viết kịch Anh, được coi là nhà văn vĩ đại nhất của Anh và là nhà viết kịch đi trước thời đại. Ông còn được vinh danh là nhà thơ tiêu biểu của nước Anh","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.imagesuser,"Hemingway.","Ernest Miller Hemingway là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo. Ông là một phần của cộng đồng những người xa xứ ở Paris trong thập niên 20 của thế kỷ XX và là một trong những cựu quân nhân","3 sao"));
        ArrayTruyen.add(new Truyen( R.drawable.imagesuser,"Nam Cao","Nam Cao là một nhà văn và cũng là một chiến sĩ, liệt sĩ người Việt Nam. Ông là nhà văn hiện thực lớn, một nhà báo kháng chiến, một trong những nhà văn tiêu biểu nhất thế kỷ 20.","4 sao"));
        adapter = new AdapterTruyen(MainActivity.this, R.layout.activity_items, ArrayTruyen);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ToList(i);
            }
        });
    }
    void ToList(int i){
        Intent intent;
        Select.nhanVan = i;
        intent = new Intent(this,Items1.class);
        startActivity(intent);
    }
}