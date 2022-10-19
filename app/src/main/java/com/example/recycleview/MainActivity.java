package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(MainActivity.this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();

        List<Product> productListmxh = new ArrayList<>();
        productListmxh.add(new Product(R.drawable.facebook, "FaceBook", "Mạng xã hội"));
        productListmxh.add(new Product(R.drawable.instagram, "Instagram", "Ảnh & Video"));
        productListmxh.add(new Product(R.drawable.telegram, "Telegram", "Mạng xã hội"));
        productListmxh.add(new Product(R.drawable.twitter, "Twitter", "Tin tức"));


        List<Product> productListgame = new ArrayList<>();
        productListgame.add(new Product(R.drawable.hayday, "Hay Day", "Trò chơi"));
        productListgame.add(new Product(R.drawable.subwaysurfers, "Adidas NMD V3", "Hành động"));
        productListgame.add(new Product(R.drawable.mobilelegends, "Adidas UltraBoost", "Hành động"));
        productListgame.add(new Product(R.drawable.among, "Superstar OT Tech Shoe", "Mô phỏng"));
        productListgame.add(new Product(R.drawable.duolingo, "Adidas Yeezy Boost 350 V2 Casual", "Học tập"));

        List<Product> productListtrend = new ArrayList<>();
        productListtrend.add(new Product(R.drawable.google_drive, "Google Drive", "Lưu trữ"));
        productListtrend.add(new Product(R.drawable.inshot, "Inshot", "Ảnh & Video"));
        productListtrend.add(new Product(R.drawable.netflix, "Lebron 17", "Bắt đầu xem"));
        productListtrend.add(new Product(R.drawable.youtube, "Nike Kyrie 6 Concepts Khepri", "Video"));
        productListtrend.add(new Product(R.drawable.tiktok, "Nike Kyrie 7 Ep CQ9327", "Mạng xã hội"));

        listCategory.add(new Category("Mạng xã hội",productListmxh));
        listCategory.add(new Category("Trò chơi miễn phí",productListgame));
        listCategory.add(new Category("Đang thịnh hành",productListtrend));

        return listCategory;

    }
}