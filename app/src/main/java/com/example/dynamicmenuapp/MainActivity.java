package com.example.dynamicmenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText txtUser;
    private EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnLogin);
        txtUser = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIndexActivity();
            }
        });
    }

    private void openIndexActivity(){

        if(txtUser.getText().toString() == null || txtUser.getText().toString().trim().equals("")){
            Toast.makeText(this.getApplicationContext(),"Debe ingresar un usuario", Toast.LENGTH_LONG).show();
        }else {
            Bundle bundle = new Bundle();
            bundle.putString("user", txtUser.getText().toString());
            Intent intent = new Intent(MainActivity.this, IndexActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

}