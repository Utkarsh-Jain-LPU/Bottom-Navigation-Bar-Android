package com.utkarsh.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Fragment1(),null).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.option1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Fragment1(),null).commit();
                        break;
                    case R.id.option2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Fragment2(),null).commit();
                        break;
                    case R.id.option3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Fragment3(),null).commit();
                        break;
                }
                return true;
            }
        });
    }
}
