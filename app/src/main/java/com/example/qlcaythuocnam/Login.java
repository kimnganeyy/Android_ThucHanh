package com.example.qlcaythuocnam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("SignIn",MODE_PRIVATE);
        CheckBox ckremember = (CheckBox) findViewById(R.id.ckremember);
        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        TextView user = (TextView) findViewById(R.id.editTextUserName);
        TextView pass = (TextView) findViewById(R.id.editTextPassWord);

        user.setText(sharedPreferences.getString("user",""));
        pass.setText(sharedPreferences.getString("pass",""));
        ckremember.setChecked(sharedPreferences.getBoolean("checked",false));

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String use = user.getText().toString();
                String password = pass.getText().toString();
                if(use.equals("admin") && password.equals("admin")){
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    if(ckremember.isChecked()){
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString("user",use);
                        edit.putString("pass",password);
                        edit.putBoolean("checked",true);
                        edit.commit();
                    }else{
                        SharedPreferences.Editor  editor = sharedPreferences.edit();
                        editor.clear();
                        editor.commit();
                    }
                    Intent intent = new Intent(Login.this,MainActivity.class);
                    startActivity(intent);;

                }else{
                    Toast.makeText(getApplicationContext(), "Tên đăng nhập hoặc mật khẩu sai", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}