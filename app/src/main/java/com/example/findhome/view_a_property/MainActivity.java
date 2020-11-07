package com.example.findhome.view_a_property;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.StrictMode;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;

import com.example.findhome.R;
import com.example.findhome.detaild_search.DetaildSearchDialogFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity   {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationPropertie);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_bottom_hotels:
                        ScrollView scrollView  = findViewById(R.id.mainActivity_scrollview);
                         if(scrollView.getScrollY() == 0){
                             DetaildSearchDialogFragment detaildSearchDialogFragment = new DetaildSearchDialogFragment();
                             detaildSearchDialogFragment.show(getSupportFragmentManager(), "myFragment");
                         }else{ scrollView.smoothScrollTo(0, 0); }
                }
                return false;
            }
        });

    }


}