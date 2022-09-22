package com.example.baitap_diemdanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button switchbtn = (Button)findViewById(R.id.buttonHuy);
        TextView masv = (TextView)findViewById(R.id.textTen);
        TextView hoten = (TextView)findViewById(R.id.textMaSV);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("MSVBundle");
        SinhVien sinhVien = (SinhVien) bundle.getSerializable("sinhvien");
        //String msv = intent.getStringExtra("MSV");
        String msv = sinhVien.MaSV;
        String stringhoten = sinhVien.HoTen;
        masv.setText("Mã Sinh Viên " + msv);
        hoten.setText("Họ Tên " + stringhoten);
        switchbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }
    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent);
    }
}