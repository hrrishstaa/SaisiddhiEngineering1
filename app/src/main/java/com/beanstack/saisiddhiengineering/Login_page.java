package com.beanstack.saisiddhiengineering;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_page extends AppCompatActivity {
Button next,login;
 EditText username,password;
 //TextView back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

      // next = findViewById(R.id.Btn_login_next);
        login = findViewById(R.id.Btn_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
     //  back_btn = findViewById(R.id.back_btn);

      // password.setVisibility(View.INVISIBLE);
     login.setVisibility(View.VISIBLE);
//        back_btn.setVisibility(View.INVISIBLE);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_page.this,MainActivity.class);
                startActivity(intent);
            }
        });
     /*   next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password.setVisibility(View.VISIBLE);
                login.setVisibility(View.VISIBLE);
                back_btn.setVisibility(View.VISIBLE);


                next.setVisibility(View.INVISIBLE);
                username.setVisibility(View.INVISIBLE);

            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password.setVisibility(View.INVISIBLE);
                login.setVisibility(View.INVISIBLE);
                back_btn.setVisibility(View.INVISIBLE);


                next.setVisibility(View.VISIBLE);
                username.setVisibility(View.VISIBLE);
            }
        })*/
    }
}
