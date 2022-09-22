package com.example.baitap_diemdanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switchbtn = (Button)findViewById(R.id.buttonNhap);
        EditText editTextTen = (EditText)findViewById(R.id.editTextTen);
        EditText editTextMaSv = (EditText)findViewById(R.id.editTextTen);

        switchbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switchActivities(editTextTen.getText().toString(),editTextMaSv.getText().toString());
            }
        });
    }
    private void switchActivities(String msv,String hoten) {
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);

        SinhVien sinhVien = new SinhVien(msv,hoten);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sinhvien", (Serializable) sinhVien);
        switchActivityIntent.putExtra("MSVBundle",bundle);
        //switchActivityIntent.putExtra("MSV",msv);
        startActivity(switchActivityIntent);
    }
}