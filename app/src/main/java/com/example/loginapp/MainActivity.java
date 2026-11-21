package com.example.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    // نام کاربری و رمز عبور صحیح
    private static final String USERNAME = "mohamad_mehrizi";
    private static final String PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString();

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                Intent intent = new Intent(this, WelcomeActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
                finish(); // بستن صفحه لاگین
            } else {
                Toast.makeText(this, "Username or password is incorrect!",
                        Toast.LENGTH_SHORT).show();
                etPassword.setText("");
            }
        });
    }
}
