package com.example.qlsv;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edituser,editpass;
    Button bntlogin,bnthuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edituser = (EditText) findViewById(R.id.edituser);
        editpass = (EditText) findViewById(R.id.editpass);
        bntlogin = (Button) findViewById(R.id.bntlogin);
        bnthuy = (Button) findViewById(R.id.bnthuy);
        bntlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = "admin";
                String password = "admin";
                if (edituser.getText().toString().equals(username) && editpass.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    Intent mh2 = new Intent(MainActivity.this, Quanlysv.class);
                    startActivity(mh2);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Tên đăng nhập hoặc mật khẩu sai", Toast.LENGTH_LONG).show();
                }
            }
        });
        bnthuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}