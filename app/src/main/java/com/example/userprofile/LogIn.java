package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    EditText editTextUserName, editTextPassWord;
    Button buttonLogin, buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextPassWord = (EditText) findViewById(R.id.editTextPassWord);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonSignup = (Button) findViewById(R.id.buttonSignup);

        //Phát sinh sự kiện OnClick
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "admin";
                String password = "admin";
                if (editTextUserName.getText().toString().equals(username) && editTextPassWord.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    Intent mh2 = new Intent(LogIn.this, MainActivity.class);
                    startActivity(mh2);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Tên đăng nhập hoặc mật khẩu sai", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(LogIn.this, SignUp.class);
                startActivity(mh3);
            }
        });
    }
}