package com.example.kts1_huy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button Thoat;
    ImageView CaNhan,ChiTieuBanHang,KhachHang,DanhSachTuyen,TraCuuSanPham;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thoat = findViewById(R.id.Thoat);
        CaNhan = findViewById(R.id.CaNhan);
        ChiTieuBanHang = findViewById(R.id.ChiTieuBanHang);
        KhachHang = findViewById(R.id.KhachHang);
        DanhSachTuyen = findViewById(R.id.DanhSachTuyen);
        TraCuuSanPham = findViewById(R.id.TraCuuSanPham);

        Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        CaNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

        ChiTieuBanHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i);
            }
        });

        KhachHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(i);
            }
        });

        DanhSachTuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(i);
            }
        });

        TraCuuSanPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,MainActivity6.class);
                startActivity(i);
            }
        });
    }
}