package com.example.dynamicmenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {

    TextView txtTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        //txtTest = findViewById(R.id.lblTest);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            //txtTest.setText(bundle.getString("user"));
        }
    }
}