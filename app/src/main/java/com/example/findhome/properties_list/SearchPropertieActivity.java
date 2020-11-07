package com.example.findhome.properties_list;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.findhome.R;
import com.example.findhome.detaild_search.DetaildSearchDialogFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchPropertieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_propertie);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
           Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }




    }


}