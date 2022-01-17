package com.example.dynamicmenuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import org.w3c.dom.Text;

public class IndexActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    TextView lblUsername;
    DrawerLayout drwLayout;
    NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navView = (NavigationView) findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);

        View header = navView.getHeaderView(0);
        lblUsername = (TextView) header.findViewById(R.id.lblUsername);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String name = bundle.getString("user");
            lblUsername.setText(name);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drwLayout = (DrawerLayout) findViewById(R.id.mainDrawerLayout);
                drwLayout.openDrawer(GravityCompat.START);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}